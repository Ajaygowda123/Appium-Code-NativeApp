package com.NativeApp.ElementsAction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.NativeApp.androidgestures.AndroidActions;
import io.appium.java_client.android.AndroidDriver;

public class PinEntryPage extends AndroidActions {
	AndroidDriver driver;
	public PinEntryPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	@FindBy(className="android.widget.ImageView")
	private WebElement appLogo;
	
	@FindBy(xpath="//android.widget.TextView[@text='A temporary pin has been sent to your phone or email.']")
	private WebElement tempPinText;
	
	@FindBy(xpath="//android.widget.TextView[@text='Enter Pin']")
	private WebElement pinEntryText;
	
	@FindBy(xpath="//*[@class='android.widget.EditText']")
	private WebElement pinEntryBox;
	
	@FindBy(xpath="//android.widget.TextView[@text='This field is required']")  
	private WebElement fieldValidation;

	@FindBy(xpath="//android.widget.TextView[@text='Access code is not valid']")
	private WebElement invalidcode;
	
	@FindBy(xpath="//android.widget.TextView[@text='CONTINUE']")
	private WebElement continueBtn;
	
	@FindBy(xpath="//android.widget.TextView[@text='Cancel']")
	private WebElement cancellBtn;
	
	public void applicationLogoPresence() {
		appLogo.isDisplayed();
	}
	
	public String temPinTextPresence() {
		String actualText=tempPinText.getText();
		return actualText;
	}
	
	public String pinEntryTextPresence() {
		String actualText1=pinEntryText.getText();
		return actualText1;
	}
	
	public void enterPinField(String pin) {
		pinEntryBox.sendKeys(pin);
		
	}
	
	public String pinField() {
		String actualPin=pinEntryBox.getText();
		return actualPin;
	}
	
	public String fieldvalidationText() {
		String actualText=fieldValidation.getText();
		return actualText;
	}
	
	public String invalidCodeValidation() {
		String actualValidation=invalidcode.getText();
		return actualValidation;
	}
	
	public void pressCancell() {
		cancellBtn.click();
	}
	
	public MerchantListPage pressContinue() {
		continueBtn.click();
		return new MerchantListPage(driver);
	}
}
