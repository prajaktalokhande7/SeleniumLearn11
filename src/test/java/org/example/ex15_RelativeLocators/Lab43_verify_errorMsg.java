package org.example.ex15_RelativeLocators;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Lab43_verify_errorMsg extends CommonToAll {


    @Test
    public void test_errorMsg(){

        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();

        driver.switchTo().frame("result");

        //WebElement btn_click =
                driver.findElement(By.xpath("//form[@id=\"form\"]/button")).click();

                WebElement uname = driver.findElement(By.xpath("//input[@id='username']"));


                WebElement error_msg = driver.findElement(with(By.tagName("small")).below(uname));

                String errorText = error_msg.getText();
        Assert.assertEquals(errorText,"Username must be at least 3 characters");

    }
}
