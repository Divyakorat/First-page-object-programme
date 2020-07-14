package org.example;

import org.openqa.selenium.By;

import static org.example.Util.*;

public class CellphonePage extends Util
{   //creating path to add the product to the shopping cart
    private By _HTCOneM8=By.xpath("//div[@class=\"item-grid\"]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]");
    //creating path to add the product to the shopping cart
    private By _HTCOneMini=By.xpath("//div[@class=\"item-grid\"]/div[2]/div[1]/div[2]/div[3]/div[2]/input[1]");
    //creating path to click on shopping cart button
    private By _shoppingCart=By.xpath("//span[@class='cart-label']");
    public void UserShouldBeAbleToAddProductToShoppingCartSuccessfully()
    {   //click on HTCone add to cart button
        clickOnElement(_HTCOneM8);
        //applying explicity wait
        waituntilElementIsclickable(_HTCOneMini,30);
        //click on HTConemini add to cart button
        clickOnElement(_HTCOneMini);}
        public void userclickonshopingcartbuttonsuccessfully()
        {
            //using sleep untill found locator
        sleep1(20);
        //click on shopping cart button
        clickOnElement(_shoppingCart);}

}
