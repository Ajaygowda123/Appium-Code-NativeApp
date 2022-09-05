package com.NativeApp.TestCases;

 import org.testng.annotations.Test;
import com.NativeApp.ElementsAction.LogInPage;
import com.NativeApp.ElementsAction.PinEntryPage;
import com.NativeApp.utils.BasePage;
import org.testng.Assert;
public class PinEntryEntrePinTextPresence extends BasePage {
	@Test(dataProvider = "getData")
	public void entrePinTextPresenceinoinentrypage(String num) throws InterruptedException {
		LogInPage login = new LogInPage(driver);
		login.enterNumFiled(num);
		PinEntryPage pinentry=login.pressLogIn();
		String actualText1=pinentry.pinEntryTextPresence();
		Assert.assertEquals(actualText1, "Enter Pin");
	}
	

}
