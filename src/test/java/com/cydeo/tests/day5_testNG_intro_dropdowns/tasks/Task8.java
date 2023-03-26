
package com.cydeo.tests.day5_testNG_intro_dropdowns.tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task8 {

    WebDriver driver;


    @BeforeMethod
    public void setupMethod(){

         //TC #8: Selecting value from multiple select dropdown
        // 1. Open Chrome browser
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void testPart() throws InterruptedException {

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

        //3. Select all the options from multiple select dropdown.
        Select multiElement = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));

        List<WebElement> allOptions = multiElement.getOptions();

        for (WebElement eachOption : allOptions) {

            eachOption.click();
            System.out.println(eachOption.getText());


           multiElement.deselectAll();
        }




        //4. Print out all selected values.
     //5. Deselect all values.
    }




}


