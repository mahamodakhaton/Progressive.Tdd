package progressive.tdd.test.property;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import baseUtil.BaseClass;

public class PropertyQuoteTest extends BaseClass {

	@Test (enabled = true)
	public void creatpropertyQoteTest() throws Exception {
		homePage.clickPropertyElement();
		getAQuotePage.insertZipCodeField("11373");
		getAQuotePage.clickgetAQuote();
		Thread.sleep(5000);
		addressPage.insertAddressElement("85-15");
		Thread.sleep(5000);
		addressPage.clickLetsGo();
		Thread.sleep(5000);
		addressPage.insertPropertyAddress("84-11");
		Thread.sleep(5000);
		addressPage.insertApartmentNumber("3g");
		Thread.sleep(5000);
		addressPage.insertCity("Elmhurst");
		Thread.sleep(5000);
		addressPage.clickContinueBtn();
		Thread.sleep(5000);
	}
	
}
