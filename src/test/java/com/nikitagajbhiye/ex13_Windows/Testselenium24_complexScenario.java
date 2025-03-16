package com.nikitagajbhiye.ex13_Windows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.util.List;
import java.util.Set;
public class Testselenium24_complexScenario {

    @Test
    public void test() throws InterruptedException {
       EdgeDriver driver = new EdgeDriver();

       driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");
       driver.manage().window().maximize();

       String parentwindow = driver.getWindowHandle();
       System.out.println("Parent:" +parentwindow);

       List<WebElement> list_heatmaps = driver.findElements(By.cssSelector("[data-qa=\"yedexafobi\"]"));

       Actions actions = new Actions(driver);
       actions.moveToElement(list_heatmaps.get(1)).click().build().perform();


       Set<String> allHandles = driver.getWindowHandles();
       System.out.println("All Window Handles: " + allHandles);

       for (String handle : allHandles) {
           if (!handle.equals(parentwindow)) {
               driver.switchTo().window(handle);
               System.out.println("Child Window Title: " + driver.getTitle());
               driver.switchTo().frame("heatmap-iframe");
               WebElement clickmap = driver.findElement(By.cssSelector("[data-qa='liqokuxuba']"));
               clickmap.click();
           }

                driver.switchTo().window(parentwindow);
               // driver.switchTo().defaultContent();

       }}
}
