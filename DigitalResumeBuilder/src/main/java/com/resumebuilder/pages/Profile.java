package com.resumebuilder.pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Profile {
	WebDriver driver;
	
	@FindBy(xpath="//*[text()='My Profile']")
	private WebElement myprof;
	
	
	@FindBy(xpath="//button[text()='Create a Profile Now']")
	private WebElement createprof;
	
//-------------	//creating profile -------------------------------
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement Name;  
	
	@FindBy(xpath="//*[@id='date']")
	private WebElement date;
	
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/p[4]")
	private WebElement radio;
	
	@FindBy(xpath="//*[@value=\"male\"]")
	private WebElement male;
	
	@FindBy(xpath="//*[@value=\"female\"]")
	private WebElement female;
	
	///html/body/app-root/app-sampleform/div/form/p[4]/input[1]
	
	
//-----CONTACT DETAILS-------------------------------------------------------------------------------------
	@FindBy(xpath="//*[@id=\"email_id\"]")
	private WebElement email; 
	
	@FindBy(xpath="//*[@id=\"phone\"]")
	private WebElement phone;
	
//--------Qualification------------------------------------------------------------------------------
	@FindBy(xpath="//*[@id=\"edu_title\"]")
	private WebElement board; 
	
	@FindBy(xpath="//*[@id=\"edu_desc\"]")
	private WebElement percentage;
	
	@FindBy(xpath="//*[@id=\"edu_school\"]")
	private WebElement school; 
	
	@FindBy(xpath="//*[@id=\"edu_year\"]")
	private WebElement year;

//-------- high secondary------------------------------------------------------------------------
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/p[8]/select")
	private WebElement selectboard;
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/p[8]/input[1]")
	private WebElement hsperc;
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/p[8]/input[2]")
	private WebElement hsname;
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/p[8]/input[3]")
	private WebElement ypass;
	
//---------graduation--------------------------------------------------------------------	
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/p[9]/select[1]")
	private WebElement course;
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/p[9]/select[2]")
	private WebElement stream;
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/p[9]/input[1]")
	private WebElement pscore;
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/p[9]/input[2]")
	private WebElement collegename;
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/p[9]/input[3]")
	private WebElement cyearpass;
//---------post graduation-----------------------------------------------------------------	
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/p[10]/select[1]")
	private WebElement pgcourse;
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/p[10]/select[2]")
	private WebElement pgstream;
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/p[10]/input[1]")
	private WebElement pgperc;
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/p[10]/input[2]")
	private WebElement pgname;
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/p[10]/input[3]")
	private WebElement pgpass;

	
//----------Projects-----------------------------------------------------------------------------
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/table[1]/tr[1]/th[2]/button\r\n")
	private WebElement addproject;
	
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/table[1]/tr[2]/td[1]/input")
	private WebElement projectTitle ; 
	
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/table[1]/tr[2]/td[2]/input")
	private WebElement projectDescription ;

//--------- Additional qualification-------------------------------------------------------------
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/table[2]/tr[1]/th[2]/button")
	private WebElement addqualification ;
	
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/table[2]/tr[2]/td[1]/select")
	private WebElement SelectCourse ;
	
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/table[2]/tr[2]/td[2]/input")
	private WebElement CourseName ; 
	
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/table[2]/tr[2]/td[3]/input")
	private WebElement PercScored ;
	
//--------- Job Experience----------------------------------------------------------------------
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/table[3]/tr[1]/th[2]/button")
	private WebElement addExperience ; 
	
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/table[3]/tr[2]/td[1]/input")
	private WebElement jobTitle;
	
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/table[3]/tr[2]/td[2]/input")
	private WebElement StartDate; 
	
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/table[3]/tr[2]/td[3]/input")
	private WebElement EndDate;
	
//----------Skills-----------------------------------------------------------------------------
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/table[4]/tr[1]/th[2]/button")
	private WebElement Skills ; 
	
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/table[4]/tr[2]/td[1]/input")
	private WebElement skill_1 ; 
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/table[4]/tr[3]/td[1]/input")
	private WebElement skill_2 ;
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/table[4]/tr[4]/td[1]/input")
	private WebElement skill_3 ;
//-------languages known-------------------------------------------------------------------	
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/table[5]/tr/th[2]/button")
	private WebElement language ; 
	
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/table[5]/tr[2]/td[1]/input")
	private WebElement lg_1 ; 
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/table[5]/tr[3]/td[1]/input")
	private WebElement lg_2 ;
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/table[5]/tr[4]/td[1]/input")
	private WebElement lg_3;
	
	//-------programming languages -------------------------------------------------------------------	
		@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/table[6]/tr/th[2]/button")
		private WebElement prglanguage ; 
		
		@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/table[6]/tr[2]/td[1]/input")
		private WebElement pg1 ; 
		@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/table[6]/tr[2]/td[2]/input")
		private WebElement perc1 ;
		@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/table[6]/tr[3]/td[1]/input")
		private WebElement pg2;
		@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/table[6]/tr[3]/td[2]/input")
		private WebElement perc2;

//------------Achievements----------------------------------------------------------------------
		@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/table[7]/tr/th[2]/button")
		private WebElement addBtn;
		@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/table[7]/tr[2]/td[1]/input")
		private WebElement ach1;
		@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/table[7]/tr[3]/td[1]/input")
		private WebElement ach2;

	
//------------	About --------------------------------------------------------------------------
	@FindBy(xpath="//*[@name='yourself']")
	private WebElement about ;
	
//-------------image upload----------------------------------------------------------------------
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/p[12]/input")
	private WebElement file ;
	
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/p[13]/input")
	private WebElement accpt;
	
	@FindBy(xpath="/html/body/app-root/app-sampleform/div/form/button")
	private WebElement creatprofile;
	
//--------scroll to top---------------------------------------------------------------------------
	@FindBy(xpath="//*[@id=\"navbar-wd\"]/ul/li[6]/a")
	private WebElement myhome;
	
	public Profile (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
//.............Assertion.........................................................................
	@FindBy(xpath="//*[text()='EASILY']")
	private WebElement locate;
//	@FindBy(xpath="//h1[text()='Create your profile now']")
//	private WebElement locateelement;
	public boolean assertion() {
		return locate.getText().toString().contains("EASILY");
	}
	
	public void myprof() 
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", myprof);		
	}
	public void createprof() throws InterruptedException 
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", createprof);	
		
		Thread.sleep(1000);	
	}
	public void FullName(String name) throws InterruptedException 
	{
		Name.clear();
		Name.sendKeys(name);
		Thread.sleep(1000);
		
	}
	public void Dob(String Date) throws InterruptedException 
	{	
		date.sendKeys(Date);
		Thread.sleep(1000);
	
	}
	public void radio(String value) {
		if(value == "Male") {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", male);
		}
		else if(value=="Female") {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", female);
		}
	}
	
	public void ContactDetails(String mail , String ph ) throws InterruptedException 
	{	
		email.clear();
		email.sendKeys(mail);
		phone.clear();
		phone.sendKeys(ph);
		Thread.sleep(1000);
		
	}
	public void Highschool(int a, String perc, String sch, String yr) throws InterruptedException 
	{
		
		Select dropdown =new Select(board);	
		dropdown.selectByIndex(a);
		percentage.sendKeys(perc);
		school.sendKeys(sch);
		year.sendKeys(yr);
		Thread.sleep(1000);
		
	}
	public void HighSecondary(int a, String percentage , String schoolname ,String yearpass) throws InterruptedException {
		Select dropdown =new Select(selectboard);
		dropdown.selectByIndex(a);
		hsperc.sendKeys(percentage);
		hsname.sendKeys(schoolname);
		ypass.sendKeys(yearpass);
		Thread.sleep(1000);
	}
	
	public void graDuation(int a, int b, String percentage , String cname ,String yearpass) throws InterruptedException {
		Select dropdown =new Select(course);
		dropdown.selectByIndex(a);
		Select dropdown1 =new Select(stream);
		dropdown1.selectByIndex(b);
		pscore.sendKeys(percentage);
		collegename.sendKeys(cname);
		cyearpass.sendKeys(yearpass);
		Thread.sleep(1000);
	}
	public void PostGraduation(int a, int b, String pperc ,String pname ,String yrpass) throws InterruptedException {
		Select dropdown =new Select(pgcourse);
		dropdown.selectByIndex(a);
		Select dropdown1 =new Select(pgstream);
		dropdown1.selectByIndex(b);
		pgperc.sendKeys(pperc);
		pgname.sendKeys(pname);
		pgpass.sendKeys(yrpass);
		Thread.sleep(1000);
	}
	public void Project() throws InterruptedException {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", addproject);
		Thread.sleep(1000);
	
	}
	public void ProjectKeys(String Add) throws InterruptedException {
		projectTitle.sendKeys(Add);
		Thread.sleep(1000);
	}
	public void ProjectDesc(String desc) throws InterruptedException {
		projectDescription.sendKeys(desc);
		Thread.sleep(1000);
	}
	public void Qualification() {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", addqualification);
	
	}
	public void Course(int a , String cname, String pscore) throws InterruptedException {
		Select dropdown =new Select(SelectCourse);
		dropdown.selectByIndex(a);
		CourseName.sendKeys(cname);
		PercScored.sendKeys(pscore);
		Thread.sleep(1000);
	}
	
	public void JobExperience() {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", addExperience);
	
	}
	public void JobTitle(String Add ,String cstart, String cend) throws InterruptedException {
		jobTitle.sendKeys(Add);
		StartDate.sendKeys(cstart);
		EndDate.sendKeys(cend);
		Thread.sleep(1000);
	}
	
	public void skills(String sk1 , String sk2,String sk3) throws InterruptedException {
		for (int i = 0; i < 3; i++) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", Skills);
			
		}
		skill_1.sendKeys(sk1);
		Thread.sleep(1000);
		skill_2.sendKeys(sk2);
		Thread.sleep(1000);
		skill_3.sendKeys(sk3);
		Thread.sleep(1000);
		
	}
	
	public void language(String l1 , String l2, String l3) {
		for (int i = 0; i < 3; i++) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", language);
			
		}
		lg_1.sendKeys(l1);
		lg_2.sendKeys(l2);
		lg_3.sendKeys(l3);
		
	}
	public void programminglang(String l1 , String l2,String l3, String l4) throws InterruptedException {
		for (int i = 0; i < 2; i++) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", prglanguage);
			
		}
		pg1.sendKeys(l1);
		Thread.sleep(1000);
		perc1.sendKeys(l2);
		pg2.sendKeys(l3);
		Thread.sleep(1000);
		perc2.sendKeys(l4);
		
	}
	public void Achievements(String l1 , String l2) throws InterruptedException {
		for (int i = 0; i < 2; i++) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();",addBtn);
			
		}
		ach1.sendKeys(l1);
		ach2.sendKeys(l2);
		Thread.sleep(1000);
	}
	
	public void About(String abt) throws InterruptedException {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", about);
		about.sendKeys(abt);
		Thread.sleep(1000);
	}
	public void File(String f) throws InterruptedException {
		file.sendKeys(f);
		Thread.sleep(3000);
	}
	public void Accept() throws InterruptedException {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();",accpt);
		Thread.sleep(3000);
		
	}
	public void CreateProfile() throws InterruptedException {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();",creatprofile);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}
	


	

	
	


	

	}
