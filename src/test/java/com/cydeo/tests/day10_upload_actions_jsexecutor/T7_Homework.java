package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_Homework {


    @Test
    public void t7_homeworktask(){


        //TC #7: Scroll using JavascriptExecutor
        // 1- Open a chrome browser
        // 2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get("https://practice.cydeo.com/large");


        // 3- Scroll down to “Cydeo” link
        WebElement cydeoLink= Driver.getDriver().findElement(By.xpath("//a[.='CYDEO']"));

        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();

        BrowserUtils.sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true)", cydeoLink);

        // 4- Scroll up to “Home” link
        // 5- Use below provided JS method only
        //JavaScript method to use : arguments[0].scrollIntoView(true)
        //Note: You need to locate the links as web elements and pass them as arguments into executeScript() method
        WebElement homeLink = Driver.getDriver().findElement(By.xpath("//a[.='Home']"));
        BrowserUtils.sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true)", homeLink);
        //js.executeScript("arguments[1].scrollIntoView(true)",cydeoLink, homeLink);

        //arguments[0]--> this 0 represents the index number of argument or like index of number
        //scrollintoview --> görene kadar scroll yap demek


    }

}
