package com.NativeApp.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendRepoterNG {
	static ExtentReports extent;
	
	public static ExtentReports getreporterObject() {
		String path=System.getProperty("user.dir")+"\\\\reports\\\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Appium Automation Result");
		reporter.config().setDocumentTitle("Native App Test Result");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Ajay G");
		return extent;
	}

}
