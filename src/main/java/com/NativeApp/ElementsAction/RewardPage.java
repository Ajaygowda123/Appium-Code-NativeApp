package com.NativeApp.ElementsAction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.NativeApp.androidgestures.AndroidActions;
import io.appium.java_client.android.AndroidDriver;

public class RewardPage extends AndroidActions {
	AndroidDriver driver;
	public RewardPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath="//android.widget.TextView[@text='Hello Club Rewards']")
	private WebElement rewardpageheading;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement homebtn;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement infobtn;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[1]")
	private WebElement checkinpoints;
	
	@FindBy(xpath="//android.widget.TextView=[@text='Points Redeemable']")
	private WebElement redeemabletext;
	
	@FindBy(xpath="//android.widget.TextView=[@text='5 Points Reward']")
	private WebElement rewardpointtext;
	
	@FindBy(xpath="//android.widget.TextView=[@text='10 $ off for first order']")
	private WebElement reward;
	
	@FindBy(xpath="//android.widget.TextView[@text='proceed to redeem']")
	private WebElement redeembtn;
	
	@FindBy(xpath="//android.widget.TextView[@text='return to wallet']")
	private WebElement returnbtn;
	
	
	public void rewardheading() {
		rewardpageheading.isDisplayed();
	}
	
	public void homebutton() {
		homebtn.click();
	}
	
	public void infobuttton() {
		infobtn.click();
	}
	
	public String checkinpoints() {
		String points=checkinpoints.getText();
		return points;
	}
	
	public void pointsredeemabletext() {
		redeemabletext.isDisplayed();		
	}
	
	public void rewardpointtext() {
		rewardpointtext.isDisplayed();
	}
	
	public void redeemthereward(){
		reward.click();
	}
	
	public void redeembutton(){
		redeembtn.click();
	}
	
	public void returnbutton(){
		returnbtn.click();
	}
}
