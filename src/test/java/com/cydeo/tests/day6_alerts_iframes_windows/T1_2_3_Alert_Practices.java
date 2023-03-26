package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_2_3_Alert_Practices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        // TC #1: Information alert practice
        // 1. Open browser
        //2. Go to website: http://practice.cydeo.com/javascript_alerts

        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cydeo.com/javascript_alerts");


    }

    @Test
    public void alert_test1() throws InterruptedException {

        //3. Click to “Click for JS Alert” button
        WebElement jsAlertButton= driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        jsAlertButton.click();
        Thread.sleep(2000);


        //4. Click to OK button from the alert
        //to be able to click to Alert button we need to switch driver's focus to Alert itself
        Alert alert= driver.switchTo().alert();
        alert.accept();


        //5. Verify “You successfully clicked an alert” text is displayed
        WebElement resultText= driver.findElement(By.xpath("//p[@id='result']"));
        //failure message will only be displayed if assertion fails: "Result text is NOT displayed."
        Assert.assertTrue(resultText.isDisplayed(), "Result text is NOT displayed.");

        String expectedText= "You successfully clicked an alert";
        String actualText= resultText.getText();
        Assert.assertEquals(actualText, expectedText, "Actual result text is not as expected");

    }

    @Test
    public void alert_test2(){


        //TC #2: Confirmation alert practice 1. Open browser 2. Go to website: http://practice.cydeo.com/javascript_alerts

        // 3. Click to “Click for JS Confirm” button
        WebElement confirmButton= driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        confirmButton.click();

        // 4. Click to OK button from the alert
        Alert alert= driver.switchTo().alert();
        alert.accept();

        // 5. Verify “You clicked: Ok” text is displayed.
        WebElement resultDisplayed= driver.findElement(By.xpath("//p[.='You clicked: Ok']"));

        if (resultDisplayed.isDisplayed()){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }

    }

    @Test
    public void alert_test3(){

        //TC #3: Information alert practice 1. Open browser 2. Go to website: http://practice.cydeo.com/javascript_alerts
        // 3. Click to “Click for JS Prompt” button
        WebElement jsPromptButton= driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        jsPromptButton.click();

        // 4. Send “hello” text to alert
        Alert alert= driver.switchTo().alert();
        alert.sendKeys("hello");

        // 5. Click to OK button from the alert
        alert.accept();

        // 6. Verify “You entered:  hello” text is displayed.
        WebElement resultText= driver.findElement(By.xpath("//p[.='You entered: hello']"));
        //System.out.println("resultText.isDisplayed() = " + resultText.isDisplayed());
       Assert.assertTrue(resultText.isDisplayed());
    }



}
