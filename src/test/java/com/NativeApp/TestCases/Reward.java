package com.NativeApp.TestCases;

 import org.testng.Assert;
import org.testng.annotations.Test;

import com.NativeApp.ElementsAction.JoinForm;
import com.NativeApp.ElementsAction.LogInPage;
import com.NativeApp.ElementsAction.MerchantListPage;
import com.NativeApp.ElementsAction.PinEntryPage;
import com.NativeApp.ElementsAction.RewardPage;
import com.NativeApp.utils.BasePage;
public class Reward extends BasePage {
	@Test(dataProvider = "getData")
	public void rewardredeem(String num) throws InterruptedException {
		LogInPage login = new LogInPage(driver);
		login.enterNumFiled(num);
		PinEntryPage pinentry=login.pressLogIn();
		pinentry.enterPinField(accessCode());
		MerchantListPage merchantpage= pinentry.pressContinue();
		JoinForm joinform=merchantpage.clickOnMerchant1();
		joinform.hippaselect();
		joinform.signature();
		joinform.signup();
		Thread.sleep(10000);
		RewardPage rewardpage=joinform.pressok();
		merchantpage.clickOnMerchant1();
		Thread.sleep(10000);
		rewardpage.rewardheading();
		//rewardpage.pointsredeemabletext();
		//rewardpage.rewardpointtext();
		rewardpage.redeemthereward();
		rewardpage.redeembutton();
		rewardpage.returnbutton();
		String afterpoints=rewardpage.checkinpoints();
		int aftercheckinpoints=Integer.parseInt(afterpoints); 
		int beforecheckinpoints=aftercheckinpoints+5;
		Assert.assertEquals(aftercheckinpoints, beforecheckinpoints);
	}
}
