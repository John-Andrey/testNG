package org.example;
import org.testng.annotations.Test;
/*
 1. Setup - open the browser and application
 2. login
 3. close
* */


public class FirstTestCase {

    @Test(priority = 1)
    void setup(){
        System.out.println("This is a setup test");
    }
    @Test(priority = 2)
    void login(){
        System.out.println("This is the login test");
    }
    @Test(priority = 3)
    void teardown(){
        System.out.println("This is the close test");
    }
}
