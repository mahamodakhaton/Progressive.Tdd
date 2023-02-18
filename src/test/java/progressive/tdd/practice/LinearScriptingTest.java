package progressive.tdd.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinearScriptingTest {
	WebDriver driver;
	private WebElement startAquotebtn;

	@BeforeMethod
	public void init() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.walmart.com/");
		driver.manage().window().maximize();

	}

	@Test
	public void linearScripting() {
		WebElement startAquoteBtn = driver.findElement(By.id(null));
		startAquoteBtn.click();
	}

	@Test
	public void linerScripting() {
		WebElement startAquotebtn = driver.findElement(By.id(null));
		startAquotebtn.click();
	}

}
