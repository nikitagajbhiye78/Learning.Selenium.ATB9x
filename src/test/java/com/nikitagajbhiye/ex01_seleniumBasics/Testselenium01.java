package com.nikitagajbhiye.ex01_seleniumBasics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testselenium01 {
    @Test
    public void Testdemo(){

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());

    }
}
