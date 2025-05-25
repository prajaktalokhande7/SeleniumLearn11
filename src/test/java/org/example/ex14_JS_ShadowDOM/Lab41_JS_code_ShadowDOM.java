package org.example.ex14_JS_ShadowDOM;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Lab41_JS_code_ShadowDOM extends CommonToAll {

    @Test
    public void test_js(){

        driver.get("https://aelectorhub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        waitForJVM(3000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
       WebElement inputbox = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector('div#app2').shadowRoot.querySelector('#pizza');");
inputbox.sendKeys("farmhouse");


      //  WebElement div_to_scroll = driver.findElement(By.id("pizza"));
      //  div_to_scroll.sendKeys("farmhouse");

        //not found bcoz of shadodom



    }

}
