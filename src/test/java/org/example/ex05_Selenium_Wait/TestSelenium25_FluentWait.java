package org.example.ex05_Selenium_Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

public class TestSelenium25_FluentWait {


    @Test
    public void test_Spicelink(){

        WebDriver driver = new EdgeDriver();
        // driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");

        WebElement email_textbox = driver.findElement(By.id("login-username"));
        email_textbox.sendKeys("adim@admin.com");

        WebElement pswd = driver.findElement(By.name("password"));
        pswd.sendKeys("12345");

        WebElement btn_submit = driver.findElement(By.id("js-login-btn"));
        btn_submit.click();

        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(3))
                .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

        WebElement error_message = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver webDriver) {
                return driver.findElement(By.className("notification-box-description"));
            }
        });


        Assert.assertEquals(error_message.getText(),"your email,password,IP address is not correct");
        driver.quit();





    }

}
