package org.example;

import org.openqa.selenium.By;

public class DigitalStorm extends Util
{    //creating path to click on email friend button
     private By _EmailFriendButton=By.xpath("//input[@value=\"Email a friend\"]");
     //created method
     public void clickOnEmailButton()
{   //click on email friend button
    clickOnElement(_EmailFriendButton);
}
}
