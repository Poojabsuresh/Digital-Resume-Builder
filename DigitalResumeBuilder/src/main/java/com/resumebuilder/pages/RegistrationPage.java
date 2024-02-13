package com.resumebuilder.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

		WebDriver driver;
		@FindBy(xpath="//input[@placeholder='Username']")
		private WebElement Usrname;
		@FindBy(xpath="//input[@placeholder='Phone Number']")
		private WebElement Phoneno;
		@FindBy(xpath="//input[@placeholder='Mail']")
		private WebElement Mail;
		@FindBy(xpath="//input[@placeholder='Password']")
		private WebElement Paswrd;
		@FindBy(xpath="//input[@placeholder='Confirm Password']")
		private WebElement Confirmpwd;
		@FindBy(xpath="/html/body/app-root/app-signup/div/div/form/button/span")
		private WebElement button;
		@FindBy(xpath="/html/body/app-root/app-signup/div/div/form/button/html/body/app-root/app-signup/div/div/form/button")
		private WebElement alrt;


			
		public  RegistrationPage(WebDriver driver3) {
			this.driver=driver3;
			PageFactory.initElements(driver3,this);
		}
		public void setUsername(String Username) {
			Usrname.sendKeys(Username);
			
		}
		public void phoneNumber(String phn) {
			Phoneno.sendKeys(phn);
		}
		public void mailId(String mail) {
//			WebElement m =driver.findElement(By.xpath("//input[@placeholder='Mail']"));
//			m.sendKeys(mail);
			Mail.sendKeys(mail);
			
		}
		public void setPassword(String Password) {
			Paswrd.sendKeys(Password);
		}
		public void confirmPwd(String ConfirmPassword) {
			Confirmpwd.sendKeys(ConfirmPassword);
		}
		public void registerClick() throws InterruptedException {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();",button);
			Thread.sleep(1000);
			
		}
		public void Alert() {
		driver.switchTo().alert().accept();
		
		}
		
		

	

}
