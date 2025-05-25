package org.example.ex13_JavaScript;

import org.example.CommonToAll;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Lab40_JS_Code extends CommonToAll {

@Test
    public void test() {

        JavascriptExecutor js = (JavascriptExecutor) driver ;
        js.executeScript("window.location = 'https://www.google.com'");


        }

    }

