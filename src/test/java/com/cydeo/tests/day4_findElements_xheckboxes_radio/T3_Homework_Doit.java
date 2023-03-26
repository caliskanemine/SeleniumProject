package com.cydeo.tests.day4_findElements_xheckboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_Homework_Doit {

    public static void main(String[] args) {


        //TC #6:  XPATH LOCATOR practice
        // 1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");


        // 2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons");


        // 3. Click on Button 1
        WebElement button1= driver.findElement(By.xpath("//button[@onclick='button1()']"));
        button1.click();

        WebElement button2= driver.findElement(By.xpath("//button[@onclick='button2()']"));


        WebElement button3= driver.findElement(By.xpath("//button[@onclick='button3()']"));

        WebElement button4= driver.findElement(By.xpath("//button[@onclick='button4()']"));

        WebElement button5= driver.findElement(By.xpath("//button[@onclick='button5()']"));

        WebElement dontClickButton= driver.findElement(By.xpath("//button[@onclick='button6()']"));


        //4. Verify text displayed is as expected:
        // Expected: “Clicked on button one!”
        WebElement clickedButtonText= driver.findElement(By.xpath("//p[.='Clicked on button one!']"));

        String actualText= clickedButtonText.getText();
        String expectedText= "Clicked on button one!";

        if (actualText.equals(expectedText)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }

        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
    }
}
