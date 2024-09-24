package org.example;

import org.testng.annotations.*;

public class TC2 {

    @BeforeClass
    void beforeClass(){
        System.out.println("This will be execute before the class");
    }
    @AfterClass
    void afterClass(){
        System.out.println("This will be execute after  the class");
    }


    @BeforeMethod
    void beforeMethod(){
        System.out.println("This will be execute before every method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("This will be execute after every method");
    }

    @Test
    void test3(){
        System.out.println("This is test 3");
    }

    @Test
    void test4(){
        System.out.println("This is test 4");
    }

    @BeforeSuite
    void beforeSuite(){
        System.out.println("This will execute before the suit");
    }

    @AfterSuite
    void afterSuite(){
        System.out.println("This will execute after the suite");
    }

}
