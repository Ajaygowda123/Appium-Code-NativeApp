package com.NativeApp.TestCases;

 import org.testng.annotations.Test;
import com.NativeApp.ElementsAction.LogInPage;
import com.NativeApp.ElementsAction.PinEntryPage;
import com.NativeApp.utils.BasePage;
import org.testng.Assert;
public class PinEntryPageTemPinPresence extends BasePage {
	@Test(dataProvider = "getData")
	public void temPinmsgPresenceinpinentrypage(String num) throws InterruptedException {
		LogInPage login = new LogInPage(driver);
		login.enterNumFiled(num);
		PinEntryPage pinentry=login.pressLogIn();
		Thread.sleep(5000);
		String actualText=pinentry.temPinTextPresence();
		Assert.assertEquals(actualText, "A temporary pin has been sent to your phone or email.");
	}
	

}
