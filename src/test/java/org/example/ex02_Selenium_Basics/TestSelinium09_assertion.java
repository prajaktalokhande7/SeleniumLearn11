package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestSelinium09_assertion {

    @Test
    public void test_testngAssertion(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");


        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com");
assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com");

 driver.quit();
    }
}
