package progressive.tdd.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fasterxml.jackson.core.sym.Name;
import com.github.dockerjava.api.model.Driver;

import static progressive.tdd.common.CommonActions.*;

import java.time.Duration;

public class AddressPage {

	public AddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "NameAndAddressEdit_embedded_questions_list_FirstName")
	WebElement inputFirstNamElement;

	public void insertFirstName(String name) throws Exception {
		insert(inputFirstNamElement, name);

	}

	@FindBy(name = "NameAndAddressEdit_embedded_questions_list_LastName")
	WebElement inputLastNamElement;

	public void insertLastName(String name) {
		insert(inputLastNamElement, name);
	}

	@FindBy(name = "NameAndAddressEdit_embedded_questions_list_DateOfBirth")
	WebElement inputDOBElement;

	public void insertDOB(String DOB) {
		insert(inputDOBElement, DOB);

	}

	@FindBy(name = "NameAndAddressEdit_embedded_questions_list_MailingAddress")
	WebElement insertStreenNumberandName;

	public void insertStreetNumberandName(String Number) {
		insert(insertStreenNumberandName, Number);

	}

	@FindBy(xpath = "(//div[@class='placeholder'])[6]")
	WebElement apartmentNumber;

	public void insertapartmentNumber(String number) {
		insert(apartmentNumber, number);

	}

	@FindBy(xpath = "//input[@name='SingleLineAddressSearch']")
	WebElement insertAddressElement;

	public void insertAddressElement(String Number) {
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		//wait.until(ExpectedConditions.elementToBeClickable(insertAddressElement));
		insert(insertAddressElement, Number);
		
	}

	@FindBy(xpath = "(//input[@name='paButton'])[1]")
	WebElement clickletsGo;

	public void clickLetsGo() {
		clickletsGo.click();
	}
	@FindBy(xpath = "(//input[@name='AddressLine1'])[2]")
	WebElement insertPropertyAddress;
	public void insertPropertyAddress(String number) {
		insert(insertPropertyAddress,number);
	}
	@FindBy(xpath = "//input[@id='addressLine2Modal']")
	WebElement insertApartmentNumber;
	public void insertApartmentNumber(String number) {
		insert(insertApartmentNumber,number);
	}
	@FindBy(xpath = "//input[@id='cityModal']")
	WebElement insertCity;
	
	public void insertCity(String name) {
		insert(insertCity,name);
		
	}
	@FindBy(id = "paModalButton")
	WebElement clickContinueBtn;
	public void clickContinueBtn() {
		clickContinueBtn.click();
	}
	
	

}
