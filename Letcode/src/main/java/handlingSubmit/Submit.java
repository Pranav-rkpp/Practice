package handlingSubmit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {
public static void main(String[] args) {
	
	//launch the browser
	System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
	ChromeDriver driver =  new ChromeDriver();
	
	//Maximize the window
	driver.manage().window().maximize();
	
	//load the URL
	driver.navigate().to("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_login_form");
	
	//Add implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	/**
	 * @Description :
	 *   After entering all required details in form we proceed to hit enter key 
	 *   In same way we have function to submit the form using the function submit()
	 */
	WebElement iFrame = driver.findElementById("iframeResult");
	driver.switchTo().frame(iFrame);
	WebElement username = driver.findElementByName("uname");
	username.sendKeys("Pranav");
	WebElement password = driver.findElementByName("psw");
	password.sendKeys("pranav");
	WebElement Submit = driver.findElementByXPath("//button[@type='submit']");
	Submit.submit(); 
	
	//close the browser
	driver.quit();
}
}
