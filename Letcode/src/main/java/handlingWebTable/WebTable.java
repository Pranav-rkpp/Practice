package handlingWebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTable {
public static void main(String[] args) {
	
	//launch the browser
	System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	//maximize the window
	driver.manage().window().maximize();
	
	//load the URL
	driver.get("https://letcode.in/table");
	
	//add implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
	//WebElementTable element operation
	List<WebElement> AllRow = driver.findElementsByXPath("//table[@id='simpletable']/tbody/tr"); //Retrieve rows of the table
    System.out.println(AllRow.get(0).findElement(By.tagName("td")).getText()); // fetching first value from first row
    System.out.println(AllRow.get(1).findElement(By.tagName("td")).getText());
    System.out.println(AllRow.size()); //Number of Rows
    
    for(int i=0;i<AllRow.size();i++)
    {
    	/**
    	 * Print first column
    	 */
    	// retrieve the First Name value each by each through passing 'i
    	String column1 = AllRow.get(i).findElements(By.tagName("td")).get(0).getText();
    	System.out.println("First Name : "+column1); //print first name
    	
    	/**
    	 * Retrieving second column and checking it by using condition statement
    	 * 
    	 */
    	 List<WebElement> EachRow = AllRow.get(i).findElements(By.tagName("td")); //Each row will marked here
    	 String lName = EachRow.get(1).getText(); // retrieve the Last Name value each by each through passing 'i'
    	 System.out.println("Last Name : "+lName); //print last name
    	 
    	 System.out.println("CHECKING LAST NAME 'RAJ' - SET - "+ (i+1));
    	 if(lName.equals("Raj"))
    	 {
    		 //click on check box
    		 EachRow.get(3).findElement(By.tagName("input")).click();
    		 WebElement input = EachRow.get(3).findElement(By.tagName("input"));
    		 boolean isSelected = input.isSelected();
    		 if(isSelected == true)
    			 System.out.println("Successfully clicked : " + isSelected);
    		 break;
    	 }
    }
	
	//close the browser
	driver.quit();
}
}
