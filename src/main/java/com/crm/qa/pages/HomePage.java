package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath="//*[@id=\"main-nav\"]/div[3]/a/span")
	WebElement Contacts;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/div[5]/a/span")
	WebElement Deals;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/div[6]/a")
	WebElement Tasks;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/div[3]/button/i")
	WebElement NewContact;
	
	@FindBy(xpath="//*[@id=\"top-header-menu\"]/div[2]/span[1]")
	//*[@id="top-header-menu"]/div[2]/span[1]
	//*[@id="top-header-menu"]/div[2]/span[1]
	//*[@id="top-header-menu"]/div[2]/span[1]
	WebElement UserName;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyHomePageTitle() {
		return driver.getTitle();
	}
	public String VerifyUserName() {
		return UserName.getText();
	}
	
	public ContactsPage clickContacts() {
		Contacts.click();
		return new ContactsPage();
	}
	public DealsPage clickDealse() {
		Deals.click();
		return new DealsPage();
	}
	public TasksPage clickTasks() {
		Tasks.click();
		return new TasksPage();
	}
	public NewContactPage clickNewContacts() {
		NewContact.click();
		return new NewContactPage();
	}

}
