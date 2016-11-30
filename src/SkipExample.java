import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipExample {
	
	public int i=1;
	@Test(enabled=false)
	public void testCaseEnabling(){
			System.out.println("I'm Not Ready, please don't execute me");
		}
	@Test
	public void testCaseSkipException(){
			System.out.println("Im in skip exception");
			throw new SkipException("Skipping this exception");
		}

	@Test
	public void testCaseConditionalSkipException(){
		System.out.println("Im in Conditional Skip");
		if(i==1)
		throw new SkipException("Skipping this exception");
		System.out.println("Executed Successfully");
	}


}
