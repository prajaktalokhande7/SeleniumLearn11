package org.example.ex16_Selenium_Exceptions;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class Lab45_seleniumExceptions extends CommonToAll {


    @Test
    public void test_seleniumExceptions(){

        driver.get("https://app.vwo.com/");
        driver.manage().window().maximize();

        System.out.println("Start of pgm");

        try{
            driver.findElement(By.id("promod"));

        } catch (NoSuchElementException e) {
           // throw new RuntimeException(e);
            System.out.println("element not found");
        }
    }

}
