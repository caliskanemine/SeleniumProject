package com.cydeo.tests.day5_testNG_intro_dropdowns.tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task6 {

    WebDriver driver;

             @BeforeMethod
             public void setupMethod(){
              //TC #6: Selecting date on dropdown and verifying
             //1. Open Chrome browser
             driver= WebDriverFactory.getDriver("chrome");
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

             //2. Go to https://practice.cydeo.com/dropdown
                 driver.get("https://practice.cydeo.com/dropdown");


    }


             @Test
             public void testPart(){

                 //3. Select “December 1st, 1923” and verify it is selected.
                 Select yearDropdown= new Select(driver.findElement(By.xpath("//select[@id='year']")));
                 yearDropdown.selectByVisibleText("1924");

                 String actualYearDropdownText=yearDropdown.getFirstSelectedOption().getText();
                 String expectedYearDropdownText= "1924";

                 Assert.assertEquals(actualYearDropdownText, expectedYearDropdownText);

                 Select monthDropdown= new Select(driver.findElement(By.xpath("//select[@id='month']")));
                 monthDropdown.selectByValue("11");
                 String actualMonthDropdownText= monthDropdown.getFirstSelectedOption().getText();
                 String expectedMonthDropdownText= "December";

                 Assert.assertEquals(actualMonthDropdownText, expectedMonthDropdownText);

                 Select dayDropdown= new Select(driver.findElement(By.xpath("//select[@id='day']")));
                 dayDropdown.selectByIndex(0);
                 String actualDayDropdownText= dayDropdown.getFirstSelectedOption().getText();
                 String expectedDayDropdownText= "1";

                 Assert.assertEquals(actualDayDropdownText, expectedDayDropdownText);





                 //Select year using : visible text
                 //Select month using : value attribute
                 //Select day using : index number

             }





             }
