package com.nikitagajbhiye.ex07_WebTables;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;
import java.util.List;
public class Testselenium13 {
    @Description("Verify katalon web")
    @Test
    public void demo_Xpath(){
        EdgeOptions edgeOptions = new EdgeOptions();
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://awesomeqa.com/webtable.html");
        //table[@id="customers"]/tbody/tr["
        // "]/td["
        // "]
        String first_part =  "//table[@id=\"customers\"]/tbody/tr[" ;
        String second_part = "]/td[";
        String third_part = "]";

        int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();

        for (int i = 2; i <= row; i++) {
            for (int j = 1;  j<=col; j++) {
                String dynamic_path = first_part+i+second_part+j+third_part;
               // System.out.println(dynamic_path);
                String data = driver.findElement(By.xpath(dynamic_path)).getText();
                System.out.println(data);

              if (data.contains("Helen Benette")){
                  String country_path = dynamic_path+"/following-siblings::td";
                  String Country_text = driver.findElement(By.xpath(country_path)).getText();
                  System.out.println("---------");
                  System.out.println("Helen is form an" + Country_text);

              }
            }
        }
    }
}
