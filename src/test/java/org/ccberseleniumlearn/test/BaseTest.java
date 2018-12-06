package org.ccberseleniumlearn.test;

import org.ccberseleniumlearn.core.BaseReusable;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseTest extends BaseReusable {

    /*public BaseTest(WebDriver driver){
        this.driver=driver;
    }*/


    @Test
    public void checkTitle(){

        driver.getCurrentUrl();
        Assert.assertEquals("Gmail",driver.getTitle());
        System.out.println("Test Passed");
    }

}
