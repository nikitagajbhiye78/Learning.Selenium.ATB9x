package com.nikitagajbhiye.Tasks;
import io.qameta.allure.Description;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Task2_katalon_demo {

    @Description
    @Test
    public void idrive_demo() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        EdgeDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://www.idrive360.com/enterprise/login");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement username_input = driver.findElement(By.id("username"));
        username_input.sendKeys("augtest_040823@idrive.com");

       WebElement password_box = driver.findElement(By.xpath("//input[@name=\"password\"]"));
       password_box.sendKeys("123456");

       WebElement login_box = driver.findElement(By.xpath("//button[@id=\"frm-btn\"]"));
       login_box.click();

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

       WebElement error_message = driver.findElement(By.xpath("//h5[contains(text(),'Your free trial has expired')]"));
        Assert.assertEquals(error_message.getText(),"Your free trial has expired");


    }
}
