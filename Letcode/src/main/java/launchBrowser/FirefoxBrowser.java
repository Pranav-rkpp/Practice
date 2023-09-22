package launchBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./driverFile/geckodriver.exe");
		FirefoxDriver f= new FirefoxDriver();
		//Firefox is not installed so it doesnot launch firefox browser. But still code works.
		f.get("https://www.toolsqa.com/selenium-webdriver/selenium-tutorial/");
	}
	
}
