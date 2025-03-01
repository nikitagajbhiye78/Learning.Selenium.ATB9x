package com.nikitagajbhiye.ex01_seleniumBasics;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testselenium04 {

    @Description("Verify title of the page")
    @Test
    public void test_selenium (){

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

        Assert.assertEquals(driver.getTitle(), "Login - VWO");

    }
}
