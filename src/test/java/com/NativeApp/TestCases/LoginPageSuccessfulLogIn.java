package com.NativeApp.TestCases;

 import org.testng.annotations.Test;
import com.NativeApp.ElementsAction.LogInPage;
import com.NativeApp.utils.BasePage;
public class LoginPageSuccessfulLogIn extends BasePage {
	@Test(dataProvider = "getData",groups="smoke")
	public void successLoginwithvalidnumber(String num) throws InterruptedException {
		LogInPage login = new LogInPage(driver);
		login.enterNumFiled(num);
		login.pressLogIn();
	}
	

}
