package org.example.ex05_Selenium_Wait;

import org.openqa.selenium.edge.EdgeDriver;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSelenium22_ImplicitWait {

    @Description("Verify ebay print the price(iMac)")
    @Test
    public void test_implicit(){


        EdgeDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();



    }
}
