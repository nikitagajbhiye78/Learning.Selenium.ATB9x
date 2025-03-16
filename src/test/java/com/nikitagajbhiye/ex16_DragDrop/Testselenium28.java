package com.nikitagajbhiye.ex16_DragDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Testselenium28 {

    @Test
    public void drag_drop(){
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://demo.automationtesting.in/Static.html");

        Actions action = new Actions(driver);
        WebElement from = driver.findElement(By.id("angular"));
        WebElement to = driver.findElement(By.id("mongo"));

        action.dragAndDrop(from,to).build().perform();

    }
}
