package progressive.tdd.test.auto;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseUtil.BaseClass;
import progressive.tdd.reporting.Logs;

public class AutoQuoteTest extends BaseClass {

	@Test(enabled = true, groups = "auto")
	public void createAutoQuoteTest() throws Exception {
		// homePage.homePageTitle("An Insurance Company You Can Rely On | Progressive");
		// Thread.sleep(3000);
		homePage.validatehomePageText("Welcome to Progressive");
		Thread.sleep(5000);
		homePage.clickpopular();
		Thread.sleep(5000);
		homePage.insertZipCodeField("11373");
		Thread.sleep(5000);
		homePage.getAQuote();
		Thread.sleep(5000);
		addressPage.insertFirstName("mhmd");
		Thread.sleep(5000);
		addressPage.insertLastName("khon");
		Thread.sleep(5000);
		addressPage.insertDOB("01/05/1980");
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

	@Test(enabled = false, priority = 0, groups = { "auto",
			"non-func" }, dependsOnMethods = "test2", ignoreMissingDependencies = true)
	public void test1() {
		Logs.log("Test1");
	}

	@Test(enabled = false, priority = 1, groups = { "auto", "non-func" }, invocationCount = 2)
	public void test2() {
		Logs.log("Test2");

	}

	@Test(enabled = false, priority = 1, groups = { "auto", "non-func" })
	public void failedTestScenario() {
		Logs.log("Test2");

	}

	@Test(enabled = false, priority = 1, groups = { "auto",
			"non-func" }, retryAnalyzer = progressive.tdd.Retry.RetryFailedTests.class)
	public void testRetry() {
		Logs.log("TestRetry");
		Assert.fail();

	}

}
