package org.example.ex16_Selenium_Exceptions;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Lab46_selenium_StaleException extends CommonToAll {

    @Test
    public void test_staleException(){

        driver.get("https://google.com");
        System.out.println("start of program");

        WebElement search_input_box = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        System.out.println(driver.getWindowHandle());

        driver.navigate().refresh();

        try {
            search_input_box.sendKeys("testing academy"+ Keys.ENTER);
        } catch (StaleElementReferenceException e) {
            System.out.println("StaleElementReferenceException");
           // throw new RuntimeException(e);
        }

        System.out.println(driver.getWindowHandle());
        System.out.println("End of Program");


    }
}
