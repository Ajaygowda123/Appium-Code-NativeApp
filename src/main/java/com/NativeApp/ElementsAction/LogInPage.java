package com.NativeApp.ElementsAction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.NativeApp.androidgestures.AndroidActions;
import io.appium.java_client.android.AndroidDriver;

public class LogInPage extends AndroidActions {
	AndroidDriver driver;
	public LogInPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	@FindBy(className="android.widget.ImageView")
	private WebElement appLogo;
	
	@FindBy(xpath="//android.widget.TextView[@text='Enter Phone Number ']")
	private WebElement phoneNumText;
	
	@FindBy(xpath="//*[@class='android.widget.EditText']")
	private WebElement phoneNumBox;
	
	@FindBy(xpath="//android.widget.TextView[@text='LOG IN']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//android.widget.TextView[@text='This field is required']")  
	private WebElement fieldRequiredMsg;
	
	@FindBy(xpath="//android.widget.TextView[@text='Validation failed: Subscriber number Phone number must be ten digits, first and fourth digit cannot be zero or one.']")  
	private WebElement invalidNumber;
	
	
	public void applicationLogoPresence() {
		appLogo.isDisplayed();
	}
	
	public void enterNumFiled(String num) {
		phoneNumBox.sendKeys(num);
	}
	
	public String numField() {
		String actualNum=phoneNumBox.getText();
		return actualNum;
	}
	
	public String numTextPresence() {
		String actualText=phoneNumText.getText();
		return actualText;
	}
	
	public String fieldReqText() {
		String actualText=fieldRequiredMsg.getText();
		return actualText;
	}
	
	public String invalidNUm() {
		String actualmessage=invalidNumber.getText();
		return actualmessage;
	}
	
	public PinEntryPage pressLogIn() {
		loginBtn.click();
		return new PinEntryPage(driver);
	}
}
