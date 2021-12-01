package com.ibm.Session11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity2 {
	
	@Test
	public void getImageUrl()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		String url=driver.findElement(By.xpath("//div[@id='divLogo']//img")).getAttribute("src");
		System.out.println("URL: "+url);
		driver.close();
	}
	

}
