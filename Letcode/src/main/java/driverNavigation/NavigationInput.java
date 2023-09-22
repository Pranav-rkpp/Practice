package driverNavigation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationInput {

	public static void main(String[] args) throws Exception  {
		//launch the browser
		System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//load the button page url
		driver.get("https://letcode.in/buttons");
		
		//fetch current url
		String buttonUrl = driver.getCurrentUrl();
		System.out.println("Button page URL : "+ buttonUrl);
		
		//wait for 3seconds
		Thread.sleep(3000);
		
		//Go to home page
		driver.findElement(By.id("home")).click();
		String HomeUrl = driver.getCurrentUrl();
		System.out.println(HomeUrl);
		Thread.sleep(2000);
		
		//navigate back
		driver.navigate().back();
		Thread.sleep(2000);
		
		//navigate forward
		driver.navigate().forward();
		Thread.sleep(2000);

		//navigate refresh
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//navigate to
		driver.navigate().to(HomeUrl);
		Thread.sleep(2000);
		
		//close the browser
		driver.quit();
	}
}
