package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class TestSelenium15_OptionClasses {


    public static void main(String[] args) throws InterruptedException {


        EdgeOptions edgeOptions = new EdgeOptions();
        //edgeOptions.addArguments("--window-size=1280,720");
       // edgeOptions.addArguments("--window-size=800,600");
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");
        EdgeDriver driver = new EdgeDriver(edgeOptions);


        Thread.sleep(5000);
        driver.quit();


    }
}
