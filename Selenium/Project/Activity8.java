package com.ibm.Session11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Activity8 {
	
	@Test
	public void info()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]")).click();
		WebElement leave = driver.findElement(By.id("applyleave_txtLeaveType"));
		Select type = new Select(leave);
		type.selectByValue("1");
		driver.findElement(By.id("applyleave_txtFromDate")).click();
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[1]/td[1]")).click();
		driver.findElement(By.id("applyleave_txtToDate")).click();
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td[4]")).click();
		driver.findElement(By.id("applyBtn")).click();
		driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
		String status=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td[6]")).getText();
		System.out.println("Leave Status: "+status);
		driver.close();

	}
	

}
