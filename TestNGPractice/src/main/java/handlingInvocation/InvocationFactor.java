package handlingInvocation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationFactor {

	
	/**
	 * Timeout works only when invocation count attribute
	 */
	@Test(invocationCount=3,invocationTimeOut=120000)
	public void CountCricketWord()
	{
		//launch the browser
		System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//load the URL
		driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwjjkuX3r5-AAxWY2DgGHe2kAmwQPAgI");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//get count of cricket word
		driver.findElement(By.id("APjFqb")).sendKeys("Cricket",Keys.ENTER);
		List<WebElement> cricket = driver.findElementsByXPath("//*[contains(text(),'Cricket') or contains(text(),'cricket')]");
		System.out.println(cricket.size());
		
		//close the browser
		driver.quit();
	}
}
