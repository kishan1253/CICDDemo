package com.AutomationTalks.CICDDemoProject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ClassOne {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void myKelseyTest()
	{
		driver.get("https://www.mykelseyonline.com/MyChart/Authentication/Login?");
		System.out.println(driver.getTitle());
	}
	@Test(priority=2)
	public void schoolCafeTest()
	{
		driver.get("https://www.schoolcafe.com");
		System.out.println(driver.getTitle());
	}
	@Test(priority=3)
	public void linkedInTest()
	{
		driver.get("https://www.linkedin.com");
		System.out.println(driver.getTitle());
	}
	
	@Test@Ignore
	public void jobRightTest()
	{
		driver.get("https://jobright.ai/jobs/recommend");
		System.out.println(driver.getTitle());
	}
	
	@Test(priority=4)
	public void diceTest()
	{
		driver.get("https://www.dice.com/dashboard/login");
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
