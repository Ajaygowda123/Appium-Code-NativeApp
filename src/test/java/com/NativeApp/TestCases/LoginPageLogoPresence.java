package com.NativeApp.TestCases;

import org.testng.annotations.Test;
import com.NativeApp.ElementsAction.LogInPage;
import com.NativeApp.utils.BasePage;
public class LoginPageLogoPresence extends BasePage {
	@Test
	public void logoPresenceinloginpage() throws InterruptedException {
		LogInPage login = new LogInPage(driver);
		Thread.sleep(10000);
		login.applicationLogoPresence();
	}
	

}
