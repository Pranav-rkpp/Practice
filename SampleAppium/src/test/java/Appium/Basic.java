package Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class Basic {

	@Test
	public void baseTest() throws MalformedURLException {
		AppiumDriverLocalService service = new AppiumServiceBuilder()
				.withAppiumJS(new File("C:\\Users\\ELCOT\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("192.168.1.3")
				.withArgument(GeneralServerFlag.BASEPATH,"/wd/hub/")
				.usingPort(4723)
				.build();
		service.start();
		
		UiAutomator2Options option = new UiAutomator2Options();
		option.setDeviceName("Android Devices");
		//1328c63c9905
		option.setApp("C:\\Users\\ELCOT\\eclipse-workspace\\SampleAppium\\src\\test\\java\\Appium\\ApiDemos-debug.apk");
		AndroidDriver driver = new AndroidDriver(new URL("http://192.168.1.3:4723/wd/hub"),option);
		
		driver.quit();
		service.stop();
	}
}
