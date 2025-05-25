package org.example.ex10_ActionClass;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class Lab36_Drag_andSrop extends CommonToAll {

    @Test
    public void test_DragDrop(){

        driver.get("");
        driver.manage().window().maximize();

        WebElement from = driver.findElement(By.id("column-a"));
        WebElement to = driver.findElement(By.id("column-b"));


        Actions actions = new Actions(driver);

        actions.dragAndDrop(from,to).build().perform();



    }
}
