package com.bpm.util;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.NetworkMode;

public class ExtentReport {

	public WebDriver driver;
	
	public ExtentReport(WebDriver driver){
		this.driver=driver;
	}
	
	private ExtentReports extent;
	private static ExtentReports extentSummmary;
	private ExtentTest test;
	private ExtentTest testsummary;
	private String reportPath = System.getProperty("user.dir")+File.separator+"extentReports"+File.separator;
	public ExtentReports getExtent() {
		return extent;
	}
	public void setExtent(ExtentReports extent) {
		this.extent = extent;
	}
	public static ExtentReports getExtentSummmary() {
		return extentSummmary;
	}
	public static void setExtentSummmary(ExtentReports extentSummmary) {
		ExtentReport.extentSummmary = extentSummmary;
	}
	public ExtentTest getTest() {
		return test;
	}
	public void setTest(ExtentTest test) {
		this.test = test;
	}
	public ExtentTest getTestsummary() {
		return testsummary;
	}
	public void setTestsummary(ExtentTest testsummary) {
		this.testsummary = testsummary;
	}
	public String getReportPath() {
		return reportPath;
	}
	public void setReportPath(String reportPath) {
		this.reportPath = reportPath;
	}


	public void updateTestStatus() {

		testsummary.appendChild(test);
		extentSummmary.endTest(testsummary);
	}


	public void updateEndStatus(){

		extentSummmary.flush();
	}


	public String getDate(){

		DateFormat df = new SimpleDateFormat("dd_MM_YY");
		Date dateobj = new Date();
		return df.format(dateobj);

	}

	public String getLatestfileName(String reportPath , String ext){
		File theNewestFile =null;

		File dir = new File(reportPath);
		FileFilter fileFilter = new WildcardFileFilter("*." + ext);
		File [] files  = dir.listFiles(fileFilter);

		if(files.length>0){
			Arrays.sort(files, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
			theNewestFile = files[0];
		}

		String latestFilename = theNewestFile.getName();
		return latestFilename;
	}

	public String getlatestFiledate(String latestFilename){

		System.out.println(latestFilename);
		String name1[] = latestFilename.split("-");
		System.out.println(name1[1]);
		String name2[] = name1[1].split(".html");
		System.out.println(name2[0]);
		return name2[0];
	}


	public void intializeTestReport(String scenario){
		try{

			String latestFilename = getLatestfileName(reportPath, "html");
			String latestFiledate = getlatestFiledate(latestFilename);
			if(latestFiledate.contains(getDate())){

				String path = reportPath+latestFilename;

				extent = new ExtentReports(path,false,NetworkMode.OFFLINE);
				test = extent.startTest(scenario);
			}
			else{
				String fileName = "Today's Report";
				String path = reportPath + fileName +  "-"+getDate() + ".html";
				String summaryfilepath = reportPath + "report.html";
				extent =  new ExtentReports(path , true , NetworkMode.OFFLINE);
				test = extent.startTest(scenario);
				if(extentSummmary==null){
					extentSummmary = new ExtentReports(summaryfilepath,true,NetworkMode.OFFLINE);

				}

				testsummary = extentSummmary.startTest(scenario);
			}
		}catch(Exception e){

			String fileName = "Today's Report";
			String path = reportPath + fileName +  "-"+getDate() + ".html";
			String summaryfilepath = reportPath + "report.html";
			extent =  new ExtentReports(path , true , NetworkMode.OFFLINE);
			test = extent.startTest(scenario);
			if(extentSummmary==null){
				extentSummmary = new ExtentReports(summaryfilepath,true,NetworkMode.OFFLINE);

			}

			testsummary = extentSummmary.startTest(scenario);

		}
	}

public String takeScreenShot() throws IOException{
    	
    	DateFormat df = new SimpleDateFormat("dd_MM_YY_HH_mm_ss");
		Date dateobj = new Date();
		String dateformat= df.format(dateobj);
		String path = System.getProperty("user.dir")+File.separator+"screenshot"+File.separator+dateformat+".png";
    	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile, new File(path));
    	return path;
    }
	public void insertStep(String stepName, String details, String status, String exception,boolean isScreenShot) throws IOException{

		if(isScreenShot){
			
			if(status.equals("PASS")){
				String image= test.addScreenCapture(takeScreenShot());
				test.log(LogStatus.PASS, stepName, image);
				extent.endTest(test);
			}else if(status.equals("FAIL")){
				String image= test.addScreenCapture(takeScreenShot());
				test.log(LogStatus.FAIL, stepName, image);
				extent.endTest(test);
			}else if(status.equals("INFO")){
				test.log(LogStatus.INFO, stepName, details);
				extent.endTest(test);
			}
		}else{
			if(status.equals("PASS")){
				test.log(LogStatus.PASS, stepName, details);
				extent.endTest(test);
			}else if(status.equals("FAIL")){
				test.log(LogStatus.FAIL, stepName, exception);
				extent.endTest(test);
			}else if(status.equals("INFO")){
				test.log(LogStatus.INFO, stepName, details);
				extent.endTest(test);
			}
		}
		extent.flush();

	}

}
