package com.nikitagajbhiye.ex12_ActionsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;

public class Testselenium21 {
    EdgeDriver driver;

   @BeforeTest
    public void test_action(){
       EdgeOptions options = new EdgeOptions();
       options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
       options.addArguments("--guest");
       driver = new EdgeDriver(options);
    }

    @Test
    public void test2_action() throws InterruptedException {
       String URL = "https://awesomeqa.com/practice.html";
       driver.get(URL);
       driver.manage().window().maximize();

        WebElement element = driver.findElement(By.name("firstname"));
        Actions action = new Actions(driver);

        // Keyboards - > keyDown -> Shift -> send key -> key Up
        action.keyDown(Keys.SHIFT).sendKeys(element, "nikita gajbhiye").keyUp(Keys.SHIFT).build().perform();

        Thread.sleep(5);
    }

    @AfterTest
    public void close_browser(){

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

      driver.close();
    }

}
