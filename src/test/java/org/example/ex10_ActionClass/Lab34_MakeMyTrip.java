package org.example.ex10_ActionClass;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Lab34_MakeMyTrip extends CommonToAll {


@Test
    public void test_actions_p4(){
    String url = "https://www.makemytrip.com/";
    driver.get(url);
    driver.manage().window().maximize();


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));


    WebElement model = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
    model.click();


    WebElement fromCity = driver.findElement(By.xpath("//input[@data-cy=\"fromCity\"]"));

    Actions actions = new Actions(driver);
    actions.moveToElement(fromCity).click().sendKeys("IXC").build().perform();


    waitForJVM(3000);

    try {
        List<WebElement> list_auto_complete = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));
        for(WebElement e : list_auto_complete){
            if(e.getText().contains("Chandigarh")){
                e.click();
            }
        }
    } catch (StaleElementReferenceException e) {
        //throw new RuntimeException(e);
        System.out.println("Ignore this");

    }

}


}
