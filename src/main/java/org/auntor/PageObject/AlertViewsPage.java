package org.auntor.PageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AlertViewsPage {
    AppiumDriver driver;

    public AlertViewsPage(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @iOSXCUITFindBy(accessibility = "Simple")
    private WebElement SimpleAlertElement;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"OK\"`]")
    private WebElement OKBtnElement;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Text Entry\"")
    private WebElement textEntryElement;

    @iOSXCUITFindBy(iOSNsPredicate = "type == \"XCUIElementTypeTextField\"")
    private WebElement alertTextFieldElement;

    @iOSXCUITFindBy(accessibility = "Confirm / Cancel")
    private WebElement confirmCancelTextElement;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Confirm\"`]")
    private WebElement confirmBtnElement;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"A Short Title Is Best\"`]")
    private WebElement simpleAlertTitleTextElement;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"A Short Title Is Best\"`]")
    private WebElement textEntryAlertTitleTextElement;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"A message should be a short, complete sentence.\"`]")
    private WebElement confirmCancelAlertTitleTextElement;

    public void clickSimple(){
        SimpleAlertElement.click();
    }

    public void clickConfirmCancel(){
        confirmCancelTextElement.click();
    }
    public void clickTextEntry(){
        textEntryElement.click();
    }

    public void clickOkBtn(){
        OKBtnElement.click();
    }

    public void enterTextAndPressOKBtn(String text){
        alertTextFieldElement.sendKeys(text);
        this.clickOkBtn();
    }
    public void clickConfirmBtn(){
        confirmBtnElement.click();
    }

    public boolean isSimpleAlertTitleDisplay(){
        return simpleAlertTitleTextElement.isDisplayed();
    }
    public boolean isTextEntryAlertTitleDisplay(){
        return textEntryAlertTitleTextElement.isDisplayed();
    }
    public boolean isConfirmCancelAlertTitleDisplay(){
        return confirmCancelAlertTitleTextElement.isDisplayed();
    }



}
