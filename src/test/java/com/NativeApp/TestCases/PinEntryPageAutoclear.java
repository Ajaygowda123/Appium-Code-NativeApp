package com.NativeApp.TestCases;

 import org.testng.annotations.Test;
import com.NativeApp.ElementsAction.LogInPage;
import com.NativeApp.ElementsAction.PinEntryPage;
import com.NativeApp.utils.BasePage;
import org.testng.Assert;
public class PinEntryPageAutoclear extends BasePage {
	@Test(dataProvider = "getData")
	public void autoClearTestofphonenumandpin(String num) throws InterruptedException {
		LogInPage login = new LogInPage(driver);
		login.enterNumFiled(num);
		PinEntryPage pinentry=login.pressLogIn();
		Thread.sleep(5000);
		pinentry.enterPinField("123456");
		pinentry.pressCancell();
		Thread.sleep(5000);
		String actualNum=login.numField();
		Assert.assertEquals(actualNum, "");
		login.enterNumFiled(num);
		login.pressLogIn();
		Thread.sleep(5000);
		String actualPin=pinentry.pinField();
		Assert.assertEquals(actualPin, "");
		
	}
	

}
