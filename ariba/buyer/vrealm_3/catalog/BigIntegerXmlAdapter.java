package ariba.buyer.vrealm_3.catalog;

import java.math.BigInteger;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class BigIntegerXmlAdapter extends XmlAdapter<String, BigInteger> {

	@Override
	public String marshal(BigInteger bigInteger) throws Exception {
		if (bigInteger != null){
			return bigInteger.toString();
		}
		else {
			return null;
		}
	}

	@Override
	public BigInteger unmarshal(String s) throws Exception {
		try {
			return new BigInteger(s == null ? "0" : s.toString());
		} catch (NumberFormatException e) {
			return null;
		}
	}

	
}
