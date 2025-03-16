package com.nikitagajbhiye.ex11_SVG;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;

public class Testselenium19 {
    EdgeDriver driver;

    @BeforeTest
    public void svg_test() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver();
    }

    @Test
    public void flipcard_search() {

        driver.get("https://www.flipkart.com/");
        driver.findElement(By.name("q")).sendKeys("Macmini");
        List<WebElement> SVGelement = driver.findElements(By.xpath("//*[name()='svg']"));
        SVGelement.get(0).click();

    }

    @AfterTest
    public void closeBrowser() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    driver.close();

    }
}