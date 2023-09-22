package handlingScreenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
public static void main(String[] args) throws Exception {
	//launch the browser
	System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	//load the url
	driver.get("https://letcode.in/buttons");
	
	//taking screenshot of entire page
	File src = driver.getScreenshotAs(OutputType.FILE); //take the screenshot and store it in a file
	File dest = new File("./snaps/img1.png"); //create a dest file and screenshot in our local path
	FileHandler.copy(src, dest); //copy and paste in our dest file

	//taking screenshot of particular element
	WebElement ele = driver.findElement(By.id("color"));
	File src1 = ele.getScreenshotAs(OutputType.FILE);
	File dest1 = new File("./snaps/img2.png");
	FileHandler.copy(src1, dest1);
	
	//taking screenshot of particular section
	WebElement ele1 = driver.findElement(By.xpath("//div[@class='column is-3-desktop is-4-tablet']//div[@class='card-content']"));
	File src2 = ele1.getScreenshotAs(OutputType.FILE);
	File dest2 = new File("./snaps/img3.png");
	FileHandler.copy(src2, dest2);
		
	//close the browser
	driver.quit();
}
}
