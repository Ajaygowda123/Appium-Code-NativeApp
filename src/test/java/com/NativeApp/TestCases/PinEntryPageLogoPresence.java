package com.NativeApp.TestCases;

 import org.testng.annotations.Test;
import com.NativeApp.ElementsAction.LogInPage;
import com.NativeApp.ElementsAction.PinEntryPage;
import com.NativeApp.utils.BasePage;
public class PinEntryPageLogoPresence extends BasePage {
	@Test(dataProvider = "getData")
	public void logoPresenceinpinentrypages(String num) throws InterruptedException {
		LogInPage login = new LogInPage(driver);
		login.enterNumFiled(num);
		PinEntryPage pinentry=login.pressLogIn();
		Thread.sleep(5000);
		pinentry.applicationLogoPresence();
	}
	

}
