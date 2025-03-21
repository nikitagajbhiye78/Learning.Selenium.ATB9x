package com.nikitagajbhiye.ex04_selenium_locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Testselenium09 {

    @Description("Options Class")
    @Test
        public void test_Selenium01() throws InterruptedException {

            EdgeOptions edgeOptions = new EdgeOptions();

            WebDriver driver = new EdgeDriver(edgeOptions);
            driver.get("https://app.vwo.com/#/login");

            // 1. Find the email inputbox and enter the email

            WebElement emailinput = driver.findElement(By.id("login-username"));
            emailinput.sendKeys("nikitagajbhiye32@gmail.com");

            // 2. Find the password inputbox and enter the password

            WebElement passwordbox = driver.findElement(By.name("password"));
            passwordbox.sendKeys("Admin123");

            // 3. Find the submit button and click on it.
            WebElement buttonbox = driver.findElement(By.id("js-login-btn"));
            buttonbox.click();

            Thread.sleep(30000);
            // 4. Find the invalid error message and verify.

            WebElement error_message = driver.findElement(By.className("notification-box-description"));
            Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");

            // linktext & partial linktext is only used where anchortag is present

             //<a
             // href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
             // class="text-link"
             // data-qa="bericafeqo"
             // >Start a free trial<
             // /a>

           WebElement link_Text =  driver.findElement(By.linkText("Start a free trial"));
           WebElement partial_linkText = driver.findElement(By.partialLinkText("free trial"));


        }
    }


