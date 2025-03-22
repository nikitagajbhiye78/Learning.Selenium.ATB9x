package com.nikitagajbhiye.ex18_DataDrivenTesting;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting_Excel {

    @Test(dataProvider = "getData", dataProviderClass = UtilExcel.class)
    public void LoginVWO (String email, String password){
        System.out.println("email - " +email);
        System.out.println("password - " +password);
    }
}
