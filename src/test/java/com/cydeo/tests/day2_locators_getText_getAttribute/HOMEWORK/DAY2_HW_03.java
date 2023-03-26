package com.cydeo.tests.day2_locators_getText_getAttribute.HOMEWORK;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DAY2_HW_03 {

    public static void main(String[] args) {

        //TC #3: Back and forth navigation
        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        // 2- Go to: https://google.com
        driver.get("https://google.com");

        // 3- Click to Gmail from top right.
        WebElement abTestLink= driver.findElement(By.linkText("Gmail"));
        abTestLink.click();

        // 4- Verify title contains:  Expected: Gmail
        WebElement headerText= driver.findElement(By.linkText("Gmail"));
        String expectedTitle= "Gmail";
        String actualTitle= headerText.getText();

        // 5- Go back to Google by using the .back();
        driver.navigate().back();

        // 6- Verify title equals:  Expected: Google
        actualTitle= driver.getTitle();
        expectedTitle= "Google";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Google Title Verification PASSED!");
        }else{
            System.out.println("Google Title Verification FAILED!");
        }



    }
}
