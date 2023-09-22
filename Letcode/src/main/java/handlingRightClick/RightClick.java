package handlingRightClick;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) {

		//launch the browser
		System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//Maximize the window
		driver.manage().window().maximize();

		//load the URL
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		//Implement implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Right click operation
		WebElement button = driver.findElementByXPath("//span[@class='context-menu-one btn btn-neutral']");
		Actions builder = new Actions(driver);
		builder.contextClick(button).perform();

		//close the browser
		driver.quit();

	}
}
