package com.resumebuilder.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Download {
	WebDriver driver;
	@FindBy(xpath="//a[@href='/templatehome']")
	private WebElement temp;
	
	@FindBy(xpath="//a[text()='Download Resume']")
	private WebElement downloadbtn;
	@FindBy(xpath="//button[text()='Download Resume']")
	private WebElement dbtn2;
	@FindBy(xpath="//button[text()='Download Resume']")
	private WebElement dbtn3;
	
	@FindBy(xpath="//*[@id=\"web-development\"]/div/div/div[3]/div/a/figure/img")
	private WebElement selecttemp1;
	@FindBy(xpath="//*[@id=\"web-development\"]/div/div/div[2]/div[2]/a/figure/img")
	private WebElement selecttemp2;
	@FindBy(xpath="//*[@id=\"web-development\"]/div/div/div[1]/div[2]/a/figure/img")
	private WebElement selecttemp3;
	
	@FindBy(xpath="//a[@href='/editform']")
	private WebElement edit;
	
	
	public Download(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
	}


	public void clickTemplate() throws InterruptedException {
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();",temp);
		Thread.sleep(2000);
		
		}
		
		
	
	public void selectTemplate() throws InterruptedException {
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();",selecttemp2);
		Thread.sleep(6000);
		

	}
	public void downloadTemplate() throws InterruptedException {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();",dbtn2);
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}
public void selectTemplate2() throws InterruptedException {
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();",selecttemp3);
		Thread.sleep(6000);
		

	}
	public void downloadTemplate2() throws InterruptedException {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();",dbtn3);
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}
	public void editDetails() throws InterruptedException {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();",edit);
		Thread.sleep(3000);
		
	}

}
