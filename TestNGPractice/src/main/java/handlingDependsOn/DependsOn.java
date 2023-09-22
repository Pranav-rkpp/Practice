package handlingDependsOn;

import org.testng.annotations.Test;

public class DependsOn {

	/**
	 * DependsOnMethods will suppress priority
	 */
	@Test(priority=0)
	public void Test1() {
		System.out.println("First Test and it should followed by second test");
	}
	
	@Test(priority=-1)
	public void Test4()
	{
		System.out.println("Fourth Test and this is the Final");
	}
	
	@Test(dependsOnMethods="Test4",priority=2)
	public void Test3() throws Exception
	{
		System.out.println("Third Test and this is the end");
		throw new Exception();
	}
	
	@Test(dependsOnMethods = {"Test1","Test3"},priority=1)
	public void Test2() {
		System.out.println("Second Test and it should followed by third test");
	}
}
