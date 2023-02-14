package progressive.tdd.common;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Assert;

import progressive.tdd.reporting.Logs;

public class CommonActions {

	protected WebDriver driver;

	public CommonActions(WebDriver driver) {
		this.driver = driver;
	}

	public static void click(WebElement element) {
		element.click();
		Logs.log(element + "---has been clicked");
	}

	public static void validateText(WebElement element, String expected) {
		String actual = element.getText();
		Logs.log("Validiting---> Actual:***" + actual + "***.Expected:***" + expected + "***");
		Assert.assertEquals(actual, expected);
	}

	public String getPageTitle(String expectedTitle) {
		String actual = driver.getTitle();
		Logs.log("Validiting---> Actual:***" + actual + "***.Expected:***" + expectedTitle + "***");
		Assert.assertEquals(actual, expectedTitle);
		return actual;

	}

	public static void insert(WebElement element, String value) {
		element.sendKeys(value);
		Logs.log(value + " <--- This value has been passed into ---> " + element);
	}

}
