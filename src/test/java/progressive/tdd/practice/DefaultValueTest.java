package progressive.tdd.practice;

import org.testng.annotations.Test;

public class DefaultValueTest {
	String string;
	int a;
	char c;
	boolean b;

	@Test(enabled = false)
	public void defaultValueTestin() {
		System.out.println("string");
		System.out.println(a);
		System.out.println(c);
		System.out.println(b);

	}

	@Test
	public void parseLongValidation() {
		String aString = "123*kskfnk12fakjfvna;kjn";
		String bstring = aString.trim().replaceAll("[^0-9]", "");
		System.out.println(Long.parseLong(bstring));
	}

}
