package com.crm.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LandingPage;
import com.crm.qa.pages.LoginPage;



public class LoginPageTest extends TestBase{
	
	HomePage homePage;
	LoginPage loginPage;
	LandingPage landingPage;
	
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		landingPage=new LandingPage();
		loginPage=new LoginPage();
		 loginPage=landingPage.clickLoginPage();
		 
		
		
	}
	
	@Test(priority=1)
	public void PageTitleTest(){
		
		String title = loginPage.validateLoginPageTitle();
		System.out.println("farhan,validateLoginPageTitle");
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	
	@Test(priority=2)
	public void clickLogin(){
		homePage= loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
				 
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
}





