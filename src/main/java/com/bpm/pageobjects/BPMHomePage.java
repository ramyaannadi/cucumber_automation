package com.bpm.pageobjects;



public class BPMHomePage {


	


	public String getCaseIDSearchBox = "(.//input[@type='text' and contains(@class,'searchbox')])[1]";
	public String getCaseIDLink = "(.//*[text()='@@value@@'])[1]";
	public String getAdd3ContactButton = "(.//*[contains(text(),'Contact up to 3 haulers & identify scheduled start date')])[1]";
	public String getAllTask= ".//*[text()='All Open Tasks' and contains(@class,'button')]";
	public String getUserNamedropdown = ".//*[contains(@class,'menubar-menuitem-person-menu')]";
	public String getLogOutButton = ".//*[contains(@class,'menubar-menuitem-caption') and text()='Logout']";
	
	
	
}
