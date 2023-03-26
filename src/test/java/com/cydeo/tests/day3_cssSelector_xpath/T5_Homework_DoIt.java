package com.cydeo.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_Homework_DoIt {

    public static void main(String[] args) {


        //TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        // 2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        // 3- Enter incorrect username into login box:
        WebElement userName= driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        userName.sendKeys("sajhdgs");

        // 4- Click to `Reset password` button
        WebElement resetPasswordButton= driver.findElement(By.xpath("//button[@value='Reset password']"));
        resetPasswordButton.click();


        // 5- Verify “error” label is as expected Expected: Login or E-mail not found
        WebElement errorLabel= driver.findElement(By.xpath("//div[@class='errortext']"));
        String expectedLabel= "Login or E-mail not found";
        String actualLabel= errorLabel.getText();

        if (actualLabel.equals(expectedLabel)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed!");
        }

        //PS: Inspect and decide which locator you should be using to locate web elements.
        //PS2: Pay attention to where to get the text of this button from
    }


}
