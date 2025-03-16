package com.nikitagajbhiye.ex10_Alerts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class Testselenium17 {

    @Test
    public void alerts_test(){
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://demoqa.com/alerts");

        WebElement element1 = driver.findElement(By.cssSelector("button[id=\"alertButton\"]"));
        element1.click();

        //WebElement element2 = driver.findElement(By.xpath("//button[@id=\"timerAlertButton\"]"));
        //WebElement element3 = driver.findElement(By.xpath("//button[@id=\"confirmButton\"]"));
        //WebElement element4 = driver.findElement(By.xpath("//button[@id=\"promtButton\"]"));


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());


        Alert al_e = driver.switchTo().alert();
        al_e.accept(); // for confirm alerts
        //alert.dismiss();  for cancel alerts


    }
}
