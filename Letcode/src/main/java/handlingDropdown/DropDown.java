 package handlingDropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) {
	//launch the browser
	System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	//maximize the window
	driver.manage().window().maximize();
	
	//load the URL
	driver.get("https://letcode.in/dropdowns");
	
	//implement implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//Drop Down Operation
	WebElement Fruits = driver.findElement(By.id("fruits"));
	Select myFruits = new Select(Fruits);
	
	/**
	 * DropDown can be handled in three ways:
	 * 1. Select by index
	 * 2. Select by value (based on value of the attribute available in html page) 
	 * 3. Select by visible text
	 */
    //myFruits.selectByIndex(1);
	myFruits.selectByValue("3");
    //myFruits.selectByVisibleText("Orange");
	
	WebElement myCountry = driver.findElementById("country");
	Select country = new Select(myCountry);
	country.selectByValue("Chile");
	
	WebElement heros = driver.findElement(By.id("superheros"));
	Select Heros = new Select(heros);
	Heros.selectByIndex(2);
	Heros.selectByIndex(4);
	Heros.selectByVisibleText("Doc Savage");
	
	System.out.println("Get the first selected option : "+ Heros.getFirstSelectedOption().getText());
	System.out.println("To check whether the option are multi seleclted : "+ Heros.isMultiple());
	List<WebElement> selectedOption = Heros.getAllSelectedOptions();
	for(WebElement options : selectedOption)
	{
		System.out.println(options.getText());
	}
	Heros.deselectByIndex(2);
	List <WebElement> selectedOptions = Heros.getAllSelectedOptions();
	for(WebElement options : selectedOptions)
	{
		System.out.println(options.getText());
	}
	//close the browser
	driver.quit();
}
}
