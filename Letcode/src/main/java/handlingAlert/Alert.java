package handlingAlert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert {

	public static void main(String[] args) throws Exception {
		//launch the browser
		System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//load the url
		driver.navigate().to("https://letcode.in/alert");
		
		//At a time only one alert will present and it is javascript alert
		//simple Alert - alert with one button
		WebElement ele = driver.findElement(By.id("accept"));
		ele.click();
        driver.switchTo().alert().accept(); //.dismiss() also does same thing but function wise is different
		
		//confirm Alert - alert with two button
        //Alert is an interface and creating reference to it
//        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
//        driver.findElement(By.name("alert")).click();
//        Alert ale = driver.switchTo().alert();
//        ale.accept();    
        WebElement ele1 = driver.findElement(By.id("confirm"));
		ele1.click();
        driver.switchTo().alert().dismiss();
        
		//prompt alert - alert by entering the text and can send data
        WebElement ele11 = driver.findElement(By.id("prompt"));
		ele11.click();
        driver.switchTo().alert().sendKeys("Pranav");
        Thread.sleep(2000);
        String text = driver.switchTo().alert().getText();
        System.out.println(text);
        driver.switchTo().alert().accept();
        
		//close the browser
		driver.quit();
	}
}
