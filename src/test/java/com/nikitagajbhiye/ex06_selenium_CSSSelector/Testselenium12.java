package com.nikitagajbhiye.ex06_selenium_CSSSelector;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Testselenium12 {

    @Description("Verify katalon web")
    @Test
    public void demo_Xpath() throws InterruptedException {
        // locating web element by using CSS Selector
        // a[id="value"]
        // a[title*="value"] , // a[title^="value"] , // a[title$="value"]

        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");

       WebElement username_box = driver.findElement(By.cssSelector("input[name=\"username\"]"));
       username_box.sendKeys("admin");

       WebElement password_box = driver.findElement(By.cssSelector("input[name=\"password\"]"));
       password_box.sendKeys("Hacker@4321");

        // element find out by contains
        WebElement Login_button = driver.findElement(By.cssSelector("button[class*=\"oxd-button oxd-button\"]"));
        Login_button.click();

        Thread.sleep(3000);
        driver.close();

    }

}
