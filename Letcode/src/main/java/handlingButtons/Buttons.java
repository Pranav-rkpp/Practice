package handlingButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {
public static void main(String[] args) {
	//launch the browser
	System.setProperty("webdriver.chrome.driver", "./driverFile/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	//load the url
	driver.navigate().to("https://letcode.in/buttons");
	
	//get the coordinates of x and y
	WebElement ele = driver.findElement(By.id("position")); //findElement return webelement interface and create reference
	Point point = ele.getLocation(); // return Point class
	int x = point.getX(); // return int
	int y = point.getY(); // return int
	System.out.println("Value of x-coordinates => "+ x);
	System.out.println("Value of y-coordinates => "+ y);
	System.out.println("point object also return the x and y coordinates : " + point);
	
	//get color of the button
	String backgroundColor = driver.findElement(By.id("color")).getCssValue("background-color"); // return string
	String color = driver.findElement(By.id("color")).getCssValue("color"); // return string
	System.out.println("Background color : "+ backgroundColor); // color will be denoted in rga(,,) format
	System.out.println("Color of the text : "+ color);
	
	//get width and height of the button
	Rectangle rect = driver.findElement(By.id("property")).getRect(); // getRect() return rectangle class
	Dimension dim = rect.getDimension(); // will return Dimension class
	int width = dim.getWidth(); 
	int height = dim.getHeight();
	System.out.println("Width : "+ width + " Height : "+ height + "  " + rect.getHeight());
	System.out.println(dim); // This line also return same width and height
	System.out.println("getPoint funtion will fetch the position of the button : "+ rect.getPoint());
	
	//close the browser
	driver.quit();
}
}
