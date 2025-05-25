package org.example.ex15_RelativeLocators;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Lab42 extends CommonToAll {




    @Test
    public void test_login(){

       driver.get("https://awesomeqa.com/practice.html");
       driver.manage().window().maximize();


        WebElement span_element = driver.findElement(By.xpath("//span[text()=\"Years of Experience\"]"));
        driver.findElement((with(By.id("exp-1")).toRightOf(span_element))).click();


       //

        driver.switchTo().frame("result");
        //driver.findElement()






    }
}
