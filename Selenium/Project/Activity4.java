package com.ibm.Session11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity4 {
	
	@Test
	public void addNewEmployee()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("(//ul/li//a[@class='firstLevelMenu'])[2]")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("firstName")).sendKeys("Nandhini");
		driver.findElement(By.id("lastName")).sendKeys("Dhamotharan");
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Employee List')]")).click();
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Nandhini");
		driver.findElement(By.id("searchBtn")).click();
		driver.findElement(By.xpath("//table/tbody/tr/td[3]")).getText().equalsIgnoreCase("nandhini");
		driver.close();

	}
}