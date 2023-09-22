package handlingDragAndDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) {
	//launch the browser
	System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	//maximize the window
	driver.manage().window().maximize();
	
	//load the URL
	driver.get("https://letcode.in/dropable");
	
	//implement implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//Drag and Drop operation
	WebElement source = driver.findElement(By.id("draggable"));
	WebElement dest = driver.findElement(By.id("droppable"));
	Actions builder = new Actions(driver);
	builder.dragAndDrop(source, dest).perform(); //don't chain build() because inbuilt perform has it 
	
	//close the browser
	driver.quit();
}
}
