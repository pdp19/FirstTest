package com.app.module.testCases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.app.module.base.TestBase;
import com.app.module.pages.HomePage;

public class HomePageTest extends TestBase{
	
	HomePage homePage;
	Logger log=Logger.getLogger(HomePageTest.class);
	
	public HomePageTest() {
		super();
	}
	
	@BeforeTest
	public void setUp() {
		invokeBrowser();
		homePage = new HomePage();
		log.info("Logging into App");
	}
	
	@Test(priority=1)
	public void homePageTitleTest() {
		String title = homePage.validateTitle();
		log.info("Title is ------>" + title);
		Assert.assertEquals(title, "Online Shopping Site for Mobiles, Fashion, Books, "
				+ "Electronics, Home Appliances and More");
	}
	
	@Test(priority=3)
	public void checkLoginTest() throws InterruptedException {
		String title = homePage.Login(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertEquals(title, "pradeep");
	}
	
	@Test(priority=2)
	public void closePopup() throws InterruptedException {
		homePage.closePopUp();
	}
	@AfterTest
	public void closeBrowser() {
		//driver.close();
		
	}

}
