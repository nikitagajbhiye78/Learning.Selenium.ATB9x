package com.nikitagajbhiye.ex05_selenium_Xpath;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Testselenium11 {
  //  //a[text()="Make Appointment"], //*[text()="Make Appointment"], //a[contains(text(),"Make")]`
  //  //a[contains(@href,'./profile.php#login')]

    @Description("Verify katalon web")
    @Test
    public void demo_Xpath() throws InterruptedException {

    EdgeOptions edgeOptions = new EdgeOptions();
    WebDriver driver = new EdgeDriver(edgeOptions);

    driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");

    WebElement make_appointmnet = driver.findElement(By.xpath("//a[@id=\"btn-make-appointment\"]"));
    make_appointmnet.click();

    Thread.sleep(3000);

    WebElement username = driver.findElement(By.xpath("//input[@id=\"txt-username\"]"));
    username.sendKeys("John Doe");

    WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
    password.sendKeys("ThisIsNotAPassword");

    WebElement login = driver.findElement(By.xpath("//button[@id=\"btn-login\"]"));
    login.click();

    Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
    }
}
