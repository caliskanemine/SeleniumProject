package com.cydeo.tests.day5_testNG_intro_dropdowns.tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task7 {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        //TC #7: Selecting value from non-select dropdown
        // 1. Open Chrome browser
        // 2. Go to https://practice.cydeo.com/dropdown
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void testNonselectDropdown(){

        // 3. Click to non-select dropdown
        WebElement dropdownLinkButton= driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        dropdownLinkButton.click();

        // 4. Select Facebook from dropdown
        WebElement facebookOption= driver.findElement(By.xpath("//a[.='Facebook']"));
        facebookOption.click();

        // 5. Verify title is “Facebook - Log In or Sign Up”
        String actualTitle= driver.getTitle();
        String expectedTitle= "Facebook - Giriş Yap veya Kaydol";

        Assert.assertEquals(actualTitle, expectedTitle);
    }

}
