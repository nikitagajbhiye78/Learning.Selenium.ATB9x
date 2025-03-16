package com.nikitagajbhiye.ex10_Alerts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class Testselenium18 {

    @Test
    public void alerts_test() {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //WebElement element = driver.findElement(By.cssSelector("button[onclick=\"jsAlert()\"]"));
        //element.click();

        //WebElement element2 = driver.findElement(By.cssSelector("button[onclick=\"jsConfirm()\"]"));
        //element2.click();

        WebElement element3 = driver.findElement(By.cssSelector("button[onclick=\"jsPrompt()\"]"));
        element3.sendKeys("Nikita");


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(500));
        wait.until(ExpectedConditions.alertIsPresent());


        Alert test = driver.switchTo().alert();
        test.accept();   // test.dismiss(); for cancel


        String result = driver.findElement(By.id("result")).getText();
        // Assert.assertEquals(result, "You successfully clicked an alert");

        Assert.assertEquals(result, "Nikita");


        driver.close();


    }
}
