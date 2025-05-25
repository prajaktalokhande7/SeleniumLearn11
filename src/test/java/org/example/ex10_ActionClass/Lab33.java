package org.example.ex10_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lab33 {


    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        String url = "https://www.spicejet.com/";
        driver.get(url);
        driver.manage().window().maximize();


     //   WebElement source = driver.findElement(By.xpath("//div[@data-testid=\"search-source-code\"]"));

        WebElement source = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));

        source.sendKeys();

        Actions actions = new Actions(driver);
        actions.moveToElement(source).click().sendKeys("BLR").build().perform();

    }
}
