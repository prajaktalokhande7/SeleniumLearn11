package org.example.ex11_FileUpload;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Lab37_FileUpload extends CommonToAll {



    @Test
    public void test_fileUpload(){

        driver.get("https://awesomeorange.com/selenium/upload.html");
        driver.manage().window().maximize();

        WebElement uploadFile = driver.findElement(By.id("fileToUpload"));

        String workingDir = System.getProperty("user.dir");
        String path_file = workingDir +"/src/test/java/org/example/data.txt";

        uploadFile.sendKeys(path_file);
        driver.findElement(By.name("submit")).click();

    }
}
