package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium16_MiniProject2 {


    @Test
    public void test_addBlocker(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--window-size=1920,1080");
        edgeOptions.addExtensions(new File("src/test/java/org/example/Basic2/AdBlock-—-block-ads-across-the-web-Chrome-Web-Store.crx"));

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com/watch?v=BwTSxsAqlEc");

        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
