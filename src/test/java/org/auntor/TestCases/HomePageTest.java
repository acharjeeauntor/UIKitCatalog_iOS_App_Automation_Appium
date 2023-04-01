package org.auntor.TestCases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.auntor.PageObject.HomePage;
import org.auntor.Util.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {

    HomePage homePage;

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify user can click Activity Indicators or not")
    public void verifyActivityIndicators(){
        homePage = new HomePage(driver);
        homePage.clickActivityIndicators();
        if(homePage.isActivityIndicatorsTextVisible()==true){
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }
        driver.navigate().back();

    }

    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify user can click Alert Views or not")
    public void verifyAlertViews(){
        homePage = new HomePage(driver);
        homePage.clickAlertViews();
        if(homePage.isAlertViewsTextVisible()==true){
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }
        driver.navigate().back();
    }

    @Test(priority = 3)
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify user can click Buttons or not")
    public void verifyButtons(){
        homePage = new HomePage(driver);
        homePage.clickButtons();
        if(homePage.isButtonTextVisible()==true){
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }
        driver.navigate().back();
    }

    @Test(priority = 3)
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify user can click Date Picker or not")
    public void verifyDatePicker(){
        homePage = new HomePage(driver);
        homePage.clickDatePicker();
        if(homePage.isDatePickerTextVisible()==true){
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }
        driver.navigate().back();
    }
}
