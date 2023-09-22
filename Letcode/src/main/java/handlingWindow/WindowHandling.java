package handlingWindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandling {
public static void main(String[] args) {
	
	//launch the browser
	System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	//maximize the window
	driver.manage().window().maximize();
	
	//load the URL
	driver.get("https://letcode.in/windows");
	
	//Add implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//Window Handling
	String window = driver.getWindowHandle();
	System.out.println(window);
	
	driver.findElement(By.id("home")).click();
	
	Set<String> windows = driver.getWindowHandles();
	System.out.println(windows);
	
	System.out.println(driver.getCurrentUrl());
	
	List<String> list = new ArrayList<String>(windows);
		
	driver.switchTo().window(list.get(1));
	
	System.out.println(driver.getCurrentUrl());
	
	driver.close();
	
	list.clear();
	
	Set<String> win = driver.getWindowHandles();
	
	list.addAll(win);
	
	driver.switchTo().window(list.get(0));
	
	 System.out.println(driver.getCurrentUrl());
	 
	//close the browser
	driver.quit();
}
}
