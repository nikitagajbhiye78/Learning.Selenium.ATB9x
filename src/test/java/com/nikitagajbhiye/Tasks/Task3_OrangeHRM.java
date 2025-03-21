package com.nikitagajbhiye.Tasks;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Task3_OrangeHRM {
    @Description
    @Test
    public void idrive_demo() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        EdgeDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");

        WebElement username_box = driver.findElement(By.cssSelector("input[name=\"username\"]"));
        username_box.sendKeys("admin");

        
        WebElement password_box = driver.findElement(By.cssSelector("input[name=\"password\"]"));
        password_box.sendKeys("Hacker@4321");

        // element find out by contains
        WebElement Login_button = driver.findElement(By.cssSelector("button[class*=\"oxd-button oxd-button\"]"));
        Login_button.click();












    }
}