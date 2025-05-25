package org.example.ex03_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium19_MiniProject2_TagName {

    @Test
    public void test_vwo_free_trail_error_verify() throws InterruptedException {


        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");

        WebElement partial_match_linkText = driver.findElement(By.partialLinkText("trail"));
        partial_match_linkText.click();

        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trail"));


        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("abc");

        WebElement click_checkbox = driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));
        click_checkbox.click();


        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

        Thread.sleep(5000);
        WebElement err_msg = driver.findElement(By.className("invalid-reaon"));
        Assert.assertEquals(err_msg,"The email address you entered is incorrect.");



        driver.quit();


    }


}
