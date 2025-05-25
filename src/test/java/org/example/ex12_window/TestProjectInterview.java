package org.example.ex12_window;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class TestProjectInterview extends CommonToAll {

    @Test
    public void test_intr(){


        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");


        driver.manage().window().maximize();


        //wait
        waitForJVM(5000);

        String parentWindow = driver.getWindowHandle();
        System.out.println("parent--"+parentWindow);


        List<WebElement> list_heatmaps = driver.findElements(By.xpath("//div[@data-qa=\"yedexafobi\"]"));
        Actions actions = new Actions(driver);

        //hover and click
        actions.moveToElement(list_heatmaps.get(1)).click().build().perform();

        waitForJVM(15000);



        Set<String> allHandlrs = driver.getWindowHandles();
        System.out.println(allHandlrs);


        for(String handle : allHandlrs){

           driver.switchTo().window(handle);
           driver.switchTo().frame("heatmap-iframe");
           WebElement clck_map_button = driver.findElement(By.xpath("//span[@data-qa=\"refoyekife\"]"));
           clck_map_button.click();
        }
    }
}
