package org.example;

import org.openqa.selenium.By;

public class ProductEmailAFriend extends Util
{   //path for enterFriendEmail field
    private By _enterFriendEmail=By.id("FriendEmail");
    //path for yourEmailAddress field
    private By _yourEmailAddress=By.id("YourEmailAddress");
    //path for personalmessage field
    private By _personalMessage=By.id("PersonalMessage");
    //path for click on send email button
    private By _sendEmailButton=By.xpath("//input[@name=\"send-email\"]");
   //created method
    public void userEnterFriendEmailDetail()
    {   //Entering friends email
        typeText(_enterFriendEmail,"abc+"+timestamp()+"@gmail.com");
        //entering personal message
        typeText(_personalMessage,"abcdefg");
        //click on send email button
        clickOnElement(_sendEmailButton);
    }

}
