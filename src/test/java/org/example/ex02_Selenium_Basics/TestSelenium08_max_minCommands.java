package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestSelenium08_max_minCommands {

    public static void main(String[] args) {

       // System.setProperties();

        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");

        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());



    }


}
