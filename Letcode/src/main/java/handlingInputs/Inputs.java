package handlingInputs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inputs {

	public static void main(String[] args) {
		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("https://letcode.in/edit");
		
		//Enter the text
		driver.findElementById("fullName").sendKeys("Pranav R");
		
		//Append the text and Press Keyboard TAB
		driver.findElementById("join").sendKeys(" person", Keys.TAB);
		
		//Get text which present inside the box
		String text = driver.findElement(By.id("clearMe")).getAttribute("value");
		System.out.println(text);
		
		//clear the text
		driver.findElement(By.id("clearMe")).clear();
		
		//Confirm edit field is disabled
		boolean isEnable = driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println(isEnable);
		
		//confirm text is readonly
		String text1 = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		System.out.println(text1);
		
		//close the browser
		driver.quit();	
		}
}
