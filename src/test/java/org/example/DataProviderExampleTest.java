package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExampleTest {
    @Test(dataProvider="LoginDataProvider", dataProviderClass=CustomerDataProvider.class)
    public void loginTest(String email, String pwd){
        System.out.println(email + " "+pwd);
    }


}
