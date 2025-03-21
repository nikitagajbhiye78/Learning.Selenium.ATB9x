package com.nikitagajbhiye.Tasks;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task1_katalon_demo {

    @Description("Open katalon website")
    @Test
    public  void demo_selenium () throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement element = driver.findElement(By.linkText("Make Appointment"));
        element.click();
        // verify web element of username field
        WebElement username = driver.findElement(By.id("txt-username"));
        username.sendKeys("John Doe");

        // verify web element of password field
        WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement button_fun = driver.findElement(By.id("btn-login"));
        button_fun.click();

        // Verify the current URL
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");

    }
}

