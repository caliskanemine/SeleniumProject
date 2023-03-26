package com.cydeo.tests.todoMVC_task;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToDoMVCTask {

    //Write a basic browser automation framework to validate a Polymer website. The focus should
    //be on The Web Application under test http://todomvc.com/
    //1. The first step should be to load the website, click within the JavaScript tab, and select Polymer link.

    @Test
    public void todoMVCtask(){
        Driver.getDriver().get("http://todomvc.com/");

        //2. The second step should be: Add two Todo items
        WebElement javaScriptTab= Driver.getDriver().findElement(By.xpath("//div[.='JavaScript']"));
        javaScriptTab.click();

        WebElement polymerLink= Driver.getDriver().findElement(By.xpath("//a[.='Polymer']"));
        polymerLink.click();
        //Select polymerLink= new Select(Driver.getDriver().findElement(By.xpath("//a[.='Polymer']")));
       // polymerLink.selectByVisibleText("Polymer");

        WebElement todoInput= Driver.getDriver().findElement(By.xpath("//input[@id='new-todo']"));
        todoInput.sendKeys("sjdhsjdghsg"+ Keys.ENTER + "jdhsjdghsg"+ Keys.ENTER);


        //3. Bonus: (optional stretch goal): Edit the content of the second Todo item
         WebElement secondInput= Driver.getDriver().findElement(By.xpath("(//label[@class='style-scope td-item'])[2]"));
         Actions action= new Actions(Driver.getDriver());
         action.doubleClick(secondInput).perform();

        WebElement edit= Driver.getDriver().findElement(By.xpath("//input[@id='edit']"));
         edit.sendKeys(Keys.chord(Keys.CONTROL, "a")+Keys.BACK_SPACE);

         todoInput.sendKeys("dfdf"+ Keys.ENTER);

    }




}
