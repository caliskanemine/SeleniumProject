package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_Homework {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){


        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/tables");
    }

//TC #3: Create a custom method
// 1- Open a chrome browser
// 2- Go to: https://practice.cydeo.com/tables
// 3- Write custom method:
//Method name: getTableGetEmail()
    @Test
    public void getTableGetEmail(){
        WebTableUtils.getTableGetEmail(driver, "table1", "John");
    }



}
