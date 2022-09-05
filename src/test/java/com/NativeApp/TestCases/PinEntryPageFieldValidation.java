package com.NativeApp.TestCases;

 import org.testng.annotations.Test;
import com.NativeApp.ElementsAction.LogInPage;
import com.NativeApp.ElementsAction.PinEntryPage;
import com.NativeApp.utils.BasePage;
import org.testng.Assert;
public class PinEntryPageFieldValidation extends BasePage {
	@Test(dataProvider = "getData")
	public void fieldValidationmsginpinentrypage(String num) throws InterruptedException {
		LogInPage login = new LogInPage(driver);
		login.enterNumFiled(num);
		PinEntryPage pinentry=login.pressLogIn();
		Thread.sleep(5000);
		pinentry.pressContinue();
		String actualText=pinentry.fieldvalidationText();
		Assert.assertEquals(actualText, "This field is required");
	}
	

}
