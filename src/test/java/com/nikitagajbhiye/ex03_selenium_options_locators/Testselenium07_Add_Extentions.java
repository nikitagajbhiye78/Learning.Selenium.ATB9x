package com.nikitagajbhiye.ex03_selenium_options_locators;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Testselenium07_Add_Extentions {

    @Description("Open the App.vwo.com and Get the title")
    @Test
    public void demo (){

        EdgeOptions edgeOptions = new EdgeOptions();

        edgeOptions.addArguments("-- window-size=1920, 1080");
        edgeOptions.addExtensions(new File("src/test/java/com/nikitagajbhiye/ex03_selenium_options_locators/AdBlock-—-block-ads-across-the-web-Chrome-Web-Store.zip"));

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com/watch?v=BwTSxsAqlEc");


    }
}
