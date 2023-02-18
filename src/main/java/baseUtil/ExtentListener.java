package baseUtil;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.google.common.io.Files;

import progressive.tdd.reporting.ExtentReporting;
import progressive.tdd.reporting.ExtentTestManager;
import progressive.tdd.reporting.Logs;

public class ExtentListener {

	ExtentReports extentReports;
	ExtentTest test;
	private java.util.Date date;

	@BeforeSuite
	public void initExtentReport() {
		extentReports = ExtentTestManager.initialExtentReports();
	}

	@BeforeMethod
	public void startExtentsReport(Method method) {
		test = ExtentReporting.createTest(method.getName());
	}

	@AfterSuite
	public void closeReport() {
		extentReports.flush();
	}

	public String captureScreenShot(WebDriver driver, String testName) {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File folder = new File("screeenShots");
		folder.mkdirs();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM.dd.yyyy_HH.mm.ss");
		String dateTime = dateFormat.format(date);
		File ssLocation = new File(folder + "/" + testName + "-" + dateTime + ".png");
		File sourceFile = ss.getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(sourceFile, ssLocation);
			Logs.log("**Screen shot has been captured successfully---");
			System.out.println("Find screenshots here:" + ssLocation.getAbsolutePath());

		} catch (IOException e) {
			Logs.log("Failed to capture screenshot at:" + ssLocation.getAbsolutePath());
			System.out.println("Failed at:" + ssLocation.getAbsolutePath());
		}

		return ssLocation.getAbsolutePath();
	}

}
