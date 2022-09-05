package com.NativeApp.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.NativeApp.ElementsAction.LogInPage;
import com.NativeApp.utils.BasePage;
public class LoginPageNumberTagPresence extends BasePage {
	@Test
	public void NumberTagPresenceinloginpage() throws InterruptedException {
		LogInPage login = new LogInPage(driver);
		String actualText=login.numTextPresence();
		Assert.assertEquals(actualText, "Enter Phone Number ");
	}
	

}
