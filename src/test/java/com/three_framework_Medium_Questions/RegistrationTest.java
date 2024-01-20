package com.three_framework_Medium_Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class RegistrationTest {
	
	public WebDriver driver;
    public RegistrationPage registrationPage;

    @BeforeMethod
    public void setUp() {
        
        driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo");
        registrationPage = new RegistrationPage(driver);
        registrationPage.clickMyAccountLink();
        registrationPage.clickRegisterLink();
    }

    @Test
    public void testSuccessfulRegistration() {
        String firstName = "Motaz";
        String lastName = "Ibrahim";
        String email = "ari298@gmail.com";
        String telephone = "1234567890";
        String password = "password123";

        registrationPage.register(firstName, lastName, email, telephone, password);

        String successMessage = registrationPage.getSuccessMessage();
        Assert.assertEquals(successMessage, "Congratulations! Your new account has been successfully created!");
    }

    @AfterMethod
    public void tearDown() {
        
            driver.quit();
        
    }
}