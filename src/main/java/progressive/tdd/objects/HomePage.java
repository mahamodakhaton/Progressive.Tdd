package progressive.tdd.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static progressive.tdd.common.CommonActions.*;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void homePageTitle(String expectedTitle) {
		homePageTitle(expectedTitle);
	}

	@FindBy(tagName = "h1")
	WebElement homepageText;

	public void validatehomePageText(String string) throws Exception {
		homepageText.getText();
	}

	@FindBy(xpath = "//span[text()='Popular']")
	WebElement clickpopular;

	public void clickpopular() throws Exception {
		clickpopular.click();
	}

	@FindBy(xpath = "//input[@id='zipCode_overlay']")
	WebElement insertzipCodeField;

	public void insertZipCodeField(String Zip) throws Exception {
		insert(insertzipCodeField, Zip);
	}

	@FindBy(xpath = "//input[@id='qsButton_overlay']")
	WebElement getAQuote;

	public void getAQuote() throws Exception {
		getAQuote.click();

	}

	@FindBy(xpath = "(//span[@class='last-word'])[2]")
	WebElement clickpropertyElement;

	public void clickPropertyElement() throws Exception {
		clickpropertyElement.click();
	}

}
