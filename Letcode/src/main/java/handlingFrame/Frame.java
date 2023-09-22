package handlingFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//load the URL
		driver.get("https://letcode.in/frame");

		/**
		 * @description - Switching frames can be handled in three ways
		 * 1. fetch by index
		 * 2. fetch by attribute 
		 * 3. fetch by webElement 
		 * 
		 * Interview Question:
		 * Overloading concepts widely used in frame concept 
		 */
		//Switch the frame
		driver.switchTo().frame(0); //Based on Index

		//send the data to firstName and lastName field
		driver.findElement(By.name("fname")).sendKeys("Pranav");
		driver.findElement(By.name("lname")).sendKeys("RameshChandra");

		//Switch to frame inside another frame
		WebElement anotherFrame = driver.findElementByXPath("//iframe[@src='innerFrame']");
		driver.switchTo().frame(anotherFrame); // based on WebElement

		//Enter the email id which present inside frame
		driver.findElementByName("email").sendKeys("rkpranav11@gmail.com");

		//Move out to parent frame from current frame
		driver.switchTo().parentFrame();

		//Append the last name once again
		driver.findElementByName("lname").sendKeys("Bose");

		//Again going inside frame
		driver.switchTo().frame(0);

		//Moving out from all frame and hit main page
		driver.switchTo().defaultContent();

		//Checking whether we are in main page by validating text "Frame"
		String Header = driver.findElementByTagName("h1").getText();
		System.out.println("Checking the Header : "+ Header);

		//close the browser
		driver.quit();
	}
}
