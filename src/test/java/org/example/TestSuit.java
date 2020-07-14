package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest
{   //created object of home page class
    HomePage homePage=new HomePage();
    //created object of registerPage class
    RegisterPage registerPage=new RegisterPage();
    //created object of registerSuccessPage class
    RegisterSuccessPage registerSuccessPage=new RegisterSuccessPage();
    //created object of  computerPage class
    ComputerPage computerPage=new ComputerPage();
    //created object of  desktopPage class
    DesktopPage desktopPage=new DesktopPage();
    //created object of digitalStor class
    DigitalStorm digitalStorm=new DigitalStorm();
    //created object of productEmailAFriend class
    ProductEmailAFriend productEmailAFriend=new ProductEmailAFriend();
    //created object of emailSuccessMessage class
    EmailSuccessMessage emailSuccessMessage=new EmailSuccessMessage();
    //created object of  electronicsPage class
    ElectronicsPage electronicsPage=new ElectronicsPage();
    //created object of cellphonePage class
    CellphonePage cellphonePage=new CellphonePage();
    //created object of cartPage class
    CartPage cartPage=new CartPage();

    @Test
    public void veriyfyUserShouldBeAbleToRegisterSuccessfully()
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
        veriyfyUserShouldBeAbleToRegisterSuccessfully();
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
