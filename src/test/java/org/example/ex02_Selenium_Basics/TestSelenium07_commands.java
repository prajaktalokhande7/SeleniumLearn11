package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium07_commands {


    @Test
    public void test_Commands(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        System.out.println(driver.getPageSource());


        driver.quit();

    }
}
