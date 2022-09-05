package com.NativeApp.TestCases;

 import org.testng.Assert;
import org.testng.annotations.Test;
import com.NativeApp.ElementsAction.LogInPage;
import com.NativeApp.utils.BasePage;
public class LoginPageInvalidNumber extends BasePage {
	@Test
	public void invalidnumbervalidationmessage() throws InterruptedException {
		LogInPage login = new LogInPage(driver);
		login.enterNumFiled("1087676568");
		login.pressLogIn();
		String actualmessage=login.invalidNUm();
		Assert.assertEquals(actualmessage, "Validation failed: Subscriber number Phone number must be ten digits, first and fourth digit cannot be zero or one.");
	}
	

}
