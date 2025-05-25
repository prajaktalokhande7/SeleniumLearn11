package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium05_webDriver {


    @Test
    public void test_WebDriver(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

    }


}
