package com.parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterExample
{
	
	WebDriver driver; 
	
	@Test 
	@Parameters({"browser" ,"url",  "username", "pwd"})
	public void loginToVtiger(String browser, String url, String username, String pwd)
	{
		if(browser.equals("firefox"))
		{
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		}
		else if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		driver.close();
	}

}
