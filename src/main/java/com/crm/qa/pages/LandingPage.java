package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.pages.LoginPage;
import com.crm.qa.base.TestBase;





public class LandingPage extends TestBase {

	
	@FindBy(xpath = "/html/body/div[1]/header/div/nav/div[2]/div/div[1]/div/a")
	WebElement crmLogo;
	
	@FindBy(xpath = "/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")
	WebElement login;
	
	public LandingPage(){
		PageFactory.initElements(driver, this);
	}
	public String validateLandingPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateCRMImage(){
		return crmLogo.isDisplayed();
	}
	
	public LoginPage clickLoginPage() {
		login.click();
		
		return new LoginPage();
	}
}
