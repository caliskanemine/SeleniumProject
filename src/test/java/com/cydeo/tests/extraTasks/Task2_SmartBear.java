package com.cydeo.tests.extraTasks;

import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Task2_SmartBear {

    @Test
    public void smartBearTest2(){

        //TC#2: Smartbear software order placing
        //1. Open browser
        //2. Go to website:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        //3. Enter username: “Tester”
        WebElement username= Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        username.sendKeys("Tester");

        //4. Enter password: “test”
        WebElement password= Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        password.sendKeys("test");


        //5. Click on Login button
        WebElement loginButton= Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$login_button']"));
        loginButton.click();

        //6. Click on Order
        WebElement orderButton= Driver.getDriver().findElement(By.xpath("//a[.='Order']"));
        orderButton.click();

        //7. Select familyAlbum from product, set quantity to 2
        Select select= new Select(Driver.getDriver().findElement(By.xpath("//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")));
        select.selectByVisibleText("FamilyAlbum");

        WebElement quantity= Driver.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtQuantity']"));
        quantity.sendKeys("2");

        //8. Click to “Calculate” button
        WebElement calculateButton= Driver.getDriver().findElement(By.xpath("//input[@value='Calculate']"));
        calculateButton.click();


        //9. Fill address Info with JavaFaker
        Faker faker= new Faker();
        WebElement inputCustomerName= Driver.getDriver().findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']"));
        inputCustomerName.sendKeys(faker.address().firstName()+" "+ faker.address().lastName());

        WebElement inputStreet= Driver.getDriver().findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox2']"));
        inputStreet.sendKeys(faker.address().streetName());

        WebElement inputCity= Driver.getDriver().findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox3']"));
        inputCity.sendKeys(faker.address().cityName());

        WebElement inputState= Driver.getDriver().findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox4']"));
        inputState.sendKeys(faker.address().state());

        WebElement inputZip= Driver.getDriver().findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox5']"));
        inputZip.sendKeys(faker.numerify("########"));


        //• Generate: name, street, city, state, zip code
        //10. Click on “visa” radio button
        WebElement visaButton= Driver.getDriver().findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_0']"));
        visaButton.click();

        //11. Generate card number using JavaFaker
        WebElement inputCardNumber= Driver.getDriver().findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']"));
        inputCardNumber.sendKeys(faker.numerify("####-####-####").replaceAll("-", ""));

        WebElement inputExpireDate= Driver.getDriver().findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox1']"));
        inputExpireDate.sendKeys(faker.numerify("##"+"/"+"##"));

        //12. Click on “Process”
        WebElement processButton= Driver.getDriver().findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_InsertButton']"));
        processButton.click();

        //13. Verify success message “New order has been successfully added.”
        WebElement successMessage= Driver.getDriver().findElement(By.xpath("//strong"));

        System.out.println("successMessage.isDisplayed() = " + successMessage.isDisplayed());


    }
}
