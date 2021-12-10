package activities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity2 {
	
AndroidDriver<MobileElement> driver = null;
WebDriverWait wait = null;
	
	@BeforeClass
	public void setUp() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel 4 API 28 Emulator");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);
        
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        // Initialize driver
		driver = new AndroidDriver<MobileElement>(appServer, caps);
		System.out.println("Chrome is open");
		
		wait = new WebDriverWait(driver, 10);
		
    }
	
	@Test
    public void testSearchAppium() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.training-support.net/");
        String pageTitle = driver.findElementByXPath("//android.view.View[@text='Training Support']").getText();
        System.out.println("PageTitle: "+pageTitle);
        MobileElement button = driver.findElementByXPath("//android.view.View[@text='About Us']");
        button.click();
        String newPageTitle;
        try
        {
       newPageTitle = driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]").getText();
        }
        catch(Exception ex) {
        	
            newPageTitle = driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]").getText();
        }
        System.out.println("NewPageTitle: "+newPageTitle);
        
        Assert.assertEquals("Training Support", pageTitle);
        Assert.assertEquals("About Us", newPageTitle);
	}
	
	 @AfterTest
	    public void tearDown() {
	        driver.quit();
	    }

}
