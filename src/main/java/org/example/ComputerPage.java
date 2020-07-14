package org.example;

import org.openqa.selenium.By;

public class ComputerPage extends Util
{    //creating path to click on desktop
    private By _Desktop=By.xpath("//a[text()=\" Desktops \"]");
    public void clickOnDesktopPage()//create method
    {   //click on desktop
        clickOnElement(_Desktop);
    }
}
