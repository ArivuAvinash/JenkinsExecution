package org.vtiger.genericutility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.vtiger.businessutility.BaseClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ListenerUtility implements ISuiteListener,ITestListener  {
	ExtentReports reports;
	ExtentTest report;
	String time = LocalDateTime.now().toString().replace(":", "_");
	
	@Override
	public void onStart(ISuite suite) {
		Reporter.log("onStart"+suite.getName(),true);
		//create a report file
		ExtentSparkReporter spark= new ExtentSparkReporter("./reports/testreport"+time+".html");//onStart
		//starting the report( start recording the report)
		reports= new ExtentReports();//onStart
		//write the report into the report file 
		reports.attachReporter(spark);//onStart
		//generating the report
		report = reports.createTest("Sample Report");//onStart
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("onTestSuccess",true);
		report.log(Status.PASS, "Test Case PASS"+result.getName());//onTestSuccess
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("onTestFailure",true);
		TakesScreenshot ts=(TakesScreenshot)BaseClass.sdriver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		 
		File dest = new File("./screenshotS/image"+result.getName()+time+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String temp1 = ts.getScreenshotAs(OutputType.BASE64);
		report.addScreenCaptureFromBase64String(temp1,result.getName()+time+".png");
		
		
		report.log(Status.FAIL, "Test Case FAIL"+result.getName());//onTestFailure
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("onTestSkipped",true);
		report.log(Status.SKIP, "Test Case SKIP"+result.getName());//onTestSKip
	}

	@Override
	public void onFinish(ISuite suite) {
		Reporter.log("onFinish"+suite.getName(),true);
		//save the report
		reports.flush();//onFinish
	}
	

}
