package com.NativeApp.ElementsAction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.NativeApp.androidgestures.AndroidActions;
import io.appium.java_client.android.AndroidDriver;

public class JoinForm extends AndroidActions {
	AndroidDriver driver;
	public JoinForm(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	@FindBy(className="android.widget.ImageView")
	private WebElement appLogo;
	
	@FindBy(xpath="//android.widget.TextView[@text='Cancel']")
	private WebElement cancellBtn;
	
	@FindBy(xpath="//android.widget.TextView[@text=' Sign up below to get started ']")
	private WebElement signupTxt;
	
	@FindBy(xpath="(//android.widget.EditText)[1]")
	private WebElement phoneNumBox;
	
	@FindBy(xpath="(//android.widget.EditText)[2]")
	private WebElement emailBox;
	
	@FindBy(xpath="(//android.widget.EditText)[3]")
	private WebElement firstNameBox;
	
	@FindBy(xpath="(//android.widget.EditText)[4]")
	private WebElement secondNameBox;
	
	@FindBy(xpath="(//android.widget.EditText)[5]")
	private WebElement birthdayDateBox;
	
	@FindBy(xpath="//android.view.View[@content-desc=\"30 August 1996\"]")
	private WebElement mybirthday;
	
	@FindBy(id="android:id/date_picker_header_year")
	private WebElement yearselect;
	
	@FindBy(id="android:id/button1")
	private WebElement okBtn;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup")
	private WebElement hippacheckbox;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup")
	private WebElement allomobilenum;
	
	@FindBy(xpath="//android.widget.TextView[@text='CLICK HERE TO SIGN']")
	private WebElement signpadBtn;
	
	@FindBy(className="android.widget.Image")
	private WebElement signpad;
	
	@FindBy(xpath="//android.widget.TextView[@text='SIGN UP']")
	private WebElement sigupBtn;
	
	@FindBy(id="android:id/message")
	private WebElement alertmsg;
	
	@FindBy(id="android:id/button1")
	private WebElement ok;
	
	
	public void applicationLogoPresence() {
		appLogo.isDisplayed();
	}
	
	public String phoneNum() {
		String actualNum=phoneNumBox.getText();
		return actualNum;
	}
	
	public void setEmail(String email) {
		emailBox.sendKeys(email);
	}
	
	public void setFirstName(String FirstName) {
		firstNameBox.sendKeys(FirstName);
	}
	
	public String emailcheck() {
		String mail1=emailBox.getText();
		return mail1;
	}
	
	public void setSecondName(String SecondName) {
		secondNameBox.sendKeys(SecondName);
	}
	
	public void setDOB() {
		birthdayDateBox.click();
		yearselect.click();
		scrollDOB();
		okBtn.click();
	}
	
	public void hippaselect() throws InterruptedException {
		ScrollToText("CLICK HERE TO SIGN");
		Thread.sleep(2000);
		hippacheckbox.click();
		Thread.sleep(2000);
		allomobilenum.click();
	}
	
	public void signature() throws InterruptedException {
		signpadBtn.click();
		Thread.sleep(3000);
		signpad.click();
	}
	
	public void signup(){
		sigupBtn.click();
	}
	
	public void alertmsg(){
		alertmsg.isDisplayed();
	}
	
	public RewardPage pressok() {
		ok.click();
		return new RewardPage(driver);
	}
}
