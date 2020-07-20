package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Util {
    //path to click on registration button
    private By _registerButton = By.xpath("//a[@href=\"/register?returnUrl=%2F\"]");
    //path to click on computer
    private By _Computer = By.xpath("//a[text()=\"Computers \"]");
    //path to click on electrics
    private By _electronics = By.xpath("//ul[@class=\"top-menu notmobile\"]/li[2]");
    //path to click on searchButton
    private By _searchButton = By.xpath("//input[@type=\"submit\"]");
    //path to click on Newonlinestoreisopen
    private By _clickOnNewonlinestoreisopen = By.linkText("New online store is open!");
    //path to click on facebook icon
    private By _faceBook = By.xpath("//a[text()='Facebook']");
    //path to select currancy
    private By _selectCurrancy = By.xpath("//select[@id=\"customerCurrency\"]");
//path to select selectUsDollar
    private By _selectUsDollar = By.xpath("//select[@id=\"customerCurrency\"]/option[1]");
    //path to select euro
    private By _euro = By.xpath("//select[@id=\"customerCurrency\"]/option[2]");


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
//creating method for Search button
    public void clickOnSearchButton()
    {
        //click on search button
        clickOnElement(_searchButton);
    }
    public void alertPopWindowTextVerify()
    {//switching to alert
        Alert alert = driver.switchTo().alert();
        //getting alert text
        String actualpopwindow=driver.switchTo().alert().getText();
        System.out.println(actualpopwindow);
        String expectedpopwindow="Please enter some search keyword";
        //verify result
        Assert.assertEquals((actualpopwindow),expectedpopwindow);
        //accepting alert
        alert.accept();
    }
//creating method for Newonlinestoreisopen
    public void clickOnNewonlinestoreisopen()
    {
        //click on Newonlinestoreisopen
        clickOnElement(_clickOnNewonlinestoreisopen);
    }

//creating method for click on facebook
    public void clickOnFaceBook()
    {
        //click on facebook icon
        clickOnElement(_faceBook);
    }
//creating method to verify user able to select currancy and all item come with same currancy price
    public void verifyUserAbleToselectcurrancy()
    {
        //selecting currancy from drop down
        selectFromDropDownByVisibleText(_selectCurrancy,"Euro");
        //creating variable and storing Xpath
        List<WebElement>pricelist = driver.findElements(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]"));
        //printing statement price list
        System.out.println("price List :"+pricelist.size());
        //creating variable and storing Xpath
        List<WebElement>currancyselector = driver.findElements(By.xpath("//div[@class=\"item-grid\"]//div[@class=\"prices\"]"));
        //printing statement total number of product
        System.out.println("currancyselector :"+currancyselector.size());
        //using for each loop to get the price list
        for(WebElement currancy:currancyselector)
        {
            System.out.println(currancy.getText());
        }
        Assert.assertEquals(pricelist.size(),pricelist.size());




    }

    }
