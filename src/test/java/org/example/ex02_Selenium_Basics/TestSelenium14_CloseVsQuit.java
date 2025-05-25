package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestSelenium14_CloseVsQuit {


    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");

//
//        Thread.sleep(5000);
//        driver.close();
//

        Thread.sleep(5000);
        driver.quit();



    }
}
