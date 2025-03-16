package com.nikitagajbhiye.ex16_DragDrop;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;

public class Testselenium29 {
    EdgeDriver driver;
    @BeforeTest
    public void ini_browser() {
        EdgeOptions doption = new EdgeOptions();
        doption.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver(doption);
        driver.manage().window().maximize();
    }

    @Test
    public void drag_drop() {
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

        // Switch to iframe before interacting with elements
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[contains(@data-src, 'photo-manager.html')]")));
        driver.switchTo().frame(iframe);

        // Initialize Actions class
        Actions action = new Actions(driver);

        // Locate the draggable image
        WebElement from = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[contains(@alt, 'The peaks of High Tatras')]")));

        // Locate the trash bin (drop target)
        WebElement to = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trash")));

        // Perform Drag and Drop
        action.dragAndDrop(from, to).build().perform();
    }

    @AfterTest
    public void Close_browser() {
        try {
            Thread.sleep(5000); // Wait for 5 seconds before closing
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit(); // Properly close all browser instances
    }
}




