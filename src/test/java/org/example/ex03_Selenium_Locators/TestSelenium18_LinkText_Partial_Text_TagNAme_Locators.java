package org.example.ex03_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium18_LinkText_Partial_Text_TagNAme_Locators {


    @Description("TC#1 verify with invalid login , error message is displayed")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void test_vwo_login() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximiazed");


        WebDriver driver = new EdgeDriver(edgeOptions);
        // driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");


        WebElement tag_name_linkText_full_match = driver.findElement(By.linkText("Start a free trial"));
        tag_name_linkText_full_match.click();


        WebElement partial_match_linkText = driver.findElement(By.partialLinkText("Trail"));
        partial_match_linkText.click();

        driver.quit();

        //<a href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        // class="text-link" data-qa="bericafeqo">Start a free trial</a>

    }
}
