package org.example;

import org.openqa.selenium.By;

import static org.example.Util.clickOnElement;

public class ElectronicsPage extends Util
{   //creating path to click on cell phone
    private By _cellphone=By.xpath("//a[text()=\" Cell phones \"]");
    //create method
    public void clickOnCellphone()
    {   //click on cellphone
        clickOnElement(_cellphone);

    }
}
