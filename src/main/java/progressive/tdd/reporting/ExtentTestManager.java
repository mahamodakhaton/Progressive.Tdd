package progressive.tdd.reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentTestManager {
	public static ExtentReports extentReports;

	public static synchronized ExtentReports initialExtentReports() {

		try {
			if (extentReports == null)
				extentReports = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReports.html");
			spark.config().setReportName("Progressive QA Automation");
			spark.config().setTheme(Theme.DARK);
			extentReports.attachReporter(spark);
			extentReports.setSystemInfo("Testing", "Regression");
			extentReports.setSystemInfo("Team", "Regression");
			extentReports.setSystemInfo("Testing", "Qa - Avengers");
			extentReports.setSystemInfo("OS", System.getProperty("os.name"));
			extentReports.setSystemInfo("Host", System.getProperty("user.name"));

		} catch (Exception e) {
			e.printStackTrace();
		}

		return extentReports;
	}

}
