package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestSelinium04 {

//searchContect(Interface)
    //webdriver(interface)
    //RemoteWebDriver(class)
    //ChromiumDriver(c)
    //CdromeDriver.EdgeDriver,BraveDraver(class)

    //chromim is free open src proj, browser endinge
    //chrome is browser crested from chromim engine
    //edge browser is als  created from chromiumDriver
    //firefox is from GECKO engine
    //safari is from applekit engine

    public static void main(String[] args) {
       // SearchContext driver = new ChromeDriver();
       // WebDriver driver = new EdgeDriver();
     //   RemoteWebDriver driver = new EdgeDriver();
        EdgeDriver driver = new EdgeDriver();


    }


    //run on edge / chrome :
    ChromeDriver driver = new ChromeDriver();
    //first on  chrome and then on edge
    //----WebDriver driver = new EdgeDriver();

    //to run on multiple browser, aws m/c
 //   RemoteWebDriver driver (with GRID)




}
