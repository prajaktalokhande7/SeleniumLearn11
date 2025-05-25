package org.example.ex05_Selenium_Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium23_ExplicitWaitFix_vwo {



    @Test
    public void test_Selenium(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximiazed");



        WebDriver driver = new EdgeDriver(edgeOptions);
        // driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");

        WebElement email_textbox = driver.findElement(By.id("login-username"));
        email_textbox.sendKeys("adim@admin.com");

        WebElement pswd = driver.findElement(By.name("password"));
        pswd.sendKeys("12345");

        WebElement btn_submit = driver.findElement(By.id("js-login-btn"));
        btn_submit.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));


        WebElement error_msg = driver.findElement(By.className("notification-box-description"));
        System.out.println(error_msg.getText());

        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");

        driver.quit();

    }







}
