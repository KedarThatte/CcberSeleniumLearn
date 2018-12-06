package org.ccberseleniumlearn.core;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseReusable {

    public static WebDriver driver;

    @BeforeTest
    public WebDriver startBrowser(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://gmail.com");
        return driver;

    }

    @AfterTest
    public void browserTeardown(){
        driver.quit();
    }

    /*public WebDriver getDriver(){
        return driver;
    }*/
}
