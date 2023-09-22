package launchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
 public static void main(String[] args) {
	
	 //Launching Chrome Browser
	 System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
	 ChromeDriver d = new ChromeDriver();
	 
	 //Navigate to Tool QA website
	 d.get("https://www.toolsqa.com/selenium-webdriver/selenium-tutorial/");
	 
}
}
