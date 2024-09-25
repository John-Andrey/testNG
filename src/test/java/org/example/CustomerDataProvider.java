package org.example;

import org.testng.annotations.DataProvider;

public class CustomerDataProvider {
    @DataProvider(name="LoginDataProvider")
    public Object[][] getData(){

        Object[][] data = {{"abc@gmail.com", "abc"}, {"xyz@gmail.com", "xyz"}, {"mno@gmail,com", "mno"}};
        return data;
    }
}
