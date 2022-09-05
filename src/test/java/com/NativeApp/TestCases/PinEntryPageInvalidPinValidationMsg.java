package com.NativeApp.TestCases;

 import org.testng.annotations.Test;
import com.NativeApp.ElementsAction.LogInPage;
import com.NativeApp.ElementsAction.PinEntryPage;
import com.NativeApp.utils.BasePage;
import org.testng.Assert;
public class PinEntryPageInvalidPinValidationMsg extends BasePage {
	@Test(dataProvider = "getData")
	public void invalidPinValidationMsginpinentrypage(String num) throws InterruptedException {
		LogInPage login = new LogInPage(driver);
		login.enterNumFiled(num);
		PinEntryPage pinentry=login.pressLogIn();
		Thread.sleep(5000);
		pinentry.enterPinField("123456");
		pinentry.pressContinue();
		String actualValidation=pinentry.invalidCodeValidation();
		Assert.assertEquals(actualValidation, "Access code is not valid");
		
	}
	

}
