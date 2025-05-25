package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium12_navigation {

    @Test
    public void test_Navigation(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");


        driver.navigate().to("https://www.google.com");
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.navigate().back();
    }

}
