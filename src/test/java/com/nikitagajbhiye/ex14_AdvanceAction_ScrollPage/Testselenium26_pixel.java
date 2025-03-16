package com.nikitagajbhiye.ex14_AdvanceAction_ScrollPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Testselenium26_pixel {

    @Test
    public void pixel_test(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor)driver;

        // for Scroll vertically down till pixel number
        js.executeScript("window.scrollBy(0,2000)");

        // To scoll at the bottom of page height
        js.executeScript("window.scollTo(0,document.body.scollHeight)");

       //

    }
}
