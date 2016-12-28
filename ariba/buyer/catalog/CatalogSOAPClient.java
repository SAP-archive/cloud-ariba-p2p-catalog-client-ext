package ariba.buyer.catalog;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * SOAP client for searching items in catalog.
 */
public class CatalogSOAPClient {

	private static final String NAMESPACE_PREFIX = "urn";
	private static final String NAMESPACE = NAMESPACE_PREFIX + ":Ariba:Buyer:{0}";
	private static final String AUTHORIZATION = "Authorization";
	private static final String BASIC = "Basic ";
	private static final String EMPTY_STRING = "";
	private static final String COMMA = ", ";
	private static final String POINT = ".";

	private static final String DEBUG_CREATING_SOAP_REQUEST_MESSAGE = "Creating SOAP request...";
	private static final String DEBUG_INVOKED_SEARCH_ENDPOINT_MESSAGE = "Invoked search endpoint: {}";
	private static final String DEBUG_CREATED_SOAP_REQUEST_MESSAGE = "Created SOAP request: {}";

	private static final String ERROR_SOAP_CONNECTION_FAIL_MESSAGE = "Could not establish SOAP connection.";
	private static final String ERROR_COULD_NOT_CLOSE_SOAP_CONNECTION_MESSAGE = "Could not close SOAP connection.";
	private static final String ERROR_COULD_NOT_READ_SOAP_MESSAGE = "Could not read SOAP message: {}";
	private static final String ERROR_CATALOG_ITEMS_SEARCHING_FAILED_MESSAGE = "Catalog items searching failed: {0}";
	private static final String ERROR_CATALOG_ITEM_SEARCHING_FAILED_WITH_RESPONSE_MESSAGE = "Catalog item searching failed with response: {0}";
	private static final String ERROR_NAMESPACE_XMLNS_VARIANT_PARAMETER = "namespaceXmlnsVariant";
	private static final String ERROR_PARAMETER_SHOULD_NOT_BE_NULL_OR_EMPTY_MESSAGE = "Parameter [{0}]  should not be null or empty.";
	private static final String ERROR_URL_PARAMETER = "url";
	private static final String ERROR_PASSWORD_PARAMETER = "password";
	private static final String ERROR_USER_NAME_PARAMETER = "userName";
	private static final String ERROR_USER_ID_PARAMETER = "userId";
	private static final String ERROR_ITEM_NUMBER_PARAMETER = "itemNumber";
	private static final String ERROR_OPERATOR_PARAMETER = "operator";
	private static final String ERROR_FIELD_PARAMETER = "field";

	private static final Logger LOGGER = LoggerFactory.getLogger(CatalogSOAPClient.class);

	/**
	 * Used for searching catalog items. Creates request as SOAPMessage object
	 * and submits it to Ariba instance. The response is parsed to CatalogItem
	 * list.
	 *
	 * @param field
	 *            value in XML request for element Field
	 * @param operator
	 *            value in XML request for element Operator
	 * @param itemNumber
	 *            value in XML request for element Values
	 * @param userId
	 *            value in XML request for element UserId
	 * @param userName
	 *            user's name for authorization
	 * @param password
	 *            user's password for authorization
	 * @param url
	 *            WSCatalogItemSearch endpoint (e.g. https://<Ariba
	 *            Instance>/Buyer/soap/<Ariba realm>/WSCatalogItemSearch")
	 * @param namespaceXmlnsVariant
	 *            specific XML namespace variant
	 * @return List with catalog items or empty list if no items found
	 * @throws SOAPException
	 *             if there is problem with connection or request/response
	 *             message
	 * @throws IllegalArgumentException
	 *             if some of parameters are illegal
	 */
	public static List<CatalogItem> search(String field, String operator, String itemNumber, String userId,
			String userName, String password, URL url, String namespaceXmlnsVariant) throws SOAPException {
		handleIllegalParameters(field, operator, itemNumber, userId, userName, password, url, namespaceXmlnsVariant);

		LOGGER.debug(DEBUG_INVOKED_SEARCH_ENDPOINT_MESSAGE, url.toString());

		SOAPConnection connection = null;
		List<CatalogItem> result = null;
		try {
			SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
			connection = soapConnectionFactory.createConnection();

			SOAPMessage soapRequest = createRequest(field, operator, itemNumber, userId, userName, password,
					namespaceXmlnsVariant);
			SOAPMessage soapResponse = connection.call(soapRequest, url);

			validateResponse(soapResponse);

			result = parseToCatalogItemList(soapResponse);
		} catch (SOAPException e) {
			LOGGER.error(ERROR_SOAP_CONNECTION_FAIL_MESSAGE, e);
			throw new SOAPException(ERROR_SOAP_CONNECTION_FAIL_MESSAGE);
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SOAPException e) {
				LOGGER.error(ERROR_COULD_NOT_CLOSE_SOAP_CONNECTION_MESSAGE, e);
			}
		}

		return result;

	}

	private static void handleIllegalParameters(String field, String operator, String itemNumber, String userId,
			String userName, String password, URL url, String namespaceXmlnsVariant) {
		handleIllegalParameter(field, ERROR_FIELD_PARAMETER);
		handleIllegalParameter(operator, ERROR_OPERATOR_PARAMETER);
		handleIllegalParameter(itemNumber, ERROR_ITEM_NUMBER_PARAMETER);
		handleIllegalParameter(userId, ERROR_USER_ID_PARAMETER);
		handleIllegalParameter(userName, ERROR_USER_NAME_PARAMETER);
		handleIllegalParameter(password, ERROR_PASSWORD_PARAMETER);
		handleIllegalParameter(url, ERROR_URL_PARAMETER);
		handleIllegalParameter(namespaceXmlnsVariant, ERROR_NAMESPACE_XMLNS_VARIANT_PARAMETER);

	}

	private static void handleIllegalParameter(Object param, String paramString) {
		if (param == null || param instanceof String && param.equals(EMPTY_STRING)) {
			String message = MessageFormat.format(ERROR_PARAMETER_SHOULD_NOT_BE_NULL_OR_EMPTY_MESSAGE, paramString);
			LOGGER.error(message);
			throw new IllegalArgumentException(message);
		}
	}

	private static SOAPMessage createRequest(String field, String operator, String itemNumber, String userId,
			String userName, String password, String namespaceXmlnsVariant) throws SOAPException {
		LOGGER.debug(DEBUG_CREATING_SOAP_REQUEST_MESSAGE);

		MessageFactory factory = MessageFactory.newInstance();
		SOAPMessage request = factory.createMessage();
		MimeHeaders mimeHeaders = request.getMimeHeaders();
		mimeHeaders.addHeader(AUTHORIZATION, getAuthorizationHeader(userName, password));
		SOAPPart soapPart = request.getSOAPPart();

		SOAPEnvelope envelope = soapPart.getEnvelope();
		envelope.addNamespaceDeclaration(NAMESPACE_PREFIX, MessageFormat.format(NAMESPACE, namespaceXmlnsVariant));

		SOAPBody soapBody = envelope.getBody();
		/**
		 * <pre>
		  Example for adding elements in SOAPBody:
		*
		  1. addChildElements(soapBody, "ElemName"); - adding an element without a value:
		  	<urn:ElemName/>
		*
		  2. addChildElements(soapBody, "ElemName1", "ElemName2", "ElemName3", "ElemName4"); - adding nested elements:
			<urn:ElemName1>
				<urn:ElemName2>
					<urn:ElemName3>
						<urn:ElemName4/>
					</urn:ElemName3>
				</urn:ElemName2>
			</urn:ElemName1>
		*
		  3. addChildElementsWithValue(soapBody, "Value", "ElemName"); - adding an element with a value:
		  	<urn:ElemName>Value</urn:ElemName>
		*
		  4. addChildElementsWithValue(soapBody, "Value4", "ElemName1", "ElemName2", "ElemName3", "ElemName4"); - adding nested elements with a value in the last element:
			<urn:ElemName1>
				<urn:ElemName2>
					<urn:ElemName3>
						<urn:ElemName4>Value4</urn:ElemName4>
					</urn:ElemName3>
				</urn:ElemName2>
			</urn:ElemName1>
		*
		  5. SOAPElement soapElement3 = addChildElements(soapBody, "ElemName1", "ElemName2", "ElemName3"); - adding nested elements with values
		     addChildElementsWithValue(soapElement3, "Value4_1", "ElemName4_1");
		     addChildElements(soapElement3, "ElemName4_2_1", "ElemName4_2_2");
		     addChildElementsWithValue(soapElement3, "Value4_3_2", "ElemName4_3_1", "ElemName4_3_2");
		*
			<urn:ElemName1>
				<urn:ElemName2>
					<urn:ElemName3>
						<urn:ElemName4_1>Value4_1</urn:ElemName4_1>
						<urn:ElemName4_2_1>
							<urn:ElemName4_2_2/>
						</urn:ElemName4_2_1>
						<urn:ElemName4_3_1>
							<urn:ElemName4_3_2>Value4_3_2</urn:ElemName4_3_2>
						</urn:ElemName4_3_1>
					</urn:ElemName3>
				</urn:ElemName2>
			</urn:ElemName1>
		 *
		 * </pre>
		 */

		fillSoapBody(soapBody, field, operator, itemNumber, userId);

		request.saveChanges();

		LOGGER.debug(DEBUG_CREATED_SOAP_REQUEST_MESSAGE, soapMessageToString(request));

		return request;
	}

	private static void fillSoapBody(SOAPElement soapBody, String field, String operator, String itemNumber,
			String userId) throws SOAPException {
		SOAPElement item = addChildElements(soapBody, "WSCatalogItemSearchRequest", "WSCatalogSearchQueryRequest_Item",
				"item");

		addChildSearchTerms(item, field, operator, itemNumber);

		addChildElements(item, "Sort");
		addChildElements(item, "SortDirection");
		addChildElementsWithValue(item, userId, "UserId");
	}

	private static void addChildSearchTerms(SOAPElement item, String field, String operator, String itemNumber)
			throws SOAPException {
		SOAPElement itemSearchTerms = addChildElements(item, "SearchTerms", "item");

		addChildElementsWithValue(itemSearchTerms, field, "Field");
		addChildElementsWithValue(itemSearchTerms, operator, "Operator");
		addChildElementsWithValue(itemSearchTerms, itemNumber, "Values", "item");
	}

	private static void validateResponse(SOAPMessage soapResponse) throws SOAPException {
		SOAPBody soapBody = soapResponse.getSOAPBody();
		Node errorsNode = soapBody.getElementsByTagName("Errors").item(0);

		if (errorsNode == null) {
			String errorMessage = MessageFormat.format(ERROR_CATALOG_ITEM_SEARCHING_FAILED_WITH_RESPONSE_MESSAGE,
					soapMessageToString(soapResponse));
			throw new SOAPException(errorMessage);
		}

		NodeList errorItems = errorsNode.getChildNodes();
		int errorItemsCount = errorItems.getLength();
		if (errorItemsCount > 0) {
			StringBuffer errors = new StringBuffer();
			for (int i = 0; i < errorItemsCount; i++) {
				errors.append(errorItems.item(i).getTextContent());
				errors.append(i < errorItemsCount - 1 ? COMMA : POINT);
			}
			String errorMessage = MessageFormat.format(ERROR_CATALOG_ITEMS_SEARCHING_FAILED_MESSAGE, errors.toString());
			throw new SOAPException(errorMessage);
		}

	}

	private static List<CatalogItem> parseToCatalogItemList(SOAPMessage soapResponse) throws SOAPException {
		SOAPBody soapBody = soapResponse.getSOAPBody();
		Node catalogItemsNode = soapBody.getElementsByTagName("CatalogItems").item(0);

		if (catalogItemsNode == null) {
			String errorMessage = MessageFormat.format(ERROR_CATALOG_ITEM_SEARCHING_FAILED_WITH_RESPONSE_MESSAGE,
					soapMessageToString(soapResponse));
			throw new SOAPException(errorMessage);
		}

		NodeList itemsNodeList = catalogItemsNode.getChildNodes();
		List<CatalogItem> catalogItems = new ArrayList<>(itemsNodeList.getLength());
		for (int i = 0; i < itemsNodeList.getLength(); i++) {
			Node currenItemNode = itemsNodeList.item(i);
			NodeList catalogItemsList = currenItemNode.getChildNodes();

			CatalogItem catalogItem = new CatalogItem();
			for (int j = 0; j < catalogItemsList.getLength(); j++) {
				prepareCatalogItem(catalogItem, catalogItemsList.item(j));
			}
			catalogItems.add(catalogItem);
		}

		return catalogItems;
	}

	private static void prepareCatalogItem(CatalogItem catalogItem, Node catalogItemNode) {
		String nodeValue = catalogItemNode.getTextContent();

		switch (catalogItemNode.getNodeName()) {
		case "Description":
			catalogItem.setDescription(nodeValue);
			break;
		case "SupplierName":
			catalogItem.setSupplierName(nodeValue);
			break;
		case "SupplierPartId":
			catalogItem.setSupplierPartId(nodeValue);
			break;
		case "ManufacturerName":
			catalogItem.setManufacturerName(nodeValue);
			break;
		case "Image":
			catalogItem.setImage(nodeValue);
			break;
		case "ShortName":
			catalogItem.setShortName(nodeValue);
			break;
		case "URL":
			catalogItem.setUrl(nodeValue);
			break;
		case "ContractPrice":
			NodeList contractPriceList = catalogItemNode.getChildNodes();
			Money money = new Money();
			Node moneyNode0 = contractPriceList.item(0);
			Node moneyNode1 = contractPriceList.item(1);

			String currency = "Currency".equals(moneyNode0.getNodeName()) ? moneyNode0.getTextContent()
					: moneyNode1.getTextContent();
			String amount = "Amount".equals(moneyNode0.getNodeName()) ? moneyNode0.getTextContent()
					: moneyNode1.getTextContent();

			money.setAmount(amount);
			money.setCurrency(currency);
			catalogItem.setContractPrice(money);
			break;
		case "ClassificationCode":
			NodeList classificationCodeList = catalogItemNode.getChildNodes().item(0).getChildNodes();
			Node nodeCode0 = classificationCodeList.item(0);
			Node nodeCode1 = classificationCodeList.item(1);

			String codeValue = "Value".equals(nodeCode0.getNodeName()) ? nodeCode0.getTextContent()
					: nodeCode1.getTextContent();

			catalogItem.setClassificationCodeValue(codeValue);
			break;
		case "ManufacturerPartId":
			catalogItem.setManufacturerPartId(nodeValue);
			break;
		case "UnitOfMeasure":
			NodeList unitOfMeasure = catalogItemNode.getChildNodes();
			Node nodeMeasure0 = unitOfMeasure.item(0);
			Node nodeMeasure1 = unitOfMeasure.item(1);

			String value = "Value".equals(nodeMeasure0.getNodeName()) ? nodeMeasure0.getTextContent()
					: nodeMeasure1.getTextContent();

			catalogItem.setUnitOfMeasureValue(value);
			break;
		case "ItemNumber":
			catalogItem.setItemNumber(nodeValue);
			break;
		case "OriginatingLineNumber":
			catalogItem.setOriginatingLineNumber(nodeValue);
			break;
		}

	}

	private static SOAPElement addChildElementsWithValue(SOAPElement currentElement, String newElementValue,
			String... newElementsNames) throws SOAPException {
		for (String elementName : newElementsNames) {
			currentElement = currentElement.addChildElement(elementName, NAMESPACE_PREFIX);
		}
		if (newElementValue != null) {
			currentElement = currentElement.addTextNode(newElementValue);
		}
		return currentElement;
	}

	private static SOAPElement addChildElements(SOAPElement currentElement, String... newElementsNames)
			throws SOAPException {
		return addChildElementsWithValue(currentElement, null, newElementsNames);
	}

	private static String getAuthorizationHeader(String user, String password) {
		StringBuilder authorization = new StringBuilder();
		authorization.append(BASIC).append(user).append(":").append(password);
		return authorization.toString();
	}

	private static String soapMessageToString(SOAPMessage soapMessage) {
		String message = EMPTY_STRING;

		try (ByteArrayOutputStream out = new ByteArrayOutputStream()) {
			soapMessage.writeTo(out);
			message = new String(out.toByteArray());
		} catch (IOException | SOAPException e) {
			LOGGER.error(ERROR_COULD_NOT_READ_SOAP_MESSAGE, e.getMessage());
		}

		return message;
	}

}
