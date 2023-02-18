package progressive.tdd.common;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Assert;

import progressive.tdd.reporting.Logs;

public class CommonActions {

	private static String actual;
	protected WebDriver driver;

	public CommonActions(WebDriver driver) {
		this.driver = driver;
	}

	public static void click(WebElement element) {
		try {
			element.click();
			Logs.log(element + "---has been clicked");
		} catch (NullPointerException | NoSuchElementException e) {
			Logs.log(element + "---Element not Found");
			Assert.fail();
		}
	}

	public static void validateText(WebElement element, String expected) {
		try {
			String actual = element.getText();
			Logs.log("Validiting---> Actual:***" + actual + "***.Expected:***" + expected + "***");
		} catch (NullPointerException | NoSuchElementException e) {
			Logs.log(element + "---Element not Found");
			Assert.fail();
		}
		Assert.assertEquals(actual, expected);
	}

	public String getPageTitle(String expectedTitle) {
		String actual = driver.getTitle();
		Logs.log("Validiting---> Actual:***" + actual + "***.Expected:***" + expectedTitle + "***");
		Assert.assertEquals(actual, expectedTitle);
		return actual;

	}

	public static void insert(WebElement element, String value) {
		try {
			element.sendKeys(value);
			Logs.log(value + " <--- This value has been passed into ---> " + element);
		} catch (NullPointerException | NoSuchElementException e) {
			Logs.log(element + "---Element not Found");
			Assert.fail();

		}
	}

}
