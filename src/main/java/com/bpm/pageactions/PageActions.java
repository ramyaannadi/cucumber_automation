package com.bpm.pageactions;

import org.openqa.selenium.WebDriver;

import com.bpm.base.BaseWebDriver;
import com.bpm.pageobjects.PageObjects;



public class PageActions {
	
	WebDriver d;
	
	public PageActions(WebDriver d) {
		this.d=d;
	}
	
	public void navigateToDownload() throws Exception {
		
		BaseWebDriver base = new BaseWebDriver(d);
		PageObjects obj = new PageObjects(d);
		base.click(obj.getDownloadLink());
		
		
	}
	

}
