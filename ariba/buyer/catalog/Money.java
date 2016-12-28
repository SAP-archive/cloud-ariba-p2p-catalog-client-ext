
package ariba.buyer.catalog;

/**
 * Class for item's money in catalog
 *
 */
public class Money {

	private String amount;
	private String currency;

	/**
	 * Returns amount
	 *
	 * @return amount
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * Sets amount
	 *
	 * @param amount
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * Returns currency
	 *
	 * @return currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * Sets currency
	 *
	 * @param currency
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
