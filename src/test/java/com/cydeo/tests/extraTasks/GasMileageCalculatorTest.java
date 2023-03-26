package com.cydeo.tests.extraTasks;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GasMileageCalculatorTest {

    @Test
    public void gasMileageTest() throws InterruptedException {
        //Task #: Gas Mileage Calculator Automation Test
        //1. Add a new class GasMileageCalculatorTest
        //2. Go to https://www.calculator.net
        Driver.getDriver().get("https://www.calculator.net");

        //3. Search for “gas mileage” using search box
        WebElement searchBox= Driver.getDriver().findElement(By.xpath("//input[@id='calcSearchTerm']"));
        searchBox.sendKeys("gas mileage");

        //4. Click on the “Gas Mileage Calculator” link
        WebElement gasMileageCalculatorLink= Driver.getDriver().findElement(By.xpath("//a[.='Gas Mileage Calculator']"));
        gasMileageCalculatorLink.click();

        //5. On Next page verify:
        //a. Title equals: “Gas Mileage Calculator”
        String actualTitle= Driver.getDriver().getTitle();
        String expectedTitle= "Gas Mileage Calculator";
        Assert.assertEquals(actualTitle, expectedTitle);

        //b. “Gas Mileage Calculator” label is displayed
        WebElement label= Driver.getDriver().findElement(By.xpath("//h1[.='Gas Mileage Calculator']"));
        System.out.println("label.isDisplayed(), expected true = " + label.isDisplayed());


        //6. Locate, clear and type “7925” into “Current odometer” field
        WebElement currentOdometer= Driver.getDriver().findElement(By.xpath("//input[@name='mucodreading']"));
        currentOdometer.clear();
        Thread.sleep(2000);
        currentOdometer.sendKeys("7925");

        //7. Locate, clear and type “7550” into “Previous odometer” field
        WebElement previousOdometer= Driver.getDriver().findElement(By.xpath("//input[@name='mupodreading']"));
        previousOdometer.clear();
        Thread.sleep(2000);
        previousOdometer.sendKeys("7550");


        //8. Locate, clear and type “16” into “Gas added” field
        WebElement gasAdded= Driver.getDriver().findElement(By.xpath("//input[@name='mugasputin']"));
        gasAdded.clear();
        Thread.sleep(2000);
        gasAdded.sendKeys("16");


        //9. Locate, clear and type “3.55” into “Gas price” field
        WebElement gasPrice= Driver.getDriver().findElement(By.xpath("//input[@name='mugasprice']"));
        gasPrice.clear();
        gasPrice.sendKeys("3.55");

        //10. Click on Calculate button
        //WebElement calculateButton= Driver.getDriver().findElement(By.xpath("//table//tbody//input[@value='Calculate'][1]']"));
        //calculateButton.click();

        //11. Verify mpg value is as expected:
        //Expected value: “23.44 mpg”
        //WebElement mpgValue= Driver.getDriver().findElement(By.xpath("//p[@class='verybigtext']//b"));

    }
}
