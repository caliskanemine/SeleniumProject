package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3_4_CRM_LOGIN extends TestBase{

    //TC #3: Login scenario

    @Test
    public void crm_login_test(){


        // 1. Create new test and make set ups
        //2. Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");

        //3. Enter valid username
        WebElement inputUsername= driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com");

        //4. Enter valid password
        WebElement inputPassword= driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        //5. Click to `Log In` button
        WebElement loginButton= driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver, "Portal");

    }


    @Test
    public void crm_login_test_2(){

        //TC #3: Login scenario
        // 1. Create new test and make set ups
        //2. Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");

        CRM_Utilities.crm_login(driver);

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver, "Portal");

    }

    public void crm_login_test_3(){

        //TC #3: Login scenario
        // 1. Create new test and make set ups
        //2. Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");

        CRM_Utilities.crm_login(driver, "helpdesk2@cybertecschool.com", "UserUser");

        //6. Verify title is as expected:
        //Expected: Portal
        //BrowserUtils.sleep(2000);
        BrowserUtils.verifyTitle(driver, "(2) Portal");

    }



}
