package com.resumebuilder.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.resumebuilder.pages.LoginPage;


public class BaseClass 
	{
	WebDriver driver ;
	
	
	@BeforeTest
	public void Configure() throws InterruptedException {
	
		driver = new ChromeDriver();
		driver.get("http://167.71.226.96/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		
	}
	@AfterTest
	public void Final() {
		System.out.println("All test cases executed ");
	}
	

}

