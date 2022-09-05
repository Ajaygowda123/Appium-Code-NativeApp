package com.NativeApp.TestCases;

 import org.testng.annotations.Test;
import com.NativeApp.ElementsAction.JoinForm;
import com.NativeApp.ElementsAction.LogInPage;
import com.NativeApp.ElementsAction.MerchantListPage;
import com.NativeApp.ElementsAction.PinEntryPage;
import com.NativeApp.utils.BasePage;
public class JoinFormSuccessfullSignUp extends BasePage {
	@Test(dataProvider = "joinFormData",groups="smoke")
	public void SuccessfullSignUpinjoinforms(String num, String mail, String firstname, String secondname) throws InterruptedException {
		LogInPage login = new LogInPage(driver);
		login.enterNumFiled(num);
		PinEntryPage pinentry=login.pressLogIn();
		pinentry.enterPinField(accessCode());
		MerchantListPage merchantpage= pinentry.pressContinue();
		JoinForm joinform=merchantpage.clickOnMerchant1();
		String mail1=joinform.emailcheck();
		Thread.sleep(10000);
		if(mail1.contains(mail)) {
		joinform.hippaselect();
		joinform.signature();
		joinform.signup();
		Thread.sleep(10000);
		joinform.alertmsg();
		joinform.pressok();
		Thread.sleep(10000);
		}
		else {
			joinform.setEmail(mail);
			joinform.setFirstName(firstname);
			joinform.setSecondName(secondname);
			joinform.setDOB();
			joinform.hippaselect();
			joinform.signature();
			joinform.signup();
			Thread.sleep(10000);
			joinform.alertmsg();
			joinform.pressok();
			Thread.sleep(10000);
		}
	}
}
