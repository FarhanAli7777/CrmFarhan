package com.crm.qa.testcase;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LandingPage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	HomePage homePage;
	LoginPage loginPage;
	LandingPage landingPage;
	ContactsPage contactsPage;
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		TestBase.initialization();
		landingPage=new LandingPage();
		loginPage=new LoginPage();
		loginPage=landingPage.clickLoginPage();
		homePage= new HomePage();
		contactsPage= new ContactsPage();
		 homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		 
	}
	
	@Test(priority=1)
	public void VerifyTitleTest() {
		String Title= homePage.VerifyHomePageTitle();
		
		Assert.assertEquals(Title,"Cogmento CRM");
		
		
	}
	@Test(priority=2)
	public void verifyUserName() {
		
	
	String UserName=homePage.VerifyUserName();
	Assert.assertEquals(UserName, "farhan ali");
	}
	
	@Test(priority=3)
	public void ContactsTest() {
		contactsPage=homePage.clickContacts();
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
