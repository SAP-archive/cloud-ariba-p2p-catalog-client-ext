
package ariba.buyer.vrealm_3.catalog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="WSCatalogSearchQueryRequest_Item" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{urn:Ariba:Buyer:vrealm_3}WSCatalogSearchQueryRequest" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="partition" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="variant" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "WSCatalogItemSearchRequest")
public class WSCatalogItemSearchRequest {

    @XmlElement(name = "WSCatalogSearchQueryRequest_Item")
    protected WSCatalogItemSearchRequest.WSCatalogSearchQueryRequestItem wsCatalogSearchQueryRequestItem;
    @XmlAttribute(name = "partition")
    protected String partition;
    @XmlAttribute(name = "variant")
    protected String variant;

    /**
     * Gets the value of the wsCatalogSearchQueryRequestItem property.
     * 
     * @return
     *     possible object is
     *     {@link WSCatalogItemSearchRequest.WSCatalogSearchQueryRequestItem }
     *     
     */
    public WSCatalogItemSearchRequest.WSCatalogSearchQueryRequestItem getWSCatalogSearchQueryRequestItem() {
        return wsCatalogSearchQueryRequestItem;
    }

    /**
     * Sets the value of the wsCatalogSearchQueryRequestItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCatalogItemSearchRequest.WSCatalogSearchQueryRequestItem }
     *     
     */
    public void setWSCatalogSearchQueryRequestItem(WSCatalogItemSearchRequest.WSCatalogSearchQueryRequestItem value) {
        this.wsCatalogSearchQueryRequestItem = value;
    }

    /**
     * Gets the value of the partition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartition() {
        return partition;
    }

    /**
     * Sets the value of the partition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartition(String value) {
        this.partition = value;
    }

    /**
     * Gets the value of the variant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariant() {
        return variant;
    }

    /**
     * Sets the value of the variant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariant(String value) {
        this.variant = value;
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
     *         &lt;element name="item" type="{urn:Ariba:Buyer:vrealm_3}WSCatalogSearchQueryRequest" minOccurs="0"/&gt;
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
    public static class WSCatalogSearchQueryRequestItem {

        protected WSCatalogSearchQueryRequest item;

        /**
         * Gets the value of the item property.
         * 
         * @return
         *     possible object is
         *     {@link WSCatalogSearchQueryRequest }
         *     
         */
        public WSCatalogSearchQueryRequest getItem() {
            return item;
        }

        /**
         * Sets the value of the item property.
         * 
         * @param value
         *     allowed object is
         *     {@link WSCatalogSearchQueryRequest }
         *     
         */
        public void setItem(WSCatalogSearchQueryRequest value) {
            this.item = value;
        }

    }

}
