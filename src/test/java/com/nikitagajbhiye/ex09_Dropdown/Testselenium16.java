package com.nikitagajbhiye.ex09_Dropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testselenium16 {

    @Test
    public void dropdownTest(){
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

      WebElement element = driver.findElement(By.id("searchDropdownBox"));
       // By select class
        Select select = new Select(element);
        select.selectByValue("search-alias=baby");
        select.selectByIndex(0);


    }
}
