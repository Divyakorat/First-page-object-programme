package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NewOnlineStroreIsOpenPage extends Util
{//path for leave you comment
    private By _Leaveyourcomment=By.xpath("//div[@class=\"fieldset new-comment\"]/div[1]/strong");
    //path for title test box
    private By _TitleText=By.xpath("//input[@class=\"enter-comment-title\"]");
    //path for comment text box
    private By _CommentText=By.xpath("//textarea[@class=\"enter-comment-text\"]");
    //path for new comment button
    private By _NewCommentButton=By.xpath("//input[@value=\"New comment\"]");
    //verifying path for comment title
    private By _CommentTitle=By.xpath("//strong[text()=\"Divya\"]");
    //verifying path for comment text
    private By _commentsText=By.xpath("//p[text()=\"How are you\"]");
    //path for success message
    private By _successesfulMessage=By.xpath("//div[@class=\"result\"]");
    //expected result
    String _expectedText1="Leave your comment";
    //expected result
    String _expextedText2= "Divya";
    //expected result
    String _expectedText3="How are you";
    //expected result
    String _expectedText4="News comment is successfully added.";

    public void verifyUserInNewOnlineStorePage()
    {//verify result
        Assert.assertEquals(getTextFromElement(_Leaveyourcomment),_expectedText1);
    }
    public void verifyUserEnterComment()
    {//entering title text and comment text
        typeText(_TitleText,"Divya");
        typeText(_CommentText,"How are you");
    }
    public void verifyUserClickOnNewcommentButton()
    {//clicking on new comment button
        clickOnElement(_NewCommentButton);
    }
    public void verifyUserEnetrCommentTitleSuccessfully()
    {//verify result
        Assert.assertEquals(getTextFromElement(_CommentTitle),_expextedText2);
    }
    public void verifyUserenterCommentSuccessfully()
    {//verify result
        Assert.assertEquals(getTextFromElement(_commentsText),_expectedText3);
    }
    public void verifyUserableToSeeSuccessfulMessage()
    {//verify result
        Assert.assertEquals(getTextFromElement(_successesfulMessage),_expectedText4);
    }

}
