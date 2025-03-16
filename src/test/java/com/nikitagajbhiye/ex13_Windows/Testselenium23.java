package com.nikitagajbhiye.ex13_Windows;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.Set;

public class Testselenium23 {

    @Test
    public void window_test() {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");

        String parentwindow = driver.getWindowHandle();
        System.out.println("Window handle :" + parentwindow);

        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windowHandleshandle = driver.getWindowHandles();
        System.out.println("Window handle :" + windowHandleshandle);

        for (String handle : windowHandleshandle) {
            driver.switchTo().window(handle);
            if (driver.getPageSource().contains("New Window")) {
                System.out.println("Testcase Passed!!");
                break;
            }
        }
    }
}