package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //1- Set up the "browser driver"
        WebDriverManager.chromedriver().setup();

        //2- Create instance of the Selenium WebDriver
        // This is the line opening an empty browser
        WebDriver driver= new ChromeDriver();

        //This line will maximize the browser size
        driver.manage().window().maximize();

        //driver.manage().window().fullscreen();

        //3- Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        //Get the title of the page
        String currentTitle= driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        // Get the current URL using Selenium
        String curentURL= driver.getCurrentUrl();
        System.out.println("curentURL = " + curentURL);

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //Use selenium to navigate back
        driver.navigate().back();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //Use selenium to navigate forward
        driver.navigate().forward();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //Use selenium to navigate refresh
        driver.navigate().refresh();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //Use navigate().to():
        driver.navigate().to("https://www.google.com");


        //Get the title of the page
       // System.out.println("driver.getTitle() = " + driver.getTitle());
        currentTitle= driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        // Get the current URL using Selenium
        curentURL= driver.getCurrentUrl();
        System.out.println("curentURL = " + curentURL);

        //this will close the currently opened window
        driver.close();

        //this will close all of the opened windows
        driver.quit();


    }
}
