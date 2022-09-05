package com.NativeApp.TestCases;

 import org.testng.annotations.Test;

import com.NativeApp.ElementsAction.JoinForm;
import com.NativeApp.ElementsAction.LogInPage;
import com.NativeApp.ElementsAction.MerchantListPage;
import com.NativeApp.ElementsAction.PinEntryPage;
import com.NativeApp.utils.BasePage;
public class Rejoinform extends BasePage {
	@Test(dataProvider = "getData",groups="smoke")
	public void SuccessfullSignUpinrejoinform(String num) throws InterruptedException {
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
		joinform.pressok();
		merchantpage.clickOnMerchant1();
		Thread.sleep(10000);
	}
}
