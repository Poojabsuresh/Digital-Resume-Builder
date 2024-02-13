package com.resumebuilder.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"navbar-wd\"]/ul/li[8]/a")
	private WebElement logoutbtn;
	
	public LogoutPage (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
}
	public void Logoutbtn() throws InterruptedException {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();",logoutbtn);
		Thread.sleep(3000);
		
	}
}