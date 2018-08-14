package com.app.module.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.module.base.TestBase;

public class HomePage extends TestBase{
	
	
	@FindBy(xpath = "//a[contains(text(),'Login & Signup')]")
	WebElement loginButton;
	
	@FindBy(xpath = "//span[contains(text(),'Electronics')]")
	WebElement electronicsDD;
	
	@FindBy(xpath = "//input[@class='_2zrpKA']")
	WebElement emailTxt;
	
	@FindBy(xpath = "//input[@class='_2zrpKA _3v41xv']")
	WebElement passwordTxt;
	
	@FindBy(xpath = "//input[@class='_2zrpKA _3v41xv']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//div[@class='_2cyQi_']")
	WebElement userText;
	
	@FindBy(xpath = "//div//div//div//button[@class='_2AkmmA _29YdH8']")
	WebElement closePopUpBtn;
	
	//initlilization the page objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateTitle() {
		String actualTitle = driver.getTitle();
		return actualTitle;
	}
	
	public String Login(String emailID, String passId) throws InterruptedException {
		loginButton.click();
	    Thread.sleep(2000);
		emailTxt.sendKeys(emailID);
		passwordTxt.sendKeys(passId);
		loginBtn.click();
		
		String actualUserName = userText.getText();
		return actualUserName;
		
	}
	
	public void closePopUp() throws InterruptedException {
		loginButton.click();
	    Thread.sleep(2000);
		closePopUpBtn.click();
	}
	
	

}
