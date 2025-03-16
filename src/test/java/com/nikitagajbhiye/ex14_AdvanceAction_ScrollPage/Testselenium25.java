package com.nikitagajbhiye.ex14_AdvanceAction_ScrollPage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Testselenium25  {
    @Test
    public void Scoll_test(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
        System.out.println("Scoll page down");

        driver.close();

    }
}
