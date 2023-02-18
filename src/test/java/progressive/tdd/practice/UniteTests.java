package progressive.tdd.practice;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;

import org.testng.annotations.Test;

import progressive.tdd.utils.AutoData;

public class UniteTests {

	@Test(enabled = false)

	public void uniteTestAutoDataNull() {
		AutoData data = new AutoData("name", "address", "phoneNumber", "firstName", null);

	}

	@Test(enabled = true)
	public void uniteTestAutoDataZeroLength() {
		AutoData data = new AutoData("human", "human", "human", "human", "");
		System.out.println(data.getValidatehomePageText());

	}

	@Test(enabled = false)
	public void system_getpropertyTest() {
		System.out.println(System.getProperty("user.name"));
	}

	@Test(enabled = false)
	public void folderOps() {
		File folder = new File("screenShot");
		System.out.println(folder.getAbsolutePath());
		System.out.println(folder.mkdirs());

	}

	@Test(enabled = false)
	public void timeUnitTest() {
		Date date = new Date(0);
		System.out.println(date);
		Instant time = Instant.now();
		System.out.println(time);

		System.out.println(LocalDateTime.now().plusYears(1));

		System.out.println("Test1" + time + "png");
		SimpleDateFormat date_format = new SimpleDateFormat("MM:dd:yyyy_hh:mm:ss");
		System.out.println(date_format.format(date));
	}

}