package com.resumebuilder.test;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.resumebuilder.pages.Download;
import com.resumebuilder.pages.EditProfile;
import com.resumebuilder.pages.LoginPage;
import com.resumebuilder.pages.LogoutPage;
import com.resumebuilder.pages.Profile;
import com.resumebuilder.pages.RegistrationPage;
import com.resumebuilder.pages.SignupPage;

//import com.resumebuilder.pages.RegistrationPage;
//import com.resumebuilder.pages.SignupPage;

//Test classes are written here

public class TestClass extends BaseClass{
	
	SignupPage sgobj;
	LoginPage lgobj; 
	Profile pgobj;
	LogoutPage loutobj;
	EditProfile edobj;
	Download dobj;
	RegistrationPage rgobj;
	
	@Test(priority=1)
	public void TC_HP_001() throws InterruptedException {
		sgobj=new SignupPage(driver);
		Thread.sleep(3000);
//		System.out.println("Homepage Validated");
//		String homelink=driver.getTitle();
		//System.out.println(homelink);
				
	}
	@Test(priority=2)
	public void TC_HP_002() throws InterruptedException {
		sgobj.HomeClick();
		sgobj.Aboutus();
		sgobj.TemplateHome();
		sgobj.SignUp();
		sgobj.Search();
		Thread.sleep(3000);
				
	}
	
	@Test(priority=3)
	
		public void TC_UN_001() throws InterruptedException {
			rgobj=new RegistrationPage(driver);
			sgobj.SignIn();
			rgobj.setUsername("Zara");
			rgobj.registerClick();
			Thread.sleep(1000);
			driver.navigate().refresh();		
			
	}
	@Test(priority=4)
	
		public void TC_P_001() throws InterruptedException {
		rgobj.setUsername("Zara");
		rgobj.phoneNumber("98765");
		rgobj.registerClick();
		Thread.sleep(1000);
		driver.navigate().refresh();
	}
	@Test(priority=5)
	
	public void TC_M_001() throws InterruptedException {
		rgobj.setUsername("Zara");
		rgobj.phoneNumber("9876543210");
		rgobj.mailId("abc123@gmail.com");
		rgobj.registerClick();
		Thread.sleep(1000);
		driver.navigate().refresh();
	}
	@Test(priority=6)

		public void TC_M_002() throws InterruptedException {
			rgobj.setUsername("Zara");
			rgobj.phoneNumber("9876543210");
			rgobj.mailId("abc123@gmail");
			rgobj.registerClick();
			Thread.sleep(1000);
			driver.navigate().refresh();
	}
	
	@Test(priority=7)

	public void TC_PW_001() throws InterruptedException {
		rgobj.setUsername("Zara");
		rgobj.phoneNumber("9876543210");
		rgobj.mailId("abc123@gmail");
		rgobj.setPassword("asd2A");
		rgobj.confirmPwd("asd2A");
		rgobj.registerClick();
		Thread.sleep(1000);
		driver.navigate().refresh();
	}
	@Test(priority=8)

	public void TC_PW_002() throws InterruptedException {
		rgobj.setUsername("Zara");
		rgobj.phoneNumber("9876543210");
		rgobj.mailId("abc123@gmail");
		rgobj.setPassword("asd2A");
		rgobj.confirmPwd("Abc@123");
		rgobj.registerClick();
		Thread.sleep(1000);
		driver.navigate().refresh();
	}
	@Test(priority=9)

	public void TC_PW_003() throws InterruptedException {
		rgobj.setUsername("Zara");
		rgobj.phoneNumber("9876543210");
		rgobj.mailId("abc123@gmail");
		rgobj.setPassword("Abc@123");
		rgobj.confirmPwd("Abc@123");
		rgobj.registerClick();
		rgobj.Alert();
		Thread.sleep(2000);
		System.out.println("Successful registration");
	}
	@Test(priority=10)
	public void TC_LG_001() throws InterruptedException
	{
		
		lgobj=new LoginPage(driver);
		lgobj.Signup();
		lgobj.SetName("Zara");
		lgobj.Setpasswrd("");
		lgobj.checkbox();
		lgobj.login();
		Thread.sleep(1000);
		driver.navigate().refresh();
		
	}
	@Test(priority=11)
	public void TC_LG_002() throws InterruptedException
	{
		
		lgobj=new LoginPage(driver);
		lgobj.Signup();
		lgobj.SetName("");
		lgobj.Setpasswrd("Abc@123");
		lgobj.checkbox();
		lgobj.login();
		Thread.sleep(1000);
		driver.navigate().refresh();
	}
		
	@Test(priority=12)
	public void TC_LG_003() throws InterruptedException
	{
		
		lgobj=new LoginPage(driver);
		lgobj.Signup();
		lgobj.SetName("Zara");
		lgobj.Setpasswrd("Abc@123");
		lgobj.login();
		Thread.sleep(1000);
		driver.navigate().refresh();
	}
	@Test(priority=13)
	public void TC_LG_004() throws InterruptedException
	{
		
		lgobj=new LoginPage(driver);
		lgobj.Signup();
		lgobj.SetName("Zara");
		lgobj.Setpasswrd("Abc@123");
		lgobj.checkbox();
		Assert.assertTrue(lgobj.assertion());
		lgobj.login();
		Thread.sleep(1000);
		System.out.println("Successful login");
		
	}
	
	@Test(priority=15)
	public void TC_PC_002() throws InterruptedException {
		driver.navigate().refresh();
		pgobj = new Profile(driver);
		pgobj.myprof();
		pgobj.createprof();
		pgobj.FullName("Zara");
		pgobj.Dob("26-02-2000");
		pgobj.radio("Female");
		
		pgobj.ContactDetails("ABC123@gmail.com","9456738276");
		pgobj.Highschool(1,"94", "Kendriya Vidyalaya", "2015");
		pgobj.HighSecondary(1,"97","kendriya vidyalaya","2017");
		pgobj.graDuation(1, 1,"89","College of Engineering","2021");
		pgobj.PostGraduation(1, 1, "90","College of Engineering","2023");
		
		pgobj.Project();
		pgobj.ProjectKeys("Netflix clone Application");
		pgobj.ProjectDesc("To build a Netflix clone web app using front end technologies in React.js");
		
		pgobj.Qualification();
		pgobj.Course(5, "Software Testing", "95");
		
		pgobj.JobExperience();
		pgobj.JobTitle("Software Tester", "2021","2022");
		
		pgobj.skills("Selenium", "Maeven", "Web technologies");
		pgobj.language("English","Hindi", "Malayalam");
		pgobj.programminglang("C++","70%", "Java", "85%");
		pgobj.Achievements("Implemented a robust quality assurance process, reducing defects by 15% and ensuring compliance with industry standards","Expanded test coverage by identifying and adding critical test scenarios, ensuring comprehensive coverage and minimizing the risk of post-release defects.");
		
		pgobj.About("Results-driven and detail-oriented Software Tester with 1 + year of experience in ensuring the quality and functionality of software applications.");
		pgobj.File("D:\\Software Testing\\Main project\\DigitalResumeBuilder\\profile picture.jpg");
		pgobj.Accept();
		pgobj.CreateProfile();
		Thread.sleep(3000);
//		WebElement locate=driver.findElement(By.xpath("//*[text()='EASILY']"));
//		String actual = locate.getText();
//		String exp="EASILY";
		Assert.assertTrue(pgobj.assertion());
		System.out.println("Profile Created and navigated to Homepage");
		
		}
	@Test(priority=14)
	public void TC_PC_001() throws InterruptedException {
		pgobj = new Profile(driver);
		pgobj.myprof();
		pgobj.createprof();
		pgobj.HighSecondary(1,"97","kendriya vidyalaya","2017");
		pgobj.graDuation(1, 1,"89","College of Engineering","2021");
		pgobj.PostGraduation(1, 1, "90","College of Engineering","2023");
		
		pgobj.Project();
		pgobj.ProjectKeys("Netflix clone Application");
		pgobj.ProjectDesc("To build a Netflix clone web app using front end technologies in React.js");
		
		pgobj.Qualification();
		pgobj.Course(5, "Software Testing", "95");
		
		pgobj.JobExperience();
		pgobj.JobTitle("Software Tester", "2021","2022");
		
		//pgobj.skills("Selenium", "Maeven", "Web technologies");
		//pgobj.language("English","Hindi", "Malayalam");
		pgobj.programminglang("C++","70%", "Java", "85%");
		pgobj.Achievements("Implemented a robust quality assurance process, reducing defects by 15% and ensuring compliance with industry standards","Expanded test coverage by identifying and adding critical test scenarios, ensuring comprehensive coverage and minimizing the risk of post-release defects.");
		
		pgobj.Accept();
		//pgobj.CreateProfile();
		Thread.sleep(5000);
		System.out.println("Profile not created");
		
		}
		
	
	@Test(priority=17)
	public void TC_EP_002() throws InterruptedException {
		edobj = new EditProfile(driver);
		Thread.sleep(1000);
		edobj.myprof();
		Thread.sleep(4000);
		edobj.clickeEditprofile();
		Assert.assertTrue(edobj.assertion());
		edobj.FullName("Zara");
		edobj.Dob("28-10-1997");
		edobj.selectGender();
		
		edobj.ContactDetails("neetu123@gmail.com","9456738276");
		edobj.Highschool(1,"94", "CHSS", "2013");
		edobj.highSecondary(1,"97","CHSS","2015");
		edobj.graDuation(1, 1,"89","SNGCET","2019");
		edobj.postGraduation(1, 1, "90","College of Engineering","2021");

		edobj.Project();
		edobj.ProjectKeys("Netflix clone Application");
		edobj.ProjectDesc("To build a Netflix clone web app using front end technologies in React.js");
		
		edobj.Qualification();
		edobj.Course(5, "Software Testing", "95");
		
		edobj.JobExperience();
		edobj.JobTitle("Software Devoloper", "2021","2022");
		
		edobj.skills("Selenium", "Maeven", "Web technologies");
		Thread.sleep(2000);
		edobj.language("English","Hindi", "Malayalam");
		edobj.programminglang("C++","70%", "Java", "85%");
		edobj.Achievements("Project presentation at smart india hackathon2018, "
				+ "reducing defects by 15% and ensuring compliance with industry standards.","Expanded test coverage by "
						+ "identifying and adding critical test scenarios, ensuring comprehensive "
						+ "coverage and minimizing the risk of post-release defects.");
		
		edobj.About("Results-driven and detail-oriented Software Tester with 1 + year of experience "
				+ "in ensuring the quality and functionality of software applications."
				+ " Proficient in both manual and automated testing methodologies.");
		
		edobj.Accept();
		Thread.sleep(4000);
	
		
		System.out.println("profile not updated successfully");
	
	}
	@Test(priority=16)
	public void TC_EP_001() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(4000);
		edobj = new EditProfile(driver);
		Thread.sleep(4000);
		edobj.myprof();
		Thread.sleep(4000);
		edobj.clickeEditprofile();
		Assert.assertTrue(edobj.assertion());
		edobj.FullName("Zara");
		edobj.Dob("28-10-1997");
		edobj.selectGender();
		
		edobj.ContactDetails("neetu123@gmail.com","9456738276");
		edobj.Highschool(1,"94", "CHSS", "2013");
		edobj.highSecondary(1,"97","CHSS","2015");
		edobj.graDuation(1, 1,"89","SNGCET","2019");
		edobj.postGraduation(1, 1, "90","College of Engineering","2021");

		edobj.Project();
		edobj.ProjectKeys("Netflix clone Application");
		edobj.ProjectDesc("To build a Netflix clone web app using front end technologies in React.js");
		
		edobj.Qualification();
		edobj.Course(5, "Software Testing", "95");
		
		edobj.JobExperience();
		edobj.JobTitle("Software Devoloper", "2021","2022");
		
		edobj.skills("Selenium", "Maeven", "Web technologies");
		Thread.sleep(2000);
		edobj.language("English","Hindi", "Malayalam");
		edobj.programminglang("C++","70%", "Java", "85%");
		edobj.Achievements("Project presentation at smart india hackathon2018, "
				+ "reducing defects by 15% and ensuring compliance with industry standards.","Expanded test coverage by "
						+ "identifying and adding critical test scenarios, ensuring comprehensive "
						+ "coverage and minimizing the risk of post-release defects.");
		
		edobj.About("Results-driven and detail-oriented Software Tester with 1 + year of experience "
				+ "in ensuring the quality and functionality of software applications."
				+ " Proficient in both manual and automated testing methodologies.");
		edobj.File("D:\\Software Testing\\Main project\\DigitalResumeBuilder\\profile picture.jpg");
		edobj.Accept();
		Thread.sleep(3000);
		
		edobj.updateProfile();
		edobj.myprof();
		Thread.sleep(3000);
		String u=driver.getCurrentUrl();
		System.out.println(u);
		System.out.println("profile updated successfully");
		
		
	
	
	}
	@Test(priority=18)
	public void TC_DR_003() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(5000);
		dobj=new Download(driver);
		dobj.clickTemplate();
		Thread.sleep(3000);
		dobj.selectTemplate();
		Thread.sleep(3000);
		dobj.downloadTemplate();
		
		System.out.println("resume successfully downloaded");
	}
	@Test(priority=19)
	public void TC_DR_004() throws InterruptedException {
		dobj=new Download(driver);
		dobj.editDetails();
		edobj = new EditProfile(driver);
		edobj.FullName("Neethu c");
		edobj.Dob("28-10-1997");
		edobj.selectGender();
		
		edobj.ContactDetails("neetu123@gmail.com","9456738276");
		edobj.Highschool(1,"94", "CHSS", "2013");
		edobj.highSecondary(1,"97","CHSS","2015");
		edobj.graDuation(1, 1,"89","SNGCET","2019");
		edobj.postGraduation(1, 1, "90","College of Engineering","2021");

		edobj.Project();
		edobj.ProjectKeys("Netflix clone Application");
		edobj.ProjectDesc("To build a Netflix clone web app using front end technologies in React.js");
		
		edobj.Qualification();
		edobj.Course(5, "Full stack development", "95");
		
		edobj.JobExperience();
		edobj.JobTitle("Software Devoloper", "2021","2022");
		
		edobj.skills("Selenium", "Maeven", "Web technologies");
		Thread.sleep(2000);
		edobj.language("English","Hindi", "Malayalam");
		edobj.programminglang("C++","70%", "Java", "85%");
		edobj.Achievements("Project presentation at smart india hackathon2018, "
				+ "reducing defects by 15% and ensuring compliance with industry standards.","Expanded test coverage by "
						+ "identifying and adding critical test scenarios, ensuring comprehensive "
						+ "coverage and minimizing the risk of post-release defects.");
		
		edobj.About("Results-driven and detail-oriented Software Tester with 1 + year of experience "
				+ "in ensuring the quality and functionality of software applications."
				+ " Proficient in both manual and automated testing methodologies.");
		edobj.File("D:\\Software Testing\\Main project\\DigitalResumeBuilder\\profile picture.jpg");
		edobj.Accept();
		Thread.sleep(3000);
		
		edobj.updateProfile();
		edobj.myprof();
		Thread.sleep(5000);
		dobj=new Download(driver);
		dobj.clickTemplate();
		Thread.sleep(3000);
		dobj.selectTemplate2();
		Thread.sleep(3000);
		dobj.downloadTemplate2();
		
		System.out.println("second resume successfully downloaded");
	}
	@Test(priority=20)
	public void TC_LT_001() throws InterruptedException {
		pgobj.myprof();
		Thread.sleep(15000);
		loutobj= new LogoutPage(driver);
		loutobj.Logoutbtn();
		System.out.println("Successfully logged out");
	}
	
		
}
