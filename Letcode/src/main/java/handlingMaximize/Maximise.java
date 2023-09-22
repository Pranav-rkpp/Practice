package handlingMaximize;

//import org.openqa.selenium.WebDriver.Options;
//import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximise {
	public static void main(String[] args) {
		//launch the browser
		System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//maximize the window
	    driver.manage().window().maximize();
	    /**
		 * OR
		 * Options opt = driver.manage(); --> return interface
		 * Window win = opt.window(); --> return interface
		 * win.maximze();
		 */
		
		//load the URL
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/frames/");

		//close the browser
		driver.quit();
	}
}
