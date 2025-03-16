package com.nikitagajbhiye.ex15_FileUpload;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testselenium27 {
    EdgeDriver driver;
    @Description("Verify broswer is initiaze")
    @BeforeTest
    public void initiaze(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver(options);
    }

    @Description("Verify file upload is done")
    @Test
    public void test(){
        driver.get("https://demoqa.com/upload-download");
        WebElement file_upload = driver.findElement(By.xpath("//input[@class=\"form-control-file\"]"));

        String working_dir = System.getProperty("user.dir");
        System.out.println(working_dir);

        file_upload.sendKeys( working_dir+"/src/test/java/com/nikitagajbhiye/ex15_FileUpload/fileupload.ex");

    }
    @Description("Verify browser is closed")
    @AfterTest
    public void close_broswer(){

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
