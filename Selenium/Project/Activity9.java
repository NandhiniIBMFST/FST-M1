package com.ibm.Session11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity9 {
	
	@Test
	public void emergencyContacts()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("(//ul/li//a[@class='firstLevelMenu'])[6]")).click();
		driver.findElement(By.xpath("//ul[@id='sidenav']//li/a[contains(text(),'Emergency')]")).click();
	    List<WebElement> numbers= driver.findElements(By.xpath("//table[@id='emgcontact_list']/tbody/tr/td[4]"));
	    for(WebElement number:numbers)
	    {
	    	System.out.println(number.getText());
	    }
	    driver.close();
	}


}
