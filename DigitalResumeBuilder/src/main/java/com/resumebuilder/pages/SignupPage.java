package com.resumebuilder.pages;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignupPage {
	WebDriver driver;
	
	@FindBy(xpath="//a[@href='/login']")
	private WebElement SignUp;
	
	
	@FindBy(xpath="//a[@href='/signup']")
	private WebElement SignIn;
	
	@FindBy(xpath="//*[@id=\"navbar-wd\"]/ul/li[1]/a")
	private WebElement HomeClick;
	@FindBy(xpath="//a[@href='/html']")
	private WebElement AboutUs;
	@FindBy(xpath="//a[@routerlink='templatehome']")
	private WebElement TemplateHome;
	@FindBy(xpath="//a[@class='search-btn']")
	private WebElement Search;
	
	public SignupPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void HomeClick() throws InterruptedException {
		HomeClick.click();
		Thread.sleep(2000);
	}
	public void Aboutus() throws InterruptedException {
		AboutUs.click();
		Thread.sleep(2000);
	}
	public void TemplateHome() throws InterruptedException {
		TemplateHome.click();
		Thread.sleep(2000);
	}
	public void Search()  {
		Search.click();
		
	}

	public void SignUp() {
		SignUp.click();
		
	}
	public void SignIn() {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", SignIn);
	}
	
	
	
	
}
