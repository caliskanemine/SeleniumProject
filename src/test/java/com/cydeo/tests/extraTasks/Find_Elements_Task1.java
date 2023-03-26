package com.cydeo.tests.extraTasks;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Find_Elements_Task1 {

    @Test
    public void findElementsTest1() {
        //TC #1: Checking the number of links on the page
        //1. Open Chrome browser
        //2. Go to https://www.openxcell.com
        Driver.getDriver().get("https://www.openxcell.com");

        //3. Count the number of the links on the page and verify
        //Expected: 332

        List<WebElement> links = Driver.getDriver().findElements(By.tagName("a"));



        int countOfLinkText = 0;
        int countOfDoesntLinkText=0;
        for (WebElement each : links) {

            if (!(each.getText().isEmpty())) {
                countOfLinkText++;

                System.out.println("Text of the each link = " + each.getText());
            }

            if (each.getText().isEmpty()){
                countOfDoesntLinkText++;
                System.out.println("links that does not have text = " + each.getText());

            }
        }
        System.out.println("count has text = " + countOfLinkText);
        System.out.println("count doesnt text = " + countOfDoesntLinkText);
    }
}