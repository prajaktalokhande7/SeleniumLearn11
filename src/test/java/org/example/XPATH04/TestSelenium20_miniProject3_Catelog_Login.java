package org.example.XPATH04;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium20_miniProject3_Catelog_Login {

    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void test_login(){


        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();


        WebElement btn_make_appointmt = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        btn_make_appointmt.click();

        List<WebElement> ele_placeholder = driver.findElements(By.xpath("//input[@placeholder='Username']"));
        ele_placeholder.get(1).sendKeys("abc");


        driver.quit();

    }


}
