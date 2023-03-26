package com.cydeo.tests.extraTasks;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Task1_SmartBear {

    @Test
    public void smartBearTest(){

        //TC #1: Smartbear software link verification
        //1. Open browser
        //2. Go to website:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        //3. Enter username: “Tester”
        WebElement username= Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        username.sendKeys("Tester");

        //4. Enter password: “test”
        WebElement password= Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        password.sendKeys("test");


        //5. Click to Login button
        WebElement loginButton= Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$login_button']"));
        loginButton.click();

        //6. Print out count of all the links on landing page
       //7. Print out each link text on this page
        int count=0;
        List<WebElement> allLinks= Driver.getDriver().findElements(By.tagName("a"));
        for (WebElement eachLink : allLinks) {
            System.out.println("eachLink.getText() = " + eachLink.getText());
            count++;
        }
        System.out.println("count = " + count);






    }

}
