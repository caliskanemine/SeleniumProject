package com.cydeo.tests.day6_alerts_iframes_windows;


import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T5_Windows_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //TC #5: Window Handle practice
        //1. Create a new class called: T5_WindowsPractice
        //2. Create new test and make set ups
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //3. Go to : https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");

    }



    @Test
    public void multiple_window_test(){

        //storing the main page's window handle as string is
        String mainHandle= driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);

        //4. Assert: Title is “Windows”
        String actualTitle= driver.getTitle();
        String expectedTitle= "Windows";
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println("Title before click: "+actualTitle);

        //5. Click to: “Click Here” link
        WebElement clickHereLink= driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

        //6. Switch to new Window.
        Set<String> allWindwHandles= driver.getWindowHandles();

        for (String each: driver.getWindowHandles()){
            driver.switchTo().window(each);
            System.out.println("Current title while switching windows: "+driver.getTitle());
        }



        //7. Assert: Title is “New Window”
        actualTitle= driver.getTitle();
        String expextedTitleAfterClick= "New Window";
        Assert.assertEquals(actualTitle, expextedTitleAfterClick);
        System.out.println("Title after click: "+actualTitle);


    }






}


