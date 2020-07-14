package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
//created class and extends with Util class to use reusable method from util class
public class EmailSuccessMessage extends Util
{
       private By _EmailSuccessMessage=By.xpath("//div[@class=\"result\"]");//creating path to see the email success message
    String expectedMessage="Your message has been sent.";//writing expected message
    //create method
    public void verifyUserSentEmailMessageSuccesfully()
    {
        Assert.assertEquals(getTextFromElement(_EmailSuccessMessage),expectedMessage);//compare expected result to actual result
    }
}
