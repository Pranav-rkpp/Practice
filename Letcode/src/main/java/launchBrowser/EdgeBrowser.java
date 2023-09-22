package launchBrowser;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {

	public static void main(String[] args) {
		
		//Launching Chrome Browser
		System.setProperty("webdriver.edge.driver", "./driverFile/msedgedriver.exe");
		EdgeDriver e = new EdgeDriver();

		 //Navigate to Tool QA website
		e.get("https://www.toolsqa.com/selenium-webdriver/selenium-tutorial/");
	}
}
