package org.example.ex01_Selenium_Basics;

//import jdk.jfr.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium02 {

  //  @Description("Open the vwo and verify the title")
    @Test
    public void test_sel(){
        EdgeDriver driver = new EdgeDriver();
        //create 16 digit session id

        driver.get("http://app.vwo.com");
        Assert.assertEquals(driver.getCurrentUrl(),"http://app.vwo.com");
        driver.quit();// close the session
    }



}
