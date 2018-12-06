package org.ccberseleniumlearn.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
public class ListenerTest implements ITestListener {

    String className;
    String simpleClassName;
    String datefolder;


    public void onTestStart(ITestResult result){
        className = result.getMethod().getTestClass().getName();
        simpleClassName = className.substring(className.lastIndexOf('.') + 1);
        System.out.println("class Name - " + simpleClassName + " and Method Name -" + result.getName() + " started Execution" );

    }

    public void onTestSuccess(ITestResult result){
        System.out.println("class Name - " + simpleClassName + " and Method Name -" + result.getName() + " has been executed and passed" );

    }

    public void onTestFailure(ITestResult result){
        System.out.println("class Name - " + simpleClassName + " and Method Name -" + result.getName() + " has been executed and Failed" );

    }

    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub

    }

    public void onStart(ITestContext context) {
        //runid=System.getProperty("Runid");

    }

    public void onFinish(ITestContext context) {

    }

}
