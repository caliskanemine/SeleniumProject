package com.cydeo.tests.day5_testNG_intro_dropdowns.tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task5 {

    WebDriver driver;


          @BeforeMethod
          public void setupMethod(){
              // 1. Open Chrome browser
              driver= WebDriverFactory.getDriver("chrome");
              driver.manage().window().maximize();
              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

              // 2. Go to http://practice.cybertekschool.com/dropdown
              driver.get("http://practice.cybertekschool.com/dropdown");

          }

            @Test
            public void dropdownTest() throws InterruptedException {
                //TC #5: Selecting state from State dropdown and verifying result

                // 3. Select Illinois
                Select stateDropdown= new Select(driver.findElement(By.xpath("//select[@id='state']")));
                Thread.sleep(1000);
                stateDropdown.selectByValue("IL");
                Thread.sleep(3000);


                // 4. Select Virginia

                stateDropdown.selectByVisibleText("Virginia");
                Thread.sleep(3000);

                // 5. Select California
                stateDropdown.selectByIndex(5);

                // 6. Verify final selected option is California.

                String actualOptionText= stateDropdown.getFirstSelectedOption().getText();
                String expectedOptionText= "California";

                Assert.assertEquals(actualOptionText, expectedOptionText);

                // Use all Select options. (visible text, value, index)


    }







}
