package activities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity4 {
	
	AndroidDriver<MobileElement> driver = null;
	WebDriverWait wait = null;
		
		@BeforeClass
		public void setUp() throws MalformedURLException
		{
			DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceName", "Pixel 4 API 28 Emulator");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("automationName", "UiAutomator2");
	        caps.setCapability("appPackage", "com.android.contacts");
	        caps.setCapability("appActivity", ".activities.PeopleActivity");
	        caps.setCapability("noReset", true);
	        
	        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
	        // Initialize driver
			driver = new AndroidDriver<MobileElement>(appServer, caps);
			System.out.println("Contact is open");
			
			wait = new WebDriverWait(driver, 10);	
	    }
		
		@Test
		public void addContact() throws InterruptedException
		{
			driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Create new contact']").click();
			Thread.sleep(3000);
			driver.findElementByXPath("//android.widget.EditText[@text='First name']").sendKeys("Nandhini");
			driver.findElementByXPath("//android.widget.EditText[@text='Last name']").sendKeys("Dhamotharan");
			driver.findElementByXPath("//android.widget.EditText[@text='Phone']").sendKeys("8939177023");
			driver.findElementById("editor_menu_save_button").click();
			// Wait for contact card to appear
	        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("toolbar_parent")));
	        MobileElement mobileCard = driver.findElementById("toolbar_parent");
	        Assert.assertTrue(mobileCard.isDisplayed());        
	        String contactName = driver.findElementById("large_title").getText();
	        Assert.assertEquals(contactName, "Nandhini Dhamotharan");

		}
		@AfterClass
	    public void afterClass() {
	        driver.quit();
	    }

}
