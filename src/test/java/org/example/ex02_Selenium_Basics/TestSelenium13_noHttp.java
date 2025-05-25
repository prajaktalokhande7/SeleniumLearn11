package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestSelenium13_noHttp {

    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        //driver.get("google.com"); not possible
driver.get("https://www.google.com");

        driver.quit();
    }
}
