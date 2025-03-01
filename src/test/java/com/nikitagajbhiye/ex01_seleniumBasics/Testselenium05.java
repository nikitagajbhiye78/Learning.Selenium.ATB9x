package com.nikitagajbhiye.ex01_seleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Testselenium05 {

    @Description("Verify title of the page")
    @Test
    public void test_selenium () throws Exception {

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

        Thread.sleep(3000);
        driver.close(); // closes the current window
        driver.quit();  // closes the all the windows/session

    }
}
