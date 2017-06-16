package com.bpm.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjects {
	
	
	WebDriver driver;
	WebDriverWait wait;
	
	public PageObjects(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
	}

	
	public WebElement getDownloadLink(){
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download")));
		return driver.findElement(By.linkText("Download"));
	}
	
}
