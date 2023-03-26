package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmartBearUtils {


    //Mini-Task: CREATE A CLASS à SmartBearUtils
    //• Create a method called loginToSmartBear
    public static void loginSmartBear(WebDriver driver){

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        WebElement inputUsername = Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        inputUsername.sendKeys("Tester");

        WebElement inputPassword=Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        inputPassword.sendKeys("test");

        WebElement loginButton= Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$login_button']"));
        loginButton.click();


    }

    //• This method simply logs in to SmartBear when you call it.
    //• Accepts WebDriver type as parameter

}
