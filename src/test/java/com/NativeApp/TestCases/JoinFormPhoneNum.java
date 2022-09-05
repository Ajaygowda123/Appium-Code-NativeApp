package com.NativeApp.TestCases;

 import org.testng.Assert;
import org.testng.annotations.Test;

import com.NativeApp.ElementsAction.JoinForm;
import com.NativeApp.ElementsAction.LogInPage;
import com.NativeApp.ElementsAction.MerchantListPage;
import com.NativeApp.ElementsAction.PinEntryPage;
import com.NativeApp.utils.BasePage;
public class JoinFormPhoneNum extends BasePage {
	@Test(dataProvider = "getData")
	public void phoneNumCheckinjionform(String num) throws InterruptedException {
		LogInPage login = new LogInPage(driver);
		login.enterNumFiled(num);
		PinEntryPage pinentry=login.pressLogIn();
		pinentry.enterPinField(accessCode());
		MerchantListPage merchantpage= pinentry.pressContinue();
		JoinForm joinform=merchantpage.clickOnMerchant1();
		String actualNum=joinform.phoneNum();
		Assert.assertEquals(actualNum, num);
	}
	

}
