package progressive.tdd.practice;



import org.testng.annotations.Test;


import progressiveTddUtils.AutoData;

public class UniteTests {
	
	
	@Test

	public void uniteTestAutoDataNull() {
		AutoData data = new AutoData(null, null, null, null, null);
		

}
	@Test
	public void uniteTestAutoDataZeroLength() {
		AutoData data =new AutoData("human", "human", "human", "human", "");
		System.out.println(data.getValidatehomePageText());

}
}