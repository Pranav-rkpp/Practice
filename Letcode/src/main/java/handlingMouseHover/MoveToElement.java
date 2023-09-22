package handlingMouseHover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
public static void main(String[] args) {
	
	//launch the browser
	System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	//maximize the window
	driver.manage().window().maximize();
	
	//load the URL
	driver.get("https://www.flipkart.com/");
	
	//Add Implicit Wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//Move to Element --> Mouse Hover Operation
//	driver.findElementByXPath("//button[.='✕']").click();
	WebElement Fashoin = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[1]/div/div/span/span[2]"));
	Actions builder = new Actions(driver);
	builder.moveToElement(Fashoin).perform();
	WebElement  MensWear = driver.findElementByLinkText("Men's Bottom Wear");
	MensWear.click();
	
	//Close the Browser
	driver.quit();
}
}
