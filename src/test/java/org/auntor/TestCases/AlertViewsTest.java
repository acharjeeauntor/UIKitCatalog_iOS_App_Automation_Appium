package org.auntor.TestCases;

import io.qameta.allure.Description;
import io.qameta.allure.Epics;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.auntor.PageObject.AlertViewsPage;
import org.auntor.PageObject.HomePage;
import org.auntor.Util.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AlertViewsTest extends BaseClass {
    AlertViewsPage alertViewsPage;
    HomePage homePage;

    String textInput = "Auntor Acharja";



 @Test(priority = 1)
 @Description("Verify Simple Alert Views working properly or not")
 @Severity(SeverityLevel.CRITICAL)
    public void verifySimpleAlertViews(){
     alertViewsPage = new AlertViewsPage(driver);
     homePage = new HomePage(driver);

     homePage.clickAlertViews();
     alertViewsPage.clickSimple();
     if(alertViewsPage.isSimpleAlertTitleDisplay()){
         Assert.assertTrue(true);
     }else{
         Assert.assertTrue(false);
     }
     alertViewsPage.clickOkBtn();
 }

    @Test(priority = 2)
    @Description("Verify Text Entry Alert Views working properly or not")
    @Severity(SeverityLevel.CRITICAL)
    public void verifyTextEntryAlertViews(){
        alertViewsPage = new AlertViewsPage(driver);
        homePage = new HomePage(driver);

        homePage.clickAlertViews();
        alertViewsPage.clickTextEntry();
        if(alertViewsPage.isTextEntryAlertTitleDisplay()){
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }
        alertViewsPage.enterTextAndPressOKBtn(textInput);
    }

    @Test(priority = 3)
    @Description("Verify Confirm/Cancel Alert Views working properly or not")
    @Severity(SeverityLevel.CRITICAL)
    public void verifyConfirmCancelAlertViews(){
        alertViewsPage = new AlertViewsPage(driver);
        homePage = new HomePage(driver);

        homePage.clickAlertViews();
        alertViewsPage.clickConfirmCancel();
        if(alertViewsPage.isConfirmCancelAlertTitleDisplay()){
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }
        alertViewsPage.clickConfirmBtn();
    }

}


