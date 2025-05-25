package org.example.ex03_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium17_Id_ClassName_name {

    @Description("TC#1 verify with invalid login , error message is displayed")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void tes_vwo_invalid_login() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximiazed");



        WebDriver driver = new EdgeDriver(edgeOptions);
       // driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");

        WebElement email_textbox = driver.findElement(By.id("login-username"));
        email_textbox.sendKeys("adim@admin.com");

        WebElement pswd = driver.findElement(By.name("password"));
        pswd.sendKeys("12345");


//        <button type="submit" id="js-login-btn"
//        class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)"
//        onclick="login.login(event)" data-qa="sibequkica">
//                <span class="icon loader hidden" data-qa="zuyezasugu"></span>
//                <span data-qa="ezazsuguuy">Sign in</span>
//                </button>


        WebElement btn_submit = driver.findElement(By.id("js-login-btn"));
        btn_submit.click();


        Thread.sleep(3000);

        WebElement error_msg = driver.findElement(By.className("notification-box-description"));
        System.out.println(error_msg.getText());

        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");

        driver.quit();

        //<input type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username"
        // data-qa="hocewoqisi" data-gtm-form-interact-field-id="0">

    }
}
