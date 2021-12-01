package com.ibm.Session11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Activity5 {
	
	@Test
	public void editEmployee()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("(//ul/li//a[@class='firstLevelMenu'])[6]")).click();
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("personal_txtEmpFirstName")).clear();
		driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("Nandhini");
		driver.findElement(By.id("personal_txtEmpLastName")).clear();
		driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("Dhamotharan");
		driver.findElement(By.id("personal_optGender_2")).click();
		WebElement nation = driver.findElement(By.id("personal_cmbNation"));
		Select select = new Select(nation);
		select.selectByVisibleText("Indian");
		driver.findElement(By.id("personal_DOB")).click();
		WebElement months = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select month = new Select(months);
		month.selectByValue("8");
		WebElement years = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select year = new Select(years);
		year.selectByVisibleText("1996");
		driver.findElement(By.xpath("//table/tbody/tr[4]/td[3]")).click();
		driver.findElement(By.id("btnSave")).click();
		driver.close();

}
}
