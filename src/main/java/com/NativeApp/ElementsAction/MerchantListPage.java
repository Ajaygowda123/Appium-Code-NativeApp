package com.NativeApp.ElementsAction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.NativeApp.androidgestures.AndroidActions;
import io.appium.java_client.android.AndroidDriver;

public class MerchantListPage extends AndroidActions {
	AndroidDriver driver;
	public MerchantListPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	@FindBy(className="android.widget.ImageView")
	private WebElement appLogo;
	
	@FindBy(xpath="//android.widget.TextView[@text='Hello Club CA ']")
	private WebElement merchant1;
	
	@FindBy(xpath="//android.widget.TextView[@text='Hello Club IL']")
	private WebElement merchant2;
	
	@FindBy(xpath="//android.widget.TextView[@text='Hello Club PA']")
	private WebElement merchant3;
	
	@FindBy(xpath="//android.widget.TextView[@text='Hello Club VA']")  
	private WebElement merchant4;
	
	@FindBy(xpath="//android.widget.TextView[@text='Hello Club SA']")  
	private WebElement merchant5;

	public JoinForm clickOnMerchant1() {
		merchant1.click();
		return new JoinForm(driver);
	}
	
}
