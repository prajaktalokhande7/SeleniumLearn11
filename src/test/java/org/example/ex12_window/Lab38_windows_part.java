package org.example.ex12_window;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class Lab38_windows_part extends CommonToAll {

    @Test
    public void test(){

        //WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        String parent = driver.getWindowHandle();
        System.out.println(parent); //get the 16digit unique id


        WebElement click_Link = driver.findElement(By.linkText("//a[text()=\"Click Here\"]"));

          click_Link.click();



        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);


        for(String handle: windowHandles){
            driver.switchTo().window(handle);
            if(driver.getPageSource().contains("New window")){
                System.out.println("tC passed");

            }
            driver.switchTo().window(parent);
        }
    }
}
