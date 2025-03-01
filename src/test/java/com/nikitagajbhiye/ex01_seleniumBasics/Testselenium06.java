package com.nikitagajbhiye.ex01_seleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Testselenium06 {
    @Description("Verify title of the page")
    @Test
    public void test_selenium () throws Exception {

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

       // driver.navigate().to("https://app.vwo.com/#/login"); 0.5% used only

        // navigates commands
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();

    }
}
