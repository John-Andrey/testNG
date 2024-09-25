package org.example.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomerListener implements ITestListener {
    //This belongs to ITestListener and will execute before starting of Test set/batch
    public void onStart(ITestContext arg){
        System.out.println("Start Test execution ....."+arg.getName());

    }

    //This belongs to ITestListener and will execute after starting of Test set/batch
    public void onFinish(ITestContext arg){
        System.out.println("Finish Test execution ....."+arg.getName());

    }
    // This belongs to ITestListener and will execute before the main test start i.e. @Test
    public void ohTestStart(ITestResult arg) {
        System.out.println("Starts test " + arg.getName());
    }

    // This belongs to ITestListener and will execute when a test is skipped
    public void onTestSkipped(ITestResult arg) {
        System.out.println("Skipped test ....  " + arg.getName());
    }


    // This belongs to ITestListener and will execute when a test is passed
    public void onTestSuccess(ITestResult arg) {
        System.out.println("Passed test."+arg.getName());

    }

    // This belongs to ITestListener and will execute when a test is failed
    public void onTestFailure(ITestResult arg) {
        System.out.println("Failed test ... " + arg.getName());
    }

}
