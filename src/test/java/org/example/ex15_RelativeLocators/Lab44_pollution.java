package org.example.ex15_RelativeLocators;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Lab44_pollution extends CommonToAll {


    @Test
    public void test_pollution(){

        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder=\"Search\"]"));
                searchBox.sendKeys("india"+ Keys.ENTER);

                waitForJVM(5000);

               List<WebElement> locations = driver.findElements(By.xpath("//div[contains(@class,\"location-name\")]/p"));


               for(WebElement location : locations){

                   String rank = driver.findElement(with(By.tagName("p")).toLeftOf(location)).getText();
                   String aqi = driver.findElement(with(By.tagName("span")).toRightOf(location)).getText();
               }

    }

    //


    
}
