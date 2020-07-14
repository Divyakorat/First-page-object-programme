package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterSuccessPage extends Util
{   //path to see the registerSuccessMessage
    private By _registerSuccessMessage =By.xpath("//div[text()=\"Your registration completed\"]");
    //expected result
    String expectedRegisterSuccessMessage="Your registration completed";
    //created method
    public void usershouldbeabletoregistersuccessfully()
    {
        //comparing expected result with actual result
        Assert.assertEquals(getTextFromElement(_registerSuccessMessage),expectedRegisterSuccessMessage);
    }
}




