package com.ibm.Session11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Activity7 {
	
	@Test
	public void qualification()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("(//ul/li//a[@class='firstLevelMenu'])[6]")).click();
		driver.findElement(By.xpath("//ul[@id='sidenav']//li/a[contains(text(),'Qualifications')]")).click();
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		driver.findElement(By.id("experience_employer")).sendKeys("Cognizant");
		driver.findElement(By.id("experience_jobtitle")).sendKeys("Tester");
		driver.findElement(By.id("experience_from_date")).click();
		WebElement months = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select month = new Select(months);
		month.selectByValue("7");
		WebElement years = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select year = new Select(years);
		year.selectByVisibleText("2016");
		driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]")).click();
		driver.findElement(By.id("experience_to_date")).click();
		WebElement toMonths = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select toMonth = new Select(toMonths);
		toMonth.selectByValue("7");
		WebElement toYears = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select toYear = new Select(toYears);
		toYear.selectByVisibleText("2021");
		driver.findElement(By.xpath("//table/tbody/tr[1]/td[5]")).click();
		driver.findElement(By.id("btnWorkExpSave")).click();
		driver.close();
		
	}

}

