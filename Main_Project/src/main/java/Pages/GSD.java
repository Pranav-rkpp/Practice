package Pages;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.Base;

public class GSD extends Base{
	By email=By.xpath("//input[@type='email']");
	By next=By.xpath("//input[@type='submit']");
	By pass=By.name("passwd");
	By acc=By.id("user-name");
	By yes=By.xpath("//input[@value='Yes']");
	By search=By.id("searchbox");
	By icon=By.className("icomoon-search2");
	By gsd=By.xpath("(//span[text()='GSD'])[1]");
	By loc=By.xpath("//button[@id='menu4']");
	By canada=By.xpath("(//a[text()='Canada'])[2]");
	By loc1=By.xpath("(//span[@class='optionCountrySelected'])[2]");
	By h1=By.xpath("(//div[@class='col-sm-12 col-md-12 tile-inner-header'])[1]");
	By h2=By.xpath("(//div[@class='col-sm-12 col-md-12 tile-inner-header'])[2]");
	By h3=By.xpath("(//div[@class='col-sm-12 col-md-12 tile-inner-header'])[3]");
	By h4=By.xpath("(//div[@class='col-sm-12 col-md-12 tile-inner-header'])[4]");
	By item=By.xpath("//div[@class='p-1 flex-fill']/div");
	
	public void login() {
		logger = report.createTest("Login into Becognizant.");
		try {
		wait(20,email);
		driver.findElement(email).sendKeys(prop.getProperty("email"));
		driver.findElement(next).click();
		wait(20,pass);
		driver.findElement(pass).sendKeys(prop.getProperty("password"));
		driver.findElement(next).click();
		Thread.sleep(1000);
		reportPass("Email and Password Verified sucessfully");
		wait(120,yes);
		driver.findElement(yes).click();
		//Verify Title
		if (driver.getTitle().contains("Be.Cognizant"))
			// Pass
			System.out.println("Page title contains Be.Cognizant");
		else
			// Fail
			System.out.println("Page title doesn't contains Be.Cognizant");
		String name=driver.findElement(acc).getText();
		System.out.println("The name for the Acoount is: "+name);
		Screenshot("Account");
		reportPass("Be.Cognizant Page is reached sucessfully");
		
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
	}
	
	public void getData() {
		logger = report.createTest("Obtain the options from GSD.");
		try {
	    file = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Data.xlsx");
		workbook = new XSSFWorkbook();
		sh = workbook.createSheet("Options");
		driver.findElement(search).sendKeys(prop.getProperty("search3"));
		driver.findElement(icon).click();
		wait(20,gsd);
		String currentHandle= driver.getWindowHandle();
		driver.findElement(gsd).click();
		reportPass("GSD Page is reached sucessfully");
		Set<String> handle1=driver.getWindowHandles();
		for(String actual: handle1) {
			if(!actual.equalsIgnoreCase(currentHandle)) {
				driver.switchTo().window(actual);
			}
		}
		driver.switchTo().frame("appFrame");
		wait(20,loc);
		driver.findElement(loc).click();
		wait(20,canada);
		driver.findElement(canada).click();
		wait(20,loc1);
		String location=driver.findElement(loc1).getText();
		System.out.println("The country selected is: "+location);
		Thread.sleep(3000);
		Screenshot("GSD");
		if(prop.getProperty("option").matches("option1")) {
			System.out.println("************************************************");
			System.out.println("            "+driver.findElement(h1).getText());
			System.out.println("************************************************");
			List<WebElement> items = driver.findElements(item);
			for (int i = 0; i < 7; i++) {
				System.out.println(items.get(i).getText());
				sh.createRow(i+1).createCell(1).setCellValue(items.get(i).getText());
			}
		} else if(prop.getProperty("option").matches("option2")) {
			System.out.println("************************************************");
			System.out.println("             "+driver.findElement(h2).getText());
			System.out.println("************************************************");
			List<WebElement> items = driver.findElements(item);
			for (int i = 7; i < 14; i++) {
				sh.createRow(i-6).createCell(1).setCellValue(items.get(i).getText());
				System.out.println(items.get(i).getText());
			}
		} else if(prop.getProperty("option").matches("option3")) {
			System.out.println("************************************************");
			System.out.println("             "+driver.findElement(h3).getText());
			System.out.println("************************************************");
			List<WebElement> items = driver.findElements(item);
			for (int i = 14; i < 21; i++) {
				sh.createRow(i-13).createCell(1).setCellValue(items.get(i).getText());
				System.out.println(items.get(i).getText());
			}
		} else if(prop.getProperty("option").matches("option4")) {
			System.out.println("************************************************");
			System.out.println("             "+driver.findElement(h4).getText());
			System.out.println("************************************************");
			List<WebElement> items = driver.findElements(item);
			for (int i = 21; i < 28; i++) {
				sh.createRow(i-20).createCell(1).setCellValue(items.get(i).getText());
				System.out.println(items.get(i).getText());
			}
		
		} else if(prop.getProperty("option").matches("option5")) {
			System.out.println("************************************************");
			System.out.println("         All Options available are: ");
			System.out.println("************************************************");
			List<WebElement> items = driver.findElements(item);
			for (int i = 0; i < 28; i++) {
				sh.createRow(i+1).createCell(1).setCellValue(items.get(i).getText());
				System.out.println(items.get(i).getText());
			}
		}
		reportPass("The options are obtained sucessfully");
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
	}
	
}
