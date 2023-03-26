package com.cydeo.tests.day2_locators_getText_getAttribute.HOMEWORK;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {

    public static void main(String[] args) throws InterruptedException {

        //TC #2: Facebook incorrect login title verification
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        // 3. Enter incorrect username
        WebElement emailInput= driver.findElement(By.id("email"));
        emailInput.sendKeys("neolaki@email.com");

        // 4. Enter incorrect password
        WebElement passwordInput= driver.findElement(By.name("pass"));
        passwordInput.sendKeys("skdhjfdgd"+ Keys.ENTER);

        Thread.sleep(5000);

        // 5. Verify title changed to:  Expected: “Log into Facebook”
        String actualTitle= driver.getTitle();
        String expectedTitle= "Log into Facebook";



        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }





    }
}
