package org.auntor.PageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class HomePage {
    AppiumDriver driver;

    public HomePage(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @iOSXCUITFindBy(accessibility = "Alert Views")
    private WebElement alertViewsElement;

    @iOSXCUITFindBy(accessibility = "Activity Indicators")
    private WebElement activityIndicatorsElement;
    @iOSXCUITFindBy(accessibility = "Buttons")
    private WebElement buttonsElement;
    @iOSXCUITFindBy(accessibility = "Date Picker")
    private WebElement datePickerElement;
    @iOSXCUITFindBy(iOSClassChain ="**/XCUIElementTypeStaticText[`label == \"Activity Indicators\"`]")
    private WebElement activityIndicatorsTextElement;
    @iOSXCUITFindBy(iOSClassChain ="**/XCUIElementTypeStaticText[`label == \"Alert Views\"`]")
    private WebElement alertViewsTextElement;
    @iOSXCUITFindBy(iOSClassChain ="**/XCUIElementTypeStaticText[`label == \"Buttons\"`]")
    private WebElement buttonsTextElement;
    @iOSXCUITFindBy(iOSClassChain ="**/XCUIElementTypeStaticText[`label == \"Date Picker\"`]")
    private WebElement datePickerTextElement;
    public void clickAlertViews(){
        alertViewsElement.click();
    }
    public void clickActivityIndicators(){
        activityIndicatorsElement.click();
    }
    public void clickButtons(){
        buttonsElement.click();
    }
    public void clickDatePicker(){
        datePickerElement.click();
    }
    public boolean isActivityIndicatorsTextVisible(){
        return activityIndicatorsTextElement.isDisplayed();
    }
    public boolean isAlertViewsTextVisible(){
        return alertViewsTextElement.isDisplayed();
    }
    public boolean isButtonTextVisible(){
        return buttonsTextElement.isDisplayed();
    }
    public boolean isDatePickerTextVisible(){
        return datePickerTextElement.isDisplayed();
    }
}
