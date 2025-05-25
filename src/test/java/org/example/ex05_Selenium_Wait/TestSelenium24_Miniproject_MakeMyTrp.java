package org.example.ex05_Selenium_Wait;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium24_Miniproject_MakeMyTrp extends CommonToAll {


    @Test
    public void test_Selenium() {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximiazed");


        WebDriver driver = new EdgeDriver(edgeOptions);
        // driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());


       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("commonModal__close")));

        waitForVisiblity(driver,3,"//span[@data-cy'closeModal ");

        WebElement icon = driver.findElement(By.className("commonModal__close"));
        icon.click();


        driver.close();


    }
}