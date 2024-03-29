package com.three_framework_Medium_Questions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest {
	
	
	    public WebDriver driver;
	    public HomePage homePage;

	    @BeforeMethod
	    public void setUp() {
	        
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://rediff.com");
	        homePage = new HomePage(driver);

	    }

	    @Test
	    public void testLogoIsDisplayed() {
	        
	        Assert.assertTrue(homePage.isLogoDisplayed());
	        
	    }

	    @Test
	    public void testClickOnSignInLink() {
	        
	        homePage.clickOnSigninLink();

	       
	    }
	    

	    @AfterMethod
	    public void tearDown() {
	            driver.quit();
	        
	    }
	}