package org.example;

import org.testng.annotations.Test;

public class PriorityExample {
    @Test(priority = 0)
    void testOne(){
        System.out.println("This is test one");

    }
    @Test(priority = 1)
    void testTwo(){
        System.out.println("This is test two");
    }

    @Test(priority = 2)
    void testThree(){
        System.out.println("This is test three");
    }
    @Test(priority = 3)
    void testFour(){
        System.out.println("This is test four");
    }
}
