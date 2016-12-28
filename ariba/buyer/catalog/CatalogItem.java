
package ariba.buyer.catalog;

/**
 * Class for catalog items
 *
 */
public class CatalogItem {

	private String classificationCodeValue;
	private String description;
	private String manufacturerPartId;
	private String supplierName;
	private String supplierPartId;
	private String unitOfMeasureValue;
	private String itemNumber;
	private String originatingLineNumber;
	private String manufacturerName;
	private String image;
	private String shortName;
	private String url;
	private Money contractPrice;

	/**
	 * Returns classification code value
	 *
	 * @return classification code value
	 */
	public String getClassificationCodeValue() {
		return classificationCodeValue;
	}

	/**
	 * Sets classification code value
	 *
	 * @param classificationCodeValue
	 */
	public void setClassificationCodeValue(String classificationCodeValue) {
		this.classificationCodeValue = classificationCodeValue;
	}

	/**
	 * Returns description
	 *
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets description
	 *
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Returns manufacturer part Id
	 *
	 * @return manufacturer part Id
	 */
	public String getManufacturerPartId() {
		return manufacturerPartId;
	}

	/**
	 * Sets manufacturer part Id
	 *
	 * @param manufacturerPartId
	 */
	public void setManufacturerPartId(String manufacturerPartId) {
		this.manufacturerPartId = manufacturerPartId;
	}

	/**
	 * Returns supplier name
	 *
	 * @return supplier name
	 */
	public String getSupplierName() {
		return supplierName;
	}

	/**
	 * Sets supplier name
	 *
	 * @param supplierName
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	/**
	 * Returns supplier part id
	 *
	 * @return supplier part id
	 */
	public String getSupplierPartId() {
		return supplierPartId;
	}

	/**
	 * Sets supplier part id
	 *
	 * @param supplierPartId
	 */
	public void setSupplierPartId(String supplierPartId) {
		this.supplierPartId = supplierPartId;
	}

	/**
	 * Returns unit of measure value
	 *
	 * @return unit of measure value
	 */
	public String getUnitOfMeasureValue() {
		return unitOfMeasureValue;
	}

	/**
	 * Sets unit of measure value
	 *
	 * @param unitOfMeasureValue
	 */
	public void setUnitOfMeasureValue(String unitOfMeasureValue) {
		this.unitOfMeasureValue = unitOfMeasureValue;
	}

	/**
	 * Returns item number
	 *
	 * @return item number
	 */
	public String getItemNumber() {
		return itemNumber;
	}

	/**
	 * Sets item number
	 *
	 * @param itemNumber
	 */
	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	/**
	 * Returns originating line number
	 *
	 * @return originating line number
	 */
	public String getOriginatingLineNumber() {
		return originatingLineNumber;
	}

	/**
	 * Sets originating line number
	 *
	 * @param originatingLineNumber
	 */
	public void setOriginatingLineNumber(String originatingLineNumber) {
		this.originatingLineNumber = originatingLineNumber;
	}

	/**
	 * Returns manufacturer name
	 *
	 * @return manufacturer name
	 */
	public String getManufacturerName() {
		return manufacturerName;
	}

	/**
	 * Sets manufacturer name
	 *
	 * @param manufacturerName
	 */
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	/**
	 * Returns image
	 *
	 * @return image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * Sets image
	 *
	 * @param image
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * Returns short name
	 *
	 * @return short name
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * Sets short name
	 *
	 * @param shortName
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	/**
	 * Returns URL
	 *
	 * @return URL
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Sets url
	 *
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Returns contract price
	 *
	 * @return contract price
	 */
	public Money getContractPrice() {
		return contractPrice;
	}

	/**
	 * Sets contract price
	 *
	 * @param contractPrice
	 */
	public void setContractPrice(Money contractPrice) {
		this.contractPrice = contractPrice;
	}

}
