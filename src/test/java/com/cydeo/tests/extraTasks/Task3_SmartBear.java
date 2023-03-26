package com.cydeo.tests.extraTasks;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.SmartBearUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task3_SmartBear {
    @Test
    public void smartBearTest3(){
        //TC#3: Smartbear software order verification
        // 1. Open browser and login to Smartbear software

        SmartBearUtils.loginSmartBear(Driver.getDriver());

       //2. Click on View all orders
        WebElement viewAllOrdersButton= Driver.getDriver().findElement(By.xpath("//a[.='View all orders']"));
        viewAllOrdersButton.click();

      //3. Verify Susan McLaren has order on date “01/05/2010”
        WebElement susansOrderDate= Driver.getDriver().findElement(By.xpath("//table[@class='SampleTable']//td[.='Susan McLaren']//following-sibling::td[3]"));
        String actualSusansOrderDate= susansOrderDate.getText();
        String expectedSusansOrderDate= "01/05/2010";

        Assert.assertEquals(actualSusansOrderDate, expectedSusansOrderDate);

    }


}
