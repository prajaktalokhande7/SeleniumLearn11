package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium11_ChangeDriver {


    public static void main(String[] args) {
      ChromeDriver driver = new ChromeDriver();
       // driver = new FirefoxDriver();

        WebDriver driver1 = new EdgeDriver();
        driver1 = new FirefoxDriver();
    }
}
