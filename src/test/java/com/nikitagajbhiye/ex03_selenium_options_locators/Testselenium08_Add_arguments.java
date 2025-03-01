package com.nikitagajbhiye.ex03_selenium_options_locators;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Testselenium08_Add_arguments {

    @Description("Options Class")
    @Test
    public void test_Selenium01() throws Exception {

        // EdgeOptions, ChromeOptions, FirefoxOptions, SafariOptions
        EdgeOptions edgeOptions = new EdgeOptions();

        // EdgeOptions -> It will help you set the browser
        // options to browsers
        // window - size
        // headless mode - there is not UI -> advantage - Fast Execution
        // full UI mode - default - UI browser
        // incognito mode - switch
        // start Max
        // add extensions - browsers
        // 100 + others , https , http
        // localstorage, download ?

//        edgeOptions.addArguments("--window-size=1280,720");
//        edgeOptions.addArguments("--window-size=800,600");
//        edgeOptions.addArguments("--incognito");
        // edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--headless");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://google.com");


        Thread.sleep(15000);
        driver.quit();
        // It will close all the tabs. - session id == null

    }

}
