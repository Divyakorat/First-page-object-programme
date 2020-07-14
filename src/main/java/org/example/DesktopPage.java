package org.example;

import org.openqa.selenium.By;

import static org.example.Util.clickOnElement;

public class DesktopPage extends Util
{   //creating path to click on DigitalStormVANQUISH3CustomPerformancePC
    private By _DigitalStormVANQUISH3CustomPerformancePC=By.xpath("//a[text()=\"Digital Storm VANQUISH 3 Custom Performance PC\"]");
    //create method
    public void clickOnDDigitalsrom()
    {   //click on DigitalStormVANQUISH3CustomPerformancePC
        clickOnElement(_DigitalStormVANQUISH3CustomPerformancePC);
    }
}
