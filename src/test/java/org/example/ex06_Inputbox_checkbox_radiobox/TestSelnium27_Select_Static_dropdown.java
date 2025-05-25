package org.example.ex06_Inputbox_checkbox_radiobox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestSelnium27_Select_Static_dropdown {


    public static void main(String[] args) {


        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet_herokuapp.com/dropdown");
        driver.manage().window().maximize();


        WebElement element_select = driver.findElement(By.id("dropdown"));
        Select select = new Select(element_select);

        select.selectByIndex(1);
       // select.selectByVisibleText("Option 1");
        select.selectByValue("2z4e");



    }

}
