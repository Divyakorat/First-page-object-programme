package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.stalenessOf;

public class Util extends BasePage{
    public static void waituntilElementIsclickable(By by, int time)
{
    WebDriverWait wait = new WebDriverWait(driver, time);

    wait.until(elementToBeClickable(by));
}
    //reusable method for sleep
    public static void sleep1(int n)
    {
        try
        {
            Thread.sleep(n * 1000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    //reusable method to click on elements
    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }
    //reusable method to type text elements
    public static void typeText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }
    //reusable method to get text from elements
    public static String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }
    //Time stamp
    public static long timestamp()
    {
        return (System.currentTimeMillis());

    }
    //reusable method for select from dropdown by visible text
    public static void selectFromDropDownByVisibleText(By by, String text)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    //reusable method for select from dropdown by text value
    public static void selectFromDropDownByTextvalue(By by, String value)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(value);
    }
    //reusable method to get String text
    public static String getTextFromEliment(By by, String text)
    {
        return driver.findElement(by).getText();
    }
    public static void login()
    {
        clickOnElement(By.className("ico-login"));
        typeText(By.id("Email"),"divyapatel@gmail.com");
        typeText(By.id("Password"),"dp123456");
        clickOnElement(By.xpath("//input[@value=\"Log in\"]"));
    }
    public static String alertMethod()
    {
        driver.switchTo().alert().accept();
      return driver.switchTo().alert().getText();

    }
    public void takeScreenShot(String screenShotName)
    {
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        try {

            FileUtils.copyFile(srcFile, new File("src\\ScreenShot\\"+screenShotName+".jpg"));

        } catch (IOException e) {

            e.printStackTrace();

        }
    }

}
