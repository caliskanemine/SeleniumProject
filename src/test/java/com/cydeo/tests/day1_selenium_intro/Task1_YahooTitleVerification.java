package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://yahoo.com");

        String actualTitle= driver.getTitle();
        System.out.println(actualTitle);

        String expectedTitle= "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title is expected. Verification PASSED!");
        }else{
            System.out.println("Title is not as expected. Verification FAILED!");
        }



    }
}
