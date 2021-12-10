package activities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity1 {
	AppiumDriver<MobileElement> driver = null;
	
	@BeforeClass
	public void setUp() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel 4 API 28 Emulator");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.calculator2");
        caps.setCapability("appActivity", "com.android.calculator2.Calculator");
        
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        // Initialize driver
		driver = new AndroidDriver<MobileElement>(appServer, caps);
		System.out.println("Calculator is open");
    }
	
	@Test
	public void add()
	{
		driver.findElementById("digit_5").click();
		driver.findElementByAccessibilityId("plus").click();
		driver.findElementByXPath("//android.widget.Button[3]").click();
		driver.findElementById("eq").click();
		String result = driver.findElement(MobileBy.id("result")).getText();
		System.out.println(result);
		Assert.assertEquals(result, "14");
	}
	
	@AfterClass
    public void tearDown() {
        driver.quit();
    }	

}
