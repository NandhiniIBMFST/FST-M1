package com.ibm.Session11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Activity6 {
	@Test
	public void info()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//ul/li//a[@class='firstLevelMenu'])[9]")));		
		WebElement directory = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul/li//a[@class='firstLevelMenu'])[9]")));
		directory.click();
		driver.findElement(By.xpath("//div[@id='content']/div[1]//a")).getText().equalsIgnoreCase("Search directory");
		driver.close();
	}

}

