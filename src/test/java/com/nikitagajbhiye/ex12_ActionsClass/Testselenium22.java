package com.nikitagajbhiye.ex12_ActionsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

@Test
public class Testselenium22 {
    public void test_action() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));
        driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")).click();

      WebElement from_city = driver.findElement(By.xpath("//input[@class=\"react-autosuggest__input react-autosuggest__input--open\"]"));

        Actions action = new Actions(driver);
        action.moveToElement(from_city).click().sendKeys("del").build().perform();

        action.moveToElement(from_city).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).build().perform();


//   another method to select dropdown
//        List<WebElement> list_auto_complete = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));
//
//        for(WebElement e : list_auto_complete){
//            if(e.getText().contains("New Delhi")){
//                e.click();
//                break;






}
}