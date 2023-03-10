package baseUtil;

import static progressive.tdd.utils.IConstant.*;
import java.lang.reflect.Method;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import com.aventstack.extentreports.Status;
import io.github.bonigarcia.wdm.WebDriverManager;
import progressive.tdd.common.CommonActions;
import progressive.tdd.objects.AddressPage;
import progressive.tdd.objects.GetAQuotePage;
import progressive.tdd.objects.HomePage;
import progressive.tdd.utils.ReadProperties;

public class BaseClass extends ExtentListener {

	protected WebDriver driver;
	ReadProperties envVar = new ReadProperties();
	protected HomePage homePage;
	protected CommonActions commonActions;
	protected AddressPage addressPage;
	protected WebDriverWait wait;
	protected GetAQuotePage getAQuotePage;
	
	@Parameters("browser")
	@BeforeMethod
	public void setUpDriver(String browserName) {

		// String browserName = envVar.getProperty (getString(BROWSER));

		//String browserName = envVar.getPropertie(BROWSER);
		String url = envVar.getPropertie(URL);
		long pageloadWait = envVar.getNumberProperty(PAGELOAD_WAIT);
		long implicitWait = envVar.getNumberProperty(IMPLICIT_WAIT);
		initDriver(browserName);
		initclass(driver);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageloadWait));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
		wait = new WebDriverWait(driver, Duration.ofSeconds(pageloadWait));
	}
	
	
	private void initclass(WebDriver driver) {
		homePage = new HomePage(driver);
		addressPage = new AddressPage(driver);
		getAQuotePage = new GetAQuotePage(driver);
	}

	private void initDriver(String driverName) {
		switch (driverName) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case EDGE:
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case SAFARI:
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;

		default:
			break;
			
		}
	}
		
		@AfterMethod
		public void teareUp() {
			driver.quit();
	       }

	

	

	@AfterMethod
	public void getResult(ITestResult result, Method method) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS,PASSED);
		} else if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL,FAILED);
			test.addScreenCaptureFromPath(captureScreenShot(driver, method.getName()));
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP,SKIPPED);

		}
		

	/*@SuppressWarnings("unused")
	private String getString(Constant Constant) {
		return Constant.name();
	}
	*/
	}	

}