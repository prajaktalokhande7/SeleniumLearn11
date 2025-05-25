package org.example.ex02_Selenium_Basics;

import org.example.CommonToAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelinium10_MiniProject extends CommonToAll {


    @Test
    public void test_Selenium(){

        WebDriver driver = new EdgeDriver();
       openBrowser(driver,"https://katalon-demo-cura.herokuapp.com/");
       //driver.get("https://katalon-demo-cura.herokuapp.com/");
   //     driver.manage().window().maximize();


        if(driver.getPageSource().contains("CURA")){
            Assert.assertTrue(true);
        }else{
            Assert.fail("CURA Healthcare Service text is not present");

        }

        closeBrowser(driver);

    }
}
