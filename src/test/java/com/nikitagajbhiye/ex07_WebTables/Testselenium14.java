package com.nikitagajbhiye.ex07_WebTables;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;
import java.util.List;

public class Testselenium14 {
    @Description("Verify katalon web")
    @Test
    public void demo_Xpath() {
        EdgeOptions edgeOptions = new EdgeOptions();
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://awesomeqa.com/webtable1.html");

        WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']"));

        List<WebElement> row_tables = table.findElements(By.tagName("tr"));

        for (int i = 0; i<row_tables.size(); i++) {
            List<WebElement> col = row_tables.get(i).findElements(By.tagName("td"));
          for (WebElement c: col)
              System.out.println(c.getText());
        }}
}
