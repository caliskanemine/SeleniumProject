package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {

    public static String returnOrderDate(WebDriver driver, String customerName) {

        String locator = "//td[.='" + customerName + "']/following-sibling::td[3]";
        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        return customerDateCell.getText();



      }


    public static void orderVerify(WebDriver driver, String customerName, String expectedOrderDate){
        String locator = "//td[.='" + customerName + "']/following-sibling::td[3]";
        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        String actualOrderDate= customerDateCell.getText();
        Assert.assertEquals(actualOrderDate, expectedOrderDate);

    }


    public static void  getTableGetEmail(WebDriver driver, String tableNum, String firstName){

                 String locator="//table[@id='"+tableNum+"']//td[.='"+firstName+"']/following-sibling::td[1]";

                 WebElement customerEmail = driver.findElement(By.xpath(locator));

                 String actualCustomerEmail= customerEmail.getText();
                 System.out.println("actualCustomerEmail = " + actualCustomerEmail);




    }




}
