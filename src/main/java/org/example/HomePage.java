package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Util
{
    //path to click on registration button
    private By _registerButton = By.xpath("//a[@href=\"/register?returnUrl=%2F\"]");
    //path to click on computer
    private By _Computer=By.xpath("//a[text()=\"Computers \"]");
    //path to click on electrics
    private By _electronics=By.xpath("//ul[@class=\"top-menu notmobile\"]/li[2]");
    //created method
    public void clickOnRegisterButton()
    {   //click on registrer button
        clickOnElement(_registerButton);

    }
    //created method for computer
    public void clickOnComputer()
    {   //click on computer
        clickOnElement(_Computer);
    }
    //created method for electronics
    public void clickOnElectronics()
    {    //click on electronics
        clickOnElement(_electronics);
    }


}
