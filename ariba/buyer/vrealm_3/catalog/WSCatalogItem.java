
package ariba.buyer.vrealm_3.catalog;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSCatalogItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSCatalogItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="ApplicableContracts" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AribaInternalIsContractOrderable" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AribaInternalMAId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Availability" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BuyerPartId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CatalogName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CatalogTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ClassificationCode"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{urn:Ariba:Buyer:vrealm_3}WSDomainValuePair" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ContractPrice" type="{urn:Ariba:Buyer:vrealm_3}WSMoney"/&gt;
 *         &lt;element name="ConversionFactor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Demo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ErrorSeverity"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ExtrinsicAttributes"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{urn:Ariba:Buyer:vrealm_3}WSExtrinsicAttribute" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Filtered" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HazmatSheet" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Image" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InKitOnly" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InternalPartId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ItemNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LeadTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LinkedBuyerFacility" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LinkedBuyerPart" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ManufacturerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ManufacturerPartId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ManufacturerURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NonContractPrice" type="{urn:Ariba:Buyer:vrealm_3}WSMoney"/&gt;
 *         &lt;element name="OriginatingColumnNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OriginatingLineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Partial" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PreviewFilterName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PreviewFiltered" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Price" type="{urn:Ariba:Buyer:vrealm_3}WSMoney"/&gt;
 *         &lt;element name="PriceBasisQuantity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PriceBasisQuantityDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PriceBasisQuantityUOM" type="{urn:Ariba:Buyer:vrealm_3}WSDomainValuePair"/&gt;
 *         &lt;element name="ProcureItemType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PropertiesMask" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PunchoutEnabled" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PunchoutLevel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PunchoutStore" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ReportingPath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ShortName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SpecSheet" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SubscriptionVersionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SupplierId"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{urn:Ariba:Buyer:vrealm_3}WSDomainValuePair" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SupplierName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SupplierPartAuxiliaryId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SupplierPartId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TerritoryAvailable"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Thumbnail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UnitOfMeasure" type="{urn:Ariba:Buyer:vrealm_3}WSDomainValuePair"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSCatalogItem", propOrder = {

})
public class WSCatalogItem {

    @XmlElement(name = "ApplicableContracts", required = true)
    protected String applicableContracts;
    @XmlElement(name = "AribaInternalIsContractOrderable", required = true)
    protected String aribaInternalIsContractOrderable;
    @XmlElement(name = "AribaInternalMAId", required = true)
    protected String aribaInternalMAId;
    @XmlElement(name = "Availability", required = true)
    protected String availability;
    @XmlElement(name = "BuyerPartId", required = true)
    protected String buyerPartId;
    @XmlElement(name = "CatalogName", required = true)
    protected String catalogName;
    @XmlElement(name = "CatalogTypeName", required = true)
    protected String catalogTypeName;
    @XmlElement(name = "ClassificationCode", required = true)
    protected WSCatalogItem.ClassificationCode classificationCode;
    @XmlElement(name = "ContractPrice", required = true)
    protected WSMoney contractPrice;
    @XmlElement(name = "ConversionFactor", required = true)
    protected String conversionFactor;
    @XmlElement(name = "Demo", required = true)
    protected String demo;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "EffectiveDate", required = true)
    protected String effectiveDate;
    @XmlElement(name = "ErrorSeverity", required = true)
    protected WSCatalogItem.ErrorSeverity errorSeverity;
    @XmlElement(name = "ExpirationDate", required = true)
    protected String expirationDate;
    @XmlElement(name = "ExtrinsicAttributes", required = true)
    protected WSCatalogItem.ExtrinsicAttributes extrinsicAttributes;
    @XmlElement(name = "Filtered", required = true)
    protected String filtered;
    @XmlElement(name = "HazmatSheet", required = true)
    protected String hazmatSheet;
    @XmlElement(name = "Image", required = true)
    protected String image;
    @XmlElement(name = "InKitOnly", required = true)
    protected String inKitOnly;
    @XmlElement(name = "InternalPartId", required = true)
    protected String internalPartId;
    @XmlElement(name = "ItemNumber", required = true)
    protected String itemNumber;
    @XmlElement(name = "Key", required = true)
    protected String key;
    @XmlElement(name = "Language", required = true)
    protected String language;
    @XmlElement(name = "LeadTime", required = true)
    protected String leadTime;
    @XmlElement(name = "LinkedBuyerFacility", required = true)
    protected String linkedBuyerFacility;
    @XmlElement(name = "LinkedBuyerPart", required = true)
    protected String linkedBuyerPart;
    @XmlElement(name = "ManufacturerName", required = true)
    protected String manufacturerName;
    @XmlElement(name = "ManufacturerPartId", required = true)
    protected String manufacturerPartId;
    @XmlElement(name = "ManufacturerURL", required = true)
    protected String manufacturerURL;
    @XmlElement(name = "NonContractPrice", required = true)
    protected WSMoney nonContractPrice;
    @XmlElement(name = "OriginatingColumnNumber", required = true)
    protected String originatingColumnNumber;
    @XmlElement(name = "OriginatingLineNumber", required = true)
    protected String originatingLineNumber;
    @XmlElement(name = "Partial", required = true)
    protected String partial;
    @XmlElement(name = "PreviewFilterName", required = true)
    protected String previewFilterName;
    @XmlElement(name = "PreviewFiltered", required = true)
    protected String previewFiltered;
    @XmlElement(name = "Price", required = true)
    protected WSMoney price;
    @XmlElement(name = "PriceBasisQuantity", required = true)
    protected String priceBasisQuantity;
    @XmlElement(name = "PriceBasisQuantityDesc", required = true)
    protected String priceBasisQuantityDesc;
    @XmlElement(name = "PriceBasisQuantityUOM", required = true)
    protected WSDomainValuePair priceBasisQuantityUOM;
    @XmlElement(name = "ProcureItemType", required = true)
    protected String procureItemType;
    @XmlElement(name = "PropertiesMask", required = true)
    protected String propertiesMask;
    @XmlElement(name = "PunchoutEnabled", required = true)
    protected String punchoutEnabled;
    @XmlElement(name = "PunchoutLevel", required = true)
    protected String punchoutLevel;
    @XmlElement(name = "PunchoutStore", required = true)
    protected String punchoutStore;
    @XmlElement(name = "ReportingPath", required = true)
    protected String reportingPath;
    @XmlElement(name = "ShortName", required = true)
    protected String shortName;
    @XmlElement(name = "SpecSheet", required = true)
    protected String specSheet;
    @XmlElement(name = "SubscriptionVersionId", required = true)
    protected String subscriptionVersionId;
    @XmlElement(name = "SupplierId", required = true)
    protected WSCatalogItem.SupplierId supplierId;
    @XmlElement(name = "SupplierName", required = true)
    protected String supplierName;
    @XmlElement(name = "SupplierPartAuxiliaryId", required = true)
    protected String supplierPartAuxiliaryId;
    @XmlElement(name = "SupplierPartId", required = true)
    protected String supplierPartId;
    @XmlElement(name = "TerritoryAvailable", required = true)
    protected WSCatalogItem.TerritoryAvailable territoryAvailable;
    @XmlElement(name = "Thumbnail", required = true)
    protected String thumbnail;
    @XmlElement(name = "URL", required = true)
    protected String url;
    @XmlElement(name = "UnitOfMeasure", required = true)
    protected WSDomainValuePair unitOfMeasure;

    /**
     * Gets the value of the applicableContracts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableContracts() {
        return applicableContracts;
    }

    /**
     * Sets the value of the applicableContracts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableContracts(String value) {
        this.applicableContracts = value;
    }

    /**
     * Gets the value of the aribaInternalIsContractOrderable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAribaInternalIsContractOrderable() {
        return aribaInternalIsContractOrderable;
    }

    /**
     * Sets the value of the aribaInternalIsContractOrderable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAribaInternalIsContractOrderable(String value) {
        this.aribaInternalIsContractOrderable = value;
    }

    /**
     * Gets the value of the aribaInternalMAId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAribaInternalMAId() {
        return aribaInternalMAId;
    }

    /**
     * Sets the value of the aribaInternalMAId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAribaInternalMAId(String value) {
        this.aribaInternalMAId = value;
    }

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailability(String value) {
        this.availability = value;
    }

    /**
     * Gets the value of the buyerPartId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerPartId() {
        return buyerPartId;
    }

    /**
     * Sets the value of the buyerPartId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerPartId(String value) {
        this.buyerPartId = value;
    }

    /**
     * Gets the value of the catalogName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogName() {
        return catalogName;
    }

    /**
     * Sets the value of the catalogName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogName(String value) {
        this.catalogName = value;
    }

    /**
     * Gets the value of the catalogTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogTypeName() {
        return catalogTypeName;
    }

    /**
     * Sets the value of the catalogTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogTypeName(String value) {
        this.catalogTypeName = value;
    }

    /**
     * Gets the value of the classificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link WSCatalogItem.ClassificationCode }
     *     
     */
    public WSCatalogItem.ClassificationCode getClassificationCode() {
        return classificationCode;
    }

    /**
     * Sets the value of the classificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCatalogItem.ClassificationCode }
     *     
     */
    public void setClassificationCode(WSCatalogItem.ClassificationCode value) {
        this.classificationCode = value;
    }

    /**
     * Gets the value of the contractPrice property.
     * 
     * @return
     *     possible object is
     *     {@link WSMoney }
     *     
     */
    public WSMoney getContractPrice() {
        return contractPrice;
    }

    /**
     * Sets the value of the contractPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSMoney }
     *     
     */
    public void setContractPrice(WSMoney value) {
        this.contractPrice = value;
    }

    /**
     * Gets the value of the conversionFactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversionFactor() {
        return conversionFactor;
    }

    /**
     * Sets the value of the conversionFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversionFactor(String value) {
        this.conversionFactor = value;
    }

    /**
     * Gets the value of the demo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemo() {
        return demo;
    }

    /**
     * Sets the value of the demo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDemo(String value) {
        this.demo = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the errorSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link WSCatalogItem.ErrorSeverity }
     *     
     */
    public WSCatalogItem.ErrorSeverity getErrorSeverity() {
        return errorSeverity;
    }

    /**
     * Sets the value of the errorSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCatalogItem.ErrorSeverity }
     *     
     */
    public void setErrorSeverity(WSCatalogItem.ErrorSeverity value) {
        this.errorSeverity = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the extrinsicAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link WSCatalogItem.ExtrinsicAttributes }
     *     
     */
    public WSCatalogItem.ExtrinsicAttributes getExtrinsicAttributes() {
        return extrinsicAttributes;
    }

    /**
     * Sets the value of the extrinsicAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCatalogItem.ExtrinsicAttributes }
     *     
     */
    public void setExtrinsicAttributes(WSCatalogItem.ExtrinsicAttributes value) {
        this.extrinsicAttributes = value;
    }

    /**
     * Gets the value of the filtered property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiltered() {
        return filtered;
    }

    /**
     * Sets the value of the filtered property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiltered(String value) {
        this.filtered = value;
    }

    /**
     * Gets the value of the hazmatSheet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazmatSheet() {
        return hazmatSheet;
    }

    /**
     * Sets the value of the hazmatSheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazmatSheet(String value) {
        this.hazmatSheet = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImage(String value) {
        this.image = value;
    }

    /**
     * Gets the value of the inKitOnly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInKitOnly() {
        return inKitOnly;
    }

    /**
     * Sets the value of the inKitOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInKitOnly(String value) {
        this.inKitOnly = value;
    }

    /**
     * Gets the value of the internalPartId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalPartId() {
        return internalPartId;
    }

    /**
     * Sets the value of the internalPartId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalPartId(String value) {
        this.internalPartId = value;
    }

    /**
     * Gets the value of the itemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNumber() {
        return itemNumber;
    }

    /**
     * Sets the value of the itemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNumber(String value) {
        this.itemNumber = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the leadTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadTime() {
        return leadTime;
    }

    /**
     * Sets the value of the leadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadTime(String value) {
        this.leadTime = value;
    }

    /**
     * Gets the value of the linkedBuyerFacility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedBuyerFacility() {
        return linkedBuyerFacility;
    }

    /**
     * Sets the value of the linkedBuyerFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedBuyerFacility(String value) {
        this.linkedBuyerFacility = value;
    }

    /**
     * Gets the value of the linkedBuyerPart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedBuyerPart() {
        return linkedBuyerPart;
    }

    /**
     * Sets the value of the linkedBuyerPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedBuyerPart(String value) {
        this.linkedBuyerPart = value;
    }

    /**
     * Gets the value of the manufacturerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerName() {
        return manufacturerName;
    }

    /**
     * Sets the value of the manufacturerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerName(String value) {
        this.manufacturerName = value;
    }

    /**
     * Gets the value of the manufacturerPartId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerPartId() {
        return manufacturerPartId;
    }

    /**
     * Sets the value of the manufacturerPartId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerPartId(String value) {
        this.manufacturerPartId = value;
    }

    /**
     * Gets the value of the manufacturerURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerURL() {
        return manufacturerURL;
    }

    /**
     * Sets the value of the manufacturerURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerURL(String value) {
        this.manufacturerURL = value;
    }

    /**
     * Gets the value of the nonContractPrice property.
     * 
     * @return
     *     possible object is
     *     {@link WSMoney }
     *     
     */
    public WSMoney getNonContractPrice() {
        return nonContractPrice;
    }

    /**
     * Sets the value of the nonContractPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSMoney }
     *     
     */
    public void setNonContractPrice(WSMoney value) {
        this.nonContractPrice = value;
    }

    /**
     * Gets the value of the originatingColumnNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingColumnNumber() {
        return originatingColumnNumber;
    }

    /**
     * Sets the value of the originatingColumnNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingColumnNumber(String value) {
        this.originatingColumnNumber = value;
    }

    /**
     * Gets the value of the originatingLineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingLineNumber() {
        return originatingLineNumber;
    }

    /**
     * Sets the value of the originatingLineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingLineNumber(String value) {
        this.originatingLineNumber = value;
    }

    /**
     * Gets the value of the partial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartial() {
        return partial;
    }

    /**
     * Sets the value of the partial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartial(String value) {
        this.partial = value;
    }

    /**
     * Gets the value of the previewFilterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviewFilterName() {
        return previewFilterName;
    }

    /**
     * Sets the value of the previewFilterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviewFilterName(String value) {
        this.previewFilterName = value;
    }

    /**
     * Gets the value of the previewFiltered property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviewFiltered() {
        return previewFiltered;
    }

    /**
     * Sets the value of the previewFiltered property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviewFiltered(String value) {
        this.previewFiltered = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link WSMoney }
     *     
     */
    public WSMoney getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSMoney }
     *     
     */
    public void setPrice(WSMoney value) {
        this.price = value;
    }

    /**
     * Gets the value of the priceBasisQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceBasisQuantity() {
        return priceBasisQuantity;
    }

    /**
     * Sets the value of the priceBasisQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceBasisQuantity(String value) {
        this.priceBasisQuantity = value;
    }

    /**
     * Gets the value of the priceBasisQuantityDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceBasisQuantityDesc() {
        return priceBasisQuantityDesc;
    }

    /**
     * Sets the value of the priceBasisQuantityDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceBasisQuantityDesc(String value) {
        this.priceBasisQuantityDesc = value;
    }

    /**
     * Gets the value of the priceBasisQuantityUOM property.
     * 
     * @return
     *     possible object is
     *     {@link WSDomainValuePair }
     *     
     */
    public WSDomainValuePair getPriceBasisQuantityUOM() {
        return priceBasisQuantityUOM;
    }

    /**
     * Sets the value of the priceBasisQuantityUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSDomainValuePair }
     *     
     */
    public void setPriceBasisQuantityUOM(WSDomainValuePair value) {
        this.priceBasisQuantityUOM = value;
    }

    /**
     * Gets the value of the procureItemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcureItemType() {
        return procureItemType;
    }

    /**
     * Sets the value of the procureItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcureItemType(String value) {
        this.procureItemType = value;
    }

    /**
     * Gets the value of the propertiesMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertiesMask() {
        return propertiesMask;
    }

    /**
     * Sets the value of the propertiesMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertiesMask(String value) {
        this.propertiesMask = value;
    }

    /**
     * Gets the value of the punchoutEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPunchoutEnabled() {
        return punchoutEnabled;
    }

    /**
     * Sets the value of the punchoutEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPunchoutEnabled(String value) {
        this.punchoutEnabled = value;
    }

    /**
     * Gets the value of the punchoutLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPunchoutLevel() {
        return punchoutLevel;
    }

    /**
     * Sets the value of the punchoutLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPunchoutLevel(String value) {
        this.punchoutLevel = value;
    }

    /**
     * Gets the value of the punchoutStore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPunchoutStore() {
        return punchoutStore;
    }

    /**
     * Sets the value of the punchoutStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPunchoutStore(String value) {
        this.punchoutStore = value;
    }

    /**
     * Gets the value of the reportingPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingPath() {
        return reportingPath;
    }

    /**
     * Sets the value of the reportingPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingPath(String value) {
        this.reportingPath = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the specSheet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSheet() {
        return specSheet;
    }

    /**
     * Sets the value of the specSheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSheet(String value) {
        this.specSheet = value;
    }

    /**
     * Gets the value of the subscriptionVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionVersionId() {
        return subscriptionVersionId;
    }

    /**
     * Sets the value of the subscriptionVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionVersionId(String value) {
        this.subscriptionVersionId = value;
    }

    /**
     * Gets the value of the supplierId property.
     * 
     * @return
     *     possible object is
     *     {@link WSCatalogItem.SupplierId }
     *     
     */
    public WSCatalogItem.SupplierId getSupplierId() {
        return supplierId;
    }

    /**
     * Sets the value of the supplierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCatalogItem.SupplierId }
     *     
     */
    public void setSupplierId(WSCatalogItem.SupplierId value) {
        this.supplierId = value;
    }

    /**
     * Gets the value of the supplierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * Sets the value of the supplierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierName(String value) {
        this.supplierName = value;
    }

    /**
     * Gets the value of the supplierPartAuxiliaryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierPartAuxiliaryId() {
        return supplierPartAuxiliaryId;
    }

    /**
     * Sets the value of the supplierPartAuxiliaryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierPartAuxiliaryId(String value) {
        this.supplierPartAuxiliaryId = value;
    }

    /**
     * Gets the value of the supplierPartId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierPartId() {
        return supplierPartId;
    }

    /**
     * Sets the value of the supplierPartId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierPartId(String value) {
        this.supplierPartId = value;
    }

    /**
     * Gets the value of the territoryAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link WSCatalogItem.TerritoryAvailable }
     *     
     */
    public WSCatalogItem.TerritoryAvailable getTerritoryAvailable() {
        return territoryAvailable;
    }

    /**
     * Sets the value of the territoryAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCatalogItem.TerritoryAvailable }
     *     
     */
    public void setTerritoryAvailable(WSCatalogItem.TerritoryAvailable value) {
        this.territoryAvailable = value;
    }

    /**
     * Gets the value of the thumbnail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * Sets the value of the thumbnail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbnail(String value) {
        this.thumbnail = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link WSDomainValuePair }
     *     
     */
    public WSDomainValuePair getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSDomainValuePair }
     *     
     */
    public void setUnitOfMeasure(WSDomainValuePair value) {
        this.unitOfMeasure = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="item" type="{urn:Ariba:Buyer:vrealm_3}WSDomainValuePair" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class ClassificationCode {

        @XmlElement(required = true)
        protected List<WSDomainValuePair> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WSDomainValuePair }
         * 
         * 
         */
        public List<WSDomainValuePair> getItem() {
            if (item == null) {
                item = new ArrayList<WSDomainValuePair>();
            }
            return this.item;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class ErrorSeverity {

        @XmlElement(required = true)
        protected List<String> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getItem() {
            if (item == null) {
                item = new ArrayList<String>();
            }
            return this.item;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="item" type="{urn:Ariba:Buyer:vrealm_3}WSExtrinsicAttribute" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class ExtrinsicAttributes {

        @XmlElement(required = true)
        protected List<WSExtrinsicAttribute> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WSExtrinsicAttribute }
         * 
         * 
         */
        public List<WSExtrinsicAttribute> getItem() {
            if (item == null) {
                item = new ArrayList<WSExtrinsicAttribute>();
            }
            return this.item;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="item" type="{urn:Ariba:Buyer:vrealm_3}WSDomainValuePair" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class SupplierId {

        @XmlElement(required = true)
        protected List<WSDomainValuePair> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WSDomainValuePair }
         * 
         * 
         */
        public List<WSDomainValuePair> getItem() {
            if (item == null) {
                item = new ArrayList<WSDomainValuePair>();
            }
            return this.item;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class TerritoryAvailable {

        @XmlElement(required = true)
        protected List<String> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getItem() {
            if (item == null) {
                item = new ArrayList<String>();
            }
            return this.item;
        }

    }

}
