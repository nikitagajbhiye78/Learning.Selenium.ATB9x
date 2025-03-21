package com.nikitagajbhiye.ex04_selenium_locators;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testselenium10 {

    @Description("Options Class")
    @Test
    public void test_Selenium() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

       WebElement webElement = driver.findElement(By.partialLinkText("free trial"));
       webElement.click();

       // verify email
        WebElement verify_email = driver.findElement(By.id("page-v1-step1-email"));
        verify_email.sendKeys("nikitagajbhiye32@gmail.com");

       // Verify checkbox policy
        WebElement Checkbox =  driver.findElement(By.name("gdpr_consent_checkbox"));
        Checkbox.click();

        WebElement create_account =  driver.findElement(By.cssSelector("button[data-qa='page-su-submit']"));
        create_account.click();

        Thread.sleep(30000);

        //Verify email already exists message should display "invalid-reason used bcoz that was only unique"
        WebElement error_message = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_message.getText(), "An account with this email already exists. Login Here");

        WebElement Login_here =  driver.findElement(By.linkText("Login Here"));
        Login_here.click();


    }
}
