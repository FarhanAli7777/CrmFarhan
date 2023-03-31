package com.crm.qa.testcase;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LandingPage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;


public class landingpageTest extends TestBase{
	LoginPage loginPage;
	LandingPage LandingPage;
	
	
	
	
	
	public landingpageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		LandingPage = new LandingPage();	
		
		
	}
	
	@Test(priority=1)
	public void landingPageTitleTest(){
		String title = LandingPage.validateLandingPageTitle();
		System.out.println("farhan");
		Assert.assertEquals(title, "Free CRM Software for every business");
	}
	
	@Test(priority=2)
	public void crmLogoImageTest(){
		boolean flag = LandingPage.validateCRMImage();
		Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void clickLogin(){
		loginPage=LandingPage.clickLoginPage();
				 
	}
	/*@DataProvider
	public Object[][] getCRMTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	//@Test(priority=4, dataProvider="getCRMTestData")
	public void validateCreateNewContact(String title, String firstName, String lastName, String company){
		homePage.clickOnNewContactLink();
		//contactsPage.createNewContact("Mr.", "Tom", "Peter", "Google");
		contactsPage.createNewContact(title, firstName, lastName, company);
		
	}*/
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
}


