package com.bpm.definitions;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import com.bpm.base.BaseFramework;
import com.bpm.base.BaseWebDriver;
import com.bpm.pageactions.BPMCaseActions;
import com.bpm.pageactions.BPMHomeActions;
import com.bpm.pageactions.BPMLogin_PageActions;

import com.bpm.util.ExtentReport;
import com.bpm.util.TestStatus;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BPMDefinitions extends BaseFramework{
	
	private Scenario scenario;
	BaseWebDriver base;
	WebDriver driver;
	ExtentReport report;
	BPMHomeActions home;
	BPMCaseActions casedetails;
	Logger logger = LogManager.getLogger(BPMDefinitions.class);
	
	@Before
	public void beforeScenario(Scenario scenario) throws Exception {
		logger.info("Started the Scenario");
		System.out.println("executed before method");
		loadconfig();
		driver = createWebDriverInstance("Chrome");
		base = new BaseWebDriver(driver);
		this.scenario=scenario;
		report = new ExtentReport(driver);
		setReport(report);
		report.intializeTestReport(scenario.getName());
	}
	
	@After
	public void embedScreenshot() {
		try {
			
			byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
			driver.close();
			driver.quit();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@When("^I Login to BPM$")
	public void i_Login_to_BPM() throws Exception {
		logger.info("Logining to BPM Portal");
		BPMLogin_PageActions login = new BPMLogin_PageActions(driver);
		try{
			login.loginToBPM();
		}catch(Exception e){
			
			report.insertStep("Login to BPM Portal", "", TestStatus.FAIL, e.toString(), false);
			report.insertStep("Login to BPM Portal", "", TestStatus.FAIL, e.toString(), true);
			
		}
		
	}
	
	@Given("^I Navigate to BPM Portal$")
	public void i_Navigate_to_BPM_Portal() throws Exception {
		logger.info("Opening the url");
		base.openURL(getProperty("appURL"));
		base.waitForPageToLoad();
		report.insertStep("Opening the URL", getProperty("appURL"), "PASS", "", true);
	}
	
	@Given("^I Click on All Task Tab$")
	public void i_Click_on_All_Task_Tab() throws Exception{
		
		home = new BPMHomeActions(driver);
		home.clickAllTaskTab();
		base.delay(3);
		report.insertStep("I Click on All Task Tab", "User clicking on the All TAsk Tab", "PASS", "", true);
		
	}
	
	@Given("^I Search CaseId \"(.*)\"$")
	public void i_Search_CaseId(String caseId) throws Exception{
		
		home = new BPMHomeActions(driver);
		home.searchCaseId(caseId);
		base.delay(3);
		
	}
	
	@Then("^I Click on Logout$")
	public void i_Click_on_Logout() throws Exception{
		
		home = new BPMHomeActions(driver);
		home.ClickLogOut();
		getReport().insertStep("User Clicking on Logout", "", TestStatus.PASS, "", true);
		
	}
	
	
	@Then("^I Click on Add3 Contact Button$")
	public void i_Click_on_Add3_Contact_Button() throws Exception{
		
		home = new BPMHomeActions(driver);
		home.ClickAdd3ContactButton();
		
	}
	
	@Then("^I Click on Claim$")
	public void i_Click_on_Claim() throws Exception{
		
		casedetails = new BPMCaseActions(driver);
		casedetails.clickClaim();
	
	}
	

	@Given("^I Select LOA Details \"(.*)\"$")
	public void i_Select_LOA_Details(String loaDetails) throws Exception{
		
		casedetails = new BPMCaseActions(driver);
		casedetails.SelectLOADetails(loaDetails);
		
	}
	
	
	@Then("^I Click on Add Haluer Button$")
	public void i_Click_on_Add_Haluer_Button() throws Exception{
		
		getReport().insertStep("Clicking on Add 1 Haluer Button", "User Clicking on Add 1 Haluer Button", TestStatus.INFO, "", false);
		casedetails = new BPMCaseActions(driver);
		casedetails.clickAddHaluerButton();
	
	}
	
	

	@When("^I Add Hauler Details$")
	public void i_Add_Hauler_Details() throws Exception{
		
		getReport().insertStep("I Add Hauler Details", "User Filling the Haluer Details", TestStatus.INFO, "", false);
		casedetails = new BPMCaseActions(driver);
		casedetails.addHaluerDetails();
	
	}
	
	@Then("^I Select Haulers Agree To The Terms$")
	public void i_Select_Haluer_Agree_To_The_Terms() throws Exception{
		
		getReport().insertStep("I Select Haulers Agree To The Terms", "User Filling Hauler Agree Terms", TestStatus.INFO, "", false);
		casedetails = new BPMCaseActions(driver);
		casedetails.selectHaluerTermsAndDetails();
	
	}

	@Given("^I Add Contracted Haluer Details$")
	public void i_Add_Contracted_Haluer_Details() throws Exception{
		
		getReport().insertStep("I Add Contracted Haluer Details", "User Adding Contratced Haluer Details", TestStatus.INFO, "", false);
		casedetails = new BPMCaseActions(driver);
		casedetails.addContractedHaluerDetails();
	
	}
	
	@Then("^I Click on Complete Task$")
	public void i_Click_on_Complete_Task() throws Exception{
		
		getReport().insertStep("I Click on Complete Task", "User Click on the Task Completed Button", TestStatus.INFO, "", false);
		casedetails = new BPMCaseActions(driver);
		casedetails.completeTask();
	}
	
	@Given("^I Upload Customer Document$")
	public void i_Upload_Customer_Documents() throws Exception{
		
		getReport().insertStep("I Upload the Customer Document", "User Uploading the Customer Documnet", TestStatus.INFO, "", false);
		casedetails = new BPMCaseActions(driver);
		casedetails.uploadContractDocument();
	
	}
	
	@Given("^I Click on the Cases Tab$")
	public void i_Click_on_the_Cases_Tab() throws Exception{
		
		getReport().insertStep("I Click on the Cases Tab", "User clicking on the Cases Tab", TestStatus.INFO, "", false);
		casedetails = new BPMCaseActions(driver);
		casedetails.clickCasesTab();
	
	}
	
	
	@Given("^I Click on the Case Link \"(.*)\"$")
	public void i_Click_on_the_Case_Link(String caseId) throws Exception{
		
		getReport().insertStep("I Click on the Cases Tab", "User clicking on the Cases Tab", TestStatus.INFO, "", false);
		casedetails = new BPMCaseActions(driver);
		casedetails.clickCasesIdLink(caseId);
	
	}
	
}
