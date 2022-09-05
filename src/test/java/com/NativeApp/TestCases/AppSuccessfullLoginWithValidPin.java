package com.NativeApp.TestCases;

 import org.testng.annotations.Test;
import com.NativeApp.ElementsAction.LogInPage;
import com.NativeApp.ElementsAction.PinEntryPage;
import com.NativeApp.utils.BasePage;
public class AppSuccessfullLoginWithValidPin extends BasePage {
	@Test(dataProvider = "getData", groups="smoke")
	public void loginWithValidPininpintrypage(String num) throws InterruptedException {
		LogInPage login = new LogInPage(driver);
		login.enterNumFiled(num);
		PinEntryPage pinentry=login.pressLogIn();
		pinentry.enterPinField(accessCode());
		pinentry.pressContinue();
	}
	

}
