package org.example;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 {
    void beforeMethod(){
        System.out.println("This will be execute before every method");
    }

    @Test
    void test1(){
        System.out.println("This is test 1");
    }

    @Test
    void test2(){
        System.out.println("This is test 2");
    }
}
