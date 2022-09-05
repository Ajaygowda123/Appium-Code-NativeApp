package com.NativeApp.utils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BasePage {
	public AndroidDriver driver;
	@BeforeTest(alwaysRun = true)
    public void ConfigureAppium() throws MalformedURLException {
		UiAutomator2Options option = new UiAutomator2Options();
		option.setDeviceName("xiaomi Redmi Note 8 Pro");
		option.setApp("C:\\Users\\GSPLK-LPA99\\Desktop\\Appium\\NativeApp\\src\\test\\java\\com\\NativeApp\\resource\\app-jushiBeyond-release.apk");
		 driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), option);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@SuppressWarnings("deprecation")
	public String accessCode() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GSPLK-LPA99\\Desktop\\Appium\\NativeApp\\src\\test\\java\\com\\NativeApp\\resource\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://beta.springbig.technology/admin/member_access_codes");
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		drive.findElement(By.xpath("//input[@id='email']")).sendKeys("ajay.gopalagowda@girmiti.com");
		drive.findElement(By.xpath("//input[@id='password']")).sendKeys("Ajay@1234");
		drive.findElement(By.xpath("//input[@data-disable-with='login']")).click();
		drive.findElement(By.xpath("//input[@id='q_mobile_subscriber_id']")).sendKeys("1029");
		drive.findElement(By.xpath("//input[@type='submit']")).click();
		String Accesscode = drive.findElement(By.xpath("(//td[@class='col col-code'])[1]")).getText();
	    drive.quit();
		return Accesscode;
	}
	
	public String getscreenshotpath(String testCaseName, AppiumDriver driver) throws IOException {
		File source = driver.getScreenshotAs(OutputType.FILE);
		String destinationFile=System.getProperty("user.dir")+"//reports"+testCaseName+".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
	}
	
	@DataProvider
	public Object[][] getData(){
		return new Object[][] {{"8877665544"}};
		
	}
	
	@DataProvider
	public Object[][] joinFormData(){
		return new Object[][] {{"8877665544", "renberg@gmail.com", "Ren", "Berg"}};
		
	}
	
@AfterTest(alwaysRun = true)
public void TearDown() {
	driver.quit();
}

}
