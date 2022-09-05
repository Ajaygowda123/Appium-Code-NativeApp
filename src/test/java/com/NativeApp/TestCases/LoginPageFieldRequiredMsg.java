package com.NativeApp.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.NativeApp.ElementsAction.LogInPage;
import com.NativeApp.utils.BasePage;
public class LoginPageFieldRequiredMsg extends BasePage {
	@Test
	public void FieldRequiredMsginloginpage() throws InterruptedException {
		LogInPage login = new LogInPage(driver);
		login.pressLogIn();
		String actualText=login.fieldReqText();
		Assert.assertEquals(actualText, "This field is required");
	}
	

}
