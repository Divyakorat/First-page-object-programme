package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class FaceBookPage extends Util
{//expected url to verify user is on facebook page
    private String expectedURLOfFBPage="https://www.facebook.com/nopCommerce";
    //path for create page button
    private By _createPage=By.xpath("//button[@class=\"_4jy0 _4jy3 _4jy2 _51sy selected _42ft\"]");
    //expected result for create page button
    String expected="Create a Page";
    //actual result for color of create page button
    String actualColour="rgba(66, 183, 42, 1)";
    //expected result for color of create page button
    String expectedColour="rgba(66, 183, 42, 1)";
    //creating method to verify user is on facebook pop up url
    public void verifyfacebookPopUpURL()
    {
        String MainWindow=driver.getWindowHandle();//to handle the window

        // To handle all new opened window.
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1=s1.iterator();

        while(i1.hasNext())
        {
            String ChildWindow=i1.next();

            if(!MainWindow.equalsIgnoreCase(ChildWindow))//switching to child window
            {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                String actualURLOfFBhomePage=driver.getCurrentUrl();
                Assert.assertEquals(actualURLOfFBhomePage,expectedURLOfFBPage);
                //create page button verification
                Assert.assertEquals(getTextFromElement(_createPage),expected);
                //verify colour of create page button
                String color=driver.findElement(_createPage).getCssValue("background-color");
                System.out.println(color);
                //verify colour of create page button
                Assert.assertEquals(actualColour,expectedColour);



                // Closing the Child Window.
                driver.close();
            }
        }
        // Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindow);

    }

}
