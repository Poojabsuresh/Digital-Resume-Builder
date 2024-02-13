package com.resumebuilder.pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(xpath="//a[@href='/login']")
	private WebElement signup;
	
	@FindBy(xpath="//input[@name='Username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='pass']")
	private WebElement password;
	
	@FindBy(xpath="//label[@class='label-checkbox100']")
	private WebElement checkbox;
	
	@FindBy(xpath="//button[@class='login100-form-btn']")
	private WebElement login;
	
	@FindBy(xpath="/html/body/app-root/app-login/div/div/div/form/div[3]/div[2]")
	private WebElement forgotPw; 
	
	
	public LoginPage (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void Signup() {
		signup.click();
	}
	public void SetName(String Username) throws InterruptedException {
		username.sendKeys(Username);
		Thread.sleep(1000);
	}
	public void Setpasswrd(String Password) throws InterruptedException {
		password.sendKeys(Password);
		Thread.sleep(1000);
	}
	public void checkbox() throws InterruptedException {
		checkbox.click();
		Thread.sleep(1000);
	}
	public void Forgotpwd() throws InterruptedException {
		forgotPw.click();
		Thread.sleep(5000);
		
	}
	public void login() {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();",login);
	}
	@FindBy(xpath="//*[text()=' Signin to continue ']")
	private WebElement element;
	public boolean assertion() {
		return element.getText().toString().contains("Signin to continue");
	}
	
}
