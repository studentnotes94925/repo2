package com.test.www;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private WebDriver driver;
    private static final String BASE_URL = "https://www.yahoo.com";

    @BeforeSuite
    public void BeforeSuite()
    {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        this.driver = new ChromeDriver();
    }

    /**
     * Rigorous Test :-)
     */
    @Test(enabled=false)
    public void shouldAnswerWithTrue()
    {
        Assert.assertTrue( true);
    }

    @Test(description="FIRST SELENIUM TEST", priority=0)
    public void firstSeleniumTest()
    {
        driver.get(this.BASE_URL);
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}
