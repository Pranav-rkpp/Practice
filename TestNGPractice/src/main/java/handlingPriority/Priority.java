package handlingPriority;

import org.testng.annotations.Test;

public class Priority {

	/**
	 * Priority will take an order of ASCII if no number was given
	 * It also takes negative number
	 * if we do not give any number it will take default value as 0
	 */
	@Test
	public void Test5() {
		System.out.println("First Test"); 
	}
	
	@Test(priority=-1)
	public void Test2() {
		System.out.println("Second Test");
	}
	
	@Test(priority=0)
	public void Test1() {
		System.out.println("Fifth Test");
	}
	
	@Test(priority=3)
	public void Test3() {
		System.out.println("Third Test");
	}
	
	@Test
	public void Test4() {
		System.out.println("Fourth Test");
	}
}
