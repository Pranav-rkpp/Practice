package handlingValidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {
public static void main(String[] args) {
	//launch the browser
	System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	//maximize the window
	driver.manage().window().maximize();
	
	//load the URL
	driver.get("https://letcode.in/buttons");
	
	//implement implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//validation operation
	//1. isDisabled() --> Returns boolean
	WebElement isDisable = driver.findElement(By.id("isDisabled"));
	boolean isDisabled = isDisable.isDisplayed();	//Check only 'disabled' attribute in tag
	System.out.println(isDisabled); // return true
	
	//load another URL
	driver.navigate().to("https://letcode.in/radio");
	
	//2. isEnabled --> Return Boolean
	WebElement isEnable = driver.findElement(By.id("maybe"));
	boolean isEnabled = isEnable.isEnabled();  //Check only 'disabled' attribute in tag
	System.out.println(isEnabled);  // return false
	
	//3. isSelected() --> Return Boolean
	WebElement isSelect = driver.findElementByXPath("//input[@id='notfoo']");
	boolean isSelected = isSelect.isSelected(); //Check only 'checked' attribute in tag
	System.out.println(isSelected); //true
	
	//close the browser
	driver.quit();
}
}
