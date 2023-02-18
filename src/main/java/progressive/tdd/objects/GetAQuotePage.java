package progressive.tdd.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static progressive.tdd.common.CommonActions.*;

public class GetAQuotePage {
	public GetAQuotePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "//input[@id='H']")
	WebElement clickHomeOwnersElement;

	public void clickHomeOwnersElement(WebElement string) {
		clickHomeOwnersElement.click();
	}

	@FindBy(xpath = "//input[@id='zipCode_overlay_subproducts']")
	WebElement insertZipCodField;

	public void insertZipCodeField(String string) {
		insertZipCodField.sendKeys(string);
	}

	@FindBy(xpath = "//input[@id='qsButton_overlay_subproducts']")
	WebElement clickGetAQuotElement;

	public void clickgetAQuote() {
		clickGetAQuotElement.click();
	}

}
