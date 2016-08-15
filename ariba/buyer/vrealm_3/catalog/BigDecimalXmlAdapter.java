package ariba.buyer.vrealm_3.catalog;

import java.math.BigDecimal;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class BigDecimalXmlAdapter extends XmlAdapter<String, BigDecimal> {

	@Override
	public String marshal(BigDecimal bigDecimal) throws Exception {
		if (bigDecimal != null){
			return bigDecimal.toString();
		}
		else {
			return null;
		}
	}

	@Override
	public BigDecimal unmarshal(String s) throws Exception {
		try {
			return new BigDecimal(s == null ? "0" : s.toString());
		} catch (NumberFormatException e) {
			return null;
		}
	}

	
}
