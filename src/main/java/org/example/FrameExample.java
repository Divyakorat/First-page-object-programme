package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class FrameExample extends Util
{//path for frame text
    private By _FrameText=By.xpath("//h1[@class=\"breadcrumb-item\"]");
    //expected result to verify user is on frame example in selenium webdriver window
    String _expectedText="Frames Examples in Selenium Webdriver";
    //path for topic text box
    private By _TopicText=By.xpath("//input[@type=\"text\"]");
    //path for check box
    private By _checkbox=By.xpath("//input[@type=\"checkbox\"]");
//creating method to verify user is on frame work page
    public void verifyuserisonframworkpage()
    {//compering result
        Assert.assertEquals(getTextFromElement(_FrameText),_expectedText);

    }
    //creating method to verify user fill to detail
    public void verifyUserEnterTopic()
    {//switching to frame one
       driver.switchTo().frame("frame1");
       //typing topic text
        typeText(_TopicText,"Hello");
       //switching to frame 3
        driver.switchTo().frame("frame3");
        //clicking on check box
        clickOnElement(_checkbox);
        //switching back to main frame
        driver.switchTo().defaultContent();
        //switching to frame 2
        driver.switchTo().frame("frame2");
        //selecting option from drop down
        selectFromDropDownByVisibleText(By.xpath("//select[@id=\"animals\"]"),"Avatar");

    }
}

