package progressive.tdd.test.auto;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import baseUtil.BaseClass;
import progressive.tdd.utils.AutoData;

public class ParameterizedTestAuto extends BaseClass {

	@Parameters({ "validatehomepageText", "zipCode", "firstName", "lastName", "dateofBirth" })
	@Test(enabled = false, groups = "auto")
	public void createAutoQuoteTest(String validatepagehomeText, String zipCode, String firstName, String lastName,
			String dateofBirth) throws Exception {
		// homePage.homePageTitle("An Insurance Company You Can Rely On | Progressive");
		// Thread.sleep(3000);
		homePage.validatehomePageText(validatepagehomeText);
		Thread.sleep(5000);
		homePage.clickpopular();
		Thread.sleep(5000);
		homePage.insertZipCodeField(zipCode);
		Thread.sleep(5000);
		homePage.getAQuote();
		Thread.sleep(5000);
		addressPage.insertFirstName(firstName);
		Thread.sleep(5000);
		addressPage.insertLastName(lastName);
		Thread.sleep(5000);
		addressPage.insertDOB(dateofBirth);
		Thread.sleep(5000);
		// addressPage.insertStreetNumberandName("84-11");
		// Thread.sleep(7000);
		// WebElement
		// StreetNumberandName=driver.findElement(By.id("//input[@id='CFV']"));
		// wait.until(ExpectedConditions.elementToBeClickable(StreetNumberandName)).sendKeys("8411ElmhurstAve");
		// Thread.sleep(5000);
		// addressPage.insertapartmentNumber("3f");
		Thread.sleep(5000);
	}

	@Parameters({ "validatehomepageText", "zipCode", "firstName", "lastName", "dateofBirth" })
	@Test(enabled = true, groups = "auto")
	public void createAutoQuoteTest_AutoData(String validatehomepageText, String zipCode, String firstName,
			String lastName, String dateofBirth) throws Exception {
		AutoData autoData = new AutoData(validatehomepageText, zipCode, firstName, lastName, dateofBirth);
		// homePage.homePageTitle("An Insurance Company You Can Rely On | Progressive");
		// Thread.sleep(3000);
		homePage.validatehomePageText(autoData.getValidatehomePageText());
		Thread.sleep(5000);
		homePage.clickpopular();
		Thread.sleep(5000);
		homePage.insertZipCodeField(autoData.getZipCode());
		Thread.sleep(5000);
		homePage.getAQuote();
		Thread.sleep(5000);
		addressPage.insertFirstName(autoData.getFirstName());
		Thread.sleep(5000);
		addressPage.insertLastName(autoData.getLastName());
		Thread.sleep(5000);
		addressPage.insertDOB(autoData.getDateofBirth());
		Thread.sleep(5000);
		// addressPage.insertStreetNumberandName("84-11");
		// Thread.sleep(7000);
		// WebElement
		// StreetNumberandName=driver.findElement(By.id("//input[@id='CFV']"));
		// wait.until(ExpectedConditions.elementToBeClickable(StreetNumberandName)).sendKeys("8411ElmhurstAve");
		// Thread.sleep(5000);
		// addressPage.insertapartmentNumber("3f");
		// Thread.sleep(5000);

	}

}
