package com.nikitagajbhiye.ex18_DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataDrivenByObject_Parallel {

    @DataProvider(name = "LoginData1", parallel = true)
    public Object[][] getData1() {
        return new Object[][]{
                new Object[]{"admin@gmail.com", "pass123"},
                new Object[]{"admin123@gmail.com", "pass123"},
                new Object[]{"admin123@gmail.com", "pass124"}
        };
    }
    @DataProvider(name = "LoginData2", parallel = true)
    public Object[][] getData2() {
        return new Object[][]{
                new Object[]{"admin@gmail.com", "pass123"},
                new Object[]{"admin123@gmail.com", "pass123"},
                new Object[]{"admin123@gmail.com", "pass124"}
        };
    }
    @Test(dataProvider = "LoginData1")
    public void loginTest1(String email, String password) {
        System.out.println(email + " | " + password);
    }

    @Test(dataProvider = "LoginData2")
        public void demotest2(String email, String password) {
            System.out.println(email + " | " + password);
        }
}