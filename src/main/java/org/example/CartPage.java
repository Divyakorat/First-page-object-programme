package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CartPage extends Util
{   //creting path to check if the product been add to cart successfully
    private By _HTCOneM8AddSuccessfully=By.xpath("//table/tbody/tr[1]/td[@class='product'][a]");

    //creting path to check if the product been add to cart successfully
    private By _HTCMinniAddSuccessfully=By.linkText("HTC One Mini Blue");
    //expected result for first product
    String _expectedText1 ="HTC One M8 Android L 5.0 Lollipop";
    //expected result for second product
    String _expectedText2="HTC One Mini Blue";
    public void userShouldBeAbleToSeeBothProductInCartPage()
    {   //applying explicity wait
        waituntilElementIsclickable(_HTCOneM8AddSuccessfully,20);
        //comparing expected result with actual result
        Assert.assertEquals(getTextFromElement(_HTCOneM8AddSuccessfully),_expectedText1);
        //applying ecplicity wait
        waituntilElementIsclickable(_HTCMinniAddSuccessfully,20);
        //comparing expected result with actual result
        Assert.assertEquals(getTextFromElement(_HTCMinniAddSuccessfully),_expectedText2);
    }

}
