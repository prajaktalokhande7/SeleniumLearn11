package org.example.ex06_Inputbox_checkbox_radiobox;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class TestSelenium26_Input_Checkbox_Radio {


    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        driver.findElement(By.name("firstname")).sendKeys("neha");

        driver.findElement(By.id("sex-1"));
        driver.findElement(By.id("tool-1")).click();


    }
}
