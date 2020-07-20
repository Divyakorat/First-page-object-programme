package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestSuit extends BaseTest {   //created object of home page class
    HomePage homePage = new HomePage();
    //created object of registerPage class
    RegisterPage registerPage = new RegisterPage();
    //created object of registerSuccessPage class
    RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage();
    //created object of  computerPage class
    ComputerPage computerPage = new ComputerPage();
    //created object of  desktopPage class
    DesktopPage desktopPage = new DesktopPage();
    //created object of digitalStor class
    DigitalStorm digitalStorm = new DigitalStorm();
    //created object of productEmailAFriend class
    ProductEmailAFriend productEmailAFriend = new ProductEmailAFriend();
    //created object of emailSuccessMessage class
    EmailSuccessMessage emailSuccessMessage = new EmailSuccessMessage();
    //created object of  electronicsPage class
    ElectronicsPage electronicsPage = new ElectronicsPage();
    //created object of cellphonePage class
    CellphonePage cellphonePage = new CellphonePage();
    //created object of cartPage class
    CartPage cartPage = new CartPage();
    //creating object of newOnlineStroreIsOpenPage
    NewOnlineStroreIsOpenPage newOnlineStroreIsOpenPage=new NewOnlineStroreIsOpenPage();
    //creating object of facebookpage
    FaceBookPage faceBookPage=new FaceBookPage();
    //creating object of frameexample
    FrameExample frameExample=new FrameExample();
    @Test
    public void verifyTheAlertPractice()
    {
        //calling method serchbutton
        homePage.clickOnSearchButton();
        //calling method of alert popup window
        homePage.alertPopWindowTextVerify();
    }
    @Test
    public void iframepractice()
    {//overridding URL
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
        //calling method of frame work page
        frameExample.verifyuserisonframworkpage();
        //calling method of enter details
        frameExample.verifyUserEnterTopic();
    }
    @Test
    public void verifyComment()
    {//calling method click on new online store is open
        homePage.clickOnNewonlinestoreisopen();
        //calling method of verify user in new online store page
        newOnlineStroreIsOpenPage.verifyUserInNewOnlineStorePage();
        //calling method of enter comment
        newOnlineStroreIsOpenPage.verifyUserEnterComment();
        //calling method of click on new comment button
        newOnlineStroreIsOpenPage.verifyUserClickOnNewcommentButton();
        //calling method of enter comment successfully
        newOnlineStroreIsOpenPage.verifyUserEnetrCommentTitleSuccessfully();
        //calling method of comment successful message
        newOnlineStroreIsOpenPage.verifyUserenterCommentSuccessfully();
        //calling method of user able to see successful message
        newOnlineStroreIsOpenPage.verifyUserableToSeeSuccessfulMessage();


    }
    @Test

    public void verifyUserableToGoOnFacebookPageSuccessful()
    {//calling method for click on face book icon
        homePage.clickOnFaceBook();
        //calling method of facebook url
        faceBookPage.verifyfacebookPopUpURL();

    }
    @Test
    public void verifyUserAbleToSelectCurrancy()
    {//calling method of user able to select currancy and able to see the product price selected currancy
        homePage.verifyUserAbleToselectcurrancy();
    }




    @Test
    public void verifyEachProductHaveName()
    {
        List<WebElement>pricelist = driver.findElements(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]"));

        List<WebElement>productList = driver.findElements(By.xpath("//div[contains(@class,'product')]/div[2]/div/div[1]/div[2]/h2/a"));
        System.out.println("productlist:"+productList.size());
        for(WebElement product:productList)
        {
            System.out.println(product.getText());
        }

    }


    @Test
    public void verifyUserShouldBeAbleToRegisterSuccessfully()
    {
        //calling method of register button
        homePage.clickOnRegisterButton();
        //calling method of registeration details
        registerPage.userEnterRegistrationDetails();
        //calling method of register submit button
        registerPage.userClickOnRegisterSubmitButton();
        //calling method of success message
        registerSuccessPage.usershouldbeabletoregistersuccessfully();
    }
    @Test(priority = 1)
    public void VerifyUserShouldBeAbleToreferdProductFriendSuccessfully()
    {   //register before click on send email friend
        verifyUserShouldBeAbleToRegisterSuccessfully();
        //verify user click on computer
        homePage.clickOnComputer();
        //verify user click on desktop
        computerPage.clickOnDesktopPage();
        //verify user click on Digitalstrom
        desktopPage.clickOnDDigitalsrom();
        //verify user click on email button
        digitalStorm.clickOnEmailButton();
        productEmailAFriend.userEnterFriendEmailDetail();
        //verify user see success message of emailfriend
        emailSuccessMessage.verifyUserSentEmailMessageSuccesfully();

    }
    @Test(priority = 2)
    public void verifyUserShouldBeAbleToAddTwoProductSuccessfully()
    {   //verify user click on electronics
        homePage.clickOnElectronics();
        //verify user click on cellphone
        electronicsPage.clickOnCellphone();
        //verify user able to add both product successfully
        cellphonePage.UserShouldBeAbleToAddProductToShoppingCartSuccessfully();
        //verify user click on shopping cart button
        cellphonePage.userclickonshopingcartbuttonsuccessfully();
        //verify userShouldBeAbleToSeeBothProductInCartPage
        cartPage.userShouldBeAbleToSeeBothProductInCartPage();

    }

}
