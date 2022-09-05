package com.NativeApp.TestCases;

 import org.testng.annotations.Test;
import com.NativeApp.ElementsAction.LogInPage;
import com.NativeApp.ElementsAction.MerchantListPage;
import com.NativeApp.ElementsAction.PinEntryPage;
import com.NativeApp.utils.BasePage;
public class MerchantListSelectMerchant extends BasePage {
	@Test(dataProvider = "getData")
	public void selectMerchantinmerchantlistpage(String num) throws InterruptedException {
		LogInPage login = new LogInPage(driver);
		login.enterNumFiled(num);
		PinEntryPage pinentry=login.pressLogIn();
		pinentry.enterPinField(accessCode());
		MerchantListPage merchantpage= pinentry.pressContinue();
		merchantpage.clickOnMerchant1();
	}
	

}
