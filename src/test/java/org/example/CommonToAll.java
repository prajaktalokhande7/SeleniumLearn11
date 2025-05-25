package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class CommonToAll {


  //  WebDriver driver;
    public void openBrowser(WebDriver driver, String url) {

        //driver = new EdgeDriver();
        driver.get(url);
        driver.manage().window().maximize();

    }

    public void closeBrowser(WebDriver driver){
        driver.quit();
    }


    public void waitForVisiblity(WebDriver driver, int TimeinSec, String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TimeinSec));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));


    }

    public void waitForTextToBePresent(WebDriver driver, int TimeinSec, String xpath, String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TimeinSec));
        //wait.until(ExpectedConditions.textToBePresentInElement(By.xpath(xpath)),text);



    }

    public void waitForJVM(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public EdgeDriver driver;

    @BeforeTest
    public void setUp(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver = new EdgeDriver(edgeOptions);


    }

    @AfterTest
    public void tearDown(){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
 driver.quit();
    }


}
