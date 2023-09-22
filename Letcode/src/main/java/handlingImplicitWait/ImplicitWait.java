package handlingImplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
public static void main(String[] args) {
	//Check video once more to know additional details
	//launch the browser
	System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	//Maximize the window
	driver.manage().window().maximize();
	
	//load the URL
	driver.get("https://letcode.in/frame");
	
	//add implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//Insert the first and last name in the respective field
	driver.switchTo().frame(0);
	driver.findElementByName("fname").sendKeys("Pranav");
	driver.findElementByName("lname").sendKeys("R");
	
	//quit the browser
	driver.quit();
}
}
