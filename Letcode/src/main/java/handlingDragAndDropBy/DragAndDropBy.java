package handlingDragAndDropBy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {
public static void main(String[] args) {
	//launch the browser
	System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	//Maximize the window
	driver.manage().window().maximize();
	
	//load the URL
	driver.get("https://letcode.in/draggable");
	
	//implement Implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//Drag and Drop By operation	
	Actions builder =	new Actions(driver);
	WebElement source = driver.findElement(By.id("sample-box"));
    int x = source.getLocation().getX();
	int y = source.getLocation().getY();
    builder.dragAndDropBy(source,500,250).perform();
    System.out.println("Coordinates of source element : "+ x +" "+ y);
	
	//close the browser
	driver.quit();
}
}
