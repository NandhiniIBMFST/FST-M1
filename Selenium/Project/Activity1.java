package com.ibm.Session11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity1 {

	@Test
	public void getTitle()
	{
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		String title = driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");
		driver.close();	
	}
		


}
