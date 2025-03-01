package com.nikitagajbhiye.ex01_seleniumBasics;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Testselenium03 {

    @Description("Open the URL")
    @Test
    public void test_demo1() throws Exception {

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        if (driver.getPageSource().contains("notification-box-icon Mend(10px)")) {
            System.out.println("Page shoulod be visible");
        } else {
            throw new Exception("Page source is not available");
        }


    }
}
