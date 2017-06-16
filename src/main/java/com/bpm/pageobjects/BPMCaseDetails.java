package com.bpm.pageobjects;



public class BPMCaseDetails {

	public String getClaimButton= ".//*[text()='Claim Task' and contains(@class,'button')]";
	public String getDropdownLOA= "(.//*[text()='Does the LOA meet requirements?']/following::input[contains(@class,'filterselect-input')])[1]";
	public String getLOADropwonValue= ".//*[text()='@@value@@']";
	public String getAddHaluerButton=".//*[text()='Add Hauler Candidate 1' and contains(@class,'button')]";
	public String getHaulerTextBox= "(.//*[@class='popupContent']//following::*[contains(text(),'Hauler Name:')]//following::input)[1]";
	public String getRateTypeDropDown= "(.//*[@class='popupContent']//following::*[contains(text(),'Rate Type:')]//following::input)[1]";
	public String getRateDropwonValue= ".//*[text()='@@value@@']";
	public String getUnitOfMeasureDropDown="(.//*[@class='popupContent']//following::*[contains(text(),'Unit of Measure:')]//following::input)[1]";
	public String getUnitOfMeasureDropwonValue= ".//*[contains(text(),'@@value@@')]";
	public String getRateTextBox="(.//*[@class='popupContent']//following::*[contains(text(),'Rate:')]//following::input)[1]";
	public String getAddRateButton="(.//*[@class='popupContent']//following::*[text()='Add Rate' and contains(@class,'button')])[1]";
	public String getADDHaluerButton=".//*[text()='Add Hauler' and contains(@class,'button')]";
	public String getHaluerAgreeTerms="(.//*[contains(text(),'Did any of the haulers agree to the terms')]//following::input)[1]";
	public String getHaluerAgreeTermsDropwonValue=".//*[contains(text(),'@@value@@')]";
	public String getAddContractedHaluer=".//*[text()='Add Contracted Hauler' and contains(@class,'button')]";
	public String getNameTextBox="(.//*[@class='popupContent']//following::*[contains(text(),'Name:')]//following::input)[1]";
	public String getVendorIDTextBox="(.//*[@class='popupContent']//following::*[contains(text(),'Vendor ID:')]//following::input)[1]";
	public String getSearchButton=".//*[text()='Search' and contains(@class,'button')]";
	public String getVendorLink=".//*[text()='@@value@@']";
	public String getVendorTypeDropDown="(.//*[@class='popupContent']//following::*[contains(text(),'Vendor Type:')]//following::input)[1]";
	public String getVendorTypeDropDownValue=".//*[contains(text(),'@@value@@')]";
	public String getNextButton=".//*[text()='Next' and contains(@class,'button')]";
	public String getFinishButton=".//*[text()='Finish' and contains(@class,'button')]";
	public String getCompleteTaskButton=".//*[text()='Complete task' and contains(@class,'button')]";
	public String getCustomerDocumentUploadFile = ".//input[@type='file']";
	public String getCasesTab = "(.//*[contains(text(),'Cases') and contains(@class,'button-caption')])[1]";
	public String getCaseLink = ".//*[text()='@@value@@' and contains(@class,'table-cell')]";

}

