package handlingActiveElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement {
public static void main(String[] args) {
	
	//launch the browser
	System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	//maximize the window
	driver.manage().window().maximize();
	
	//load the URL
	driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjg5ODM5NjMyLCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
	
	//Add implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	/**
	 * @Description : activeElement()
	 *   Switches to the element that currently has focus within the document currently
	 */
	WebElement username  = driver.switchTo().activeElement();
	username.sendKeys("rkpranav",Keys.TAB,"Password",Keys.ENTER);
	
	//close the browser
	driver.quit();
}
}
