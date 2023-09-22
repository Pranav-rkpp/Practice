package AndroidAppium;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Sample {
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) throws Exception {
		openCalculator();
	}
	
	public static void openCalculator() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Pranav");
		cap.setCapability("udid", "1328c63c9905");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "com.miui.calculator");
		cap.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		
		URL url = new URL("http://192.168.1.6:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,cap);
		System.out.println("Application Started..");
		MobileElement agree= driver.findElement(By.id("android:id/button2"));
		agree.click();
		MobileElement exp= driver.findElement(By.xpath("	\r\n"
				+ "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"));
		exp.click();
		MobileElement one= driver.findElement(By.id("com.miui.calculator:id/btn_1_s"));
		MobileElement plus= driver.findElement(By.id("com.miui.calculator:id/btn_plus_s"));
		MobileElement two= driver.findElement(By.id("com.miui.calculator:id/btn_2_s"));
		MobileElement equals= driver.findElement(By.id("com.miui.calculator:id/btn_equal_s"));
		MobileElement result= driver.findElement(By.id("com.miui.calculator:id/result"));

		
		one.click();
		plus.click();
		two.click();
	    equals.click();
	    String res = result.getText();
	    System.out.println("Result = "+ res);
	    System.out.println("Completed");
	}
}
