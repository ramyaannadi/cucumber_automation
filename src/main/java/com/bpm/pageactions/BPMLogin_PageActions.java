package com.bpm.pageactions;



import org.openqa.selenium.WebDriver;

import com.bpm.base.BaseFramework;
import com.bpm.base.BaseWebDriver;
import com.bpm.pageobjects.BPMLogin_PageObjects;

import com.bpm.util.TestStatus;



public class BPMLogin_PageActions extends BaseFramework {
	
	WebDriver d;
	BaseWebDriver base;
	BPMLogin_PageObjects obj;
	
	public BPMLogin_PageActions(WebDriver d) {
		this.d=d;
		base = new BaseWebDriver(this.d);
		obj = new BPMLogin_PageObjects();
	}
	
	public void loginToBPM() throws Exception {
		try{
		getReport().insertStep("Login to BPM Portal", "User Trying to Login to BPM Portal", TestStatus.INFO, "", false);
		base.sendKeys(base.getWebElement(obj.getUserIdTextBox), getProperty("userName"));
		base.sendKeys(base.getWebElement(obj.getPasswordTextBox), getProperty("password"));
		base.click(base.getWebElement(obj.getSigninButton));
		base.delay(3);
		}catch(Exception e){
			getReport().insertStep(e.getMessage(), "", TestStatus.FAIL, "", true);
			throw e;
		}
		
		
	}
	
	public boolean LoginSuccess() throws Exception{
		
		if(base.getWebElements(obj.getLoginComfirmation).size()>0){
			getReport().insertStep("Login to BPM Portal", "User Successfully Naviagted", TestStatus.PASS, "", true);
			return true;
		}else{
			getReport().insertStep("Login to BPM Portal", "User Unable to Naviagte", TestStatus.FAIL, "", true);
			return false;
		}
	}
	

}
