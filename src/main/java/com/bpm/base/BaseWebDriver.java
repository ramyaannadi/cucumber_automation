package com.bpm.base;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bpm.util.TestStatus;













public class BaseWebDriver extends BaseFramework
{
	private  WebDriver d = null;
	private WebDriverWait wait;
	//private  static Logger logger = LogManager.getLogger(BaseWebDriver.class);


	public BaseWebDriver(WebDriver d) {
		this.d = d;
		
	}

	
	
	
	/**
	 * To get the webDriver Instance
	 * Where ever needed in the other class
	 * 
	 *  */
	public  WebDriver getWD() {
		return d;
	}
	

	

	/**
	 * To Get WebElement Based on the locator type 
	 * @param elementlocator
	 * @return
	 * @throws IOException 
	 */

	public WebElement getId(String elementlocator) throws IOException {
		wait = new WebDriverWait(this.d, 30);
		try{

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementlocator)));
			return this.d.findElement(By.id(elementlocator));
		}catch(Exception e){
			try{
				scrollWebElement(this.d.findElement(By.id(elementlocator)));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementlocator)));
				return this.d.findElement(By.id(elementlocator));
			}catch(Exception e1){
				getReport().insertStep(e1.toString(), "", TestStatus.FAIL, "", true);
				throw e;
			}
		}

	}

	public WebElement getName(String elementlocator) throws IOException {
		wait = new WebDriverWait(this.d, 30);
		try{

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(elementlocator)));
			return this.d.findElement(By.name(elementlocator));
		}catch(Exception e){
			try{
				scrollWebElement(this.d.findElement(By.name(elementlocator)));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(elementlocator)));
				return this.d.findElement(By.name(elementlocator));
			}catch(Exception e1){
				getReport().insertStep(e1.toString(), "", TestStatus.FAIL, "", true);
				throw e;
			}
		}

	}

	public WebElement getXpath(String elementlocator) throws IOException {
		wait = new WebDriverWait(this.d, 30);
		try{

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementlocator)));
			return this.d.findElement(By.xpath(elementlocator));
		}catch(Exception e){
			try{
				scrollWebElement(this.d.findElement(By.xpath(elementlocator)));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementlocator)));
				return this.d.findElement(By.xpath(elementlocator));
			}catch(Exception e1){
				getReport().insertStep(e1.toString(), "", TestStatus.FAIL, "", true);
				throw e;
			}
		}

	}

	public WebElement getCSS(String elementlocator) throws IOException {
		wait = new WebDriverWait(this.d, 30);
		try{

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(elementlocator)));
			return this.d.findElement(By.cssSelector(elementlocator));
		}catch(Exception e){
			try{
				scrollWebElement(this.d.findElement(By.cssSelector(elementlocator)));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(elementlocator)));
				return this.d.findElement(By.cssSelector(elementlocator));
			}catch(Exception e1){
				getReport().insertStep(e1.toString(), "", TestStatus.FAIL, "", true);
				throw e;
			}
		}

	}


	public WebElement getClassName(String elementlocator) throws IOException {
		wait = new WebDriverWait(this.d, 30);
		try{

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(elementlocator)));
			return this.d.findElement(By.className(elementlocator));
		}catch(Exception e){
			try{
				scrollWebElement(this.d.findElement(By.className(elementlocator)));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(elementlocator)));
				return this.d.findElement(By.className(elementlocator));
			}catch(Exception e1){
				getReport().insertStep(e1.toString(), "", TestStatus.FAIL, "", true);
				throw e;
			}
		}

	}


	public WebElement getLinkText(String elementlocator) throws IOException {
		wait = new WebDriverWait(this.d, 30);
		
		try{

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(elementlocator)));
			return this.d.findElement(By.linkText(elementlocator));
		}catch(Exception e){
			try{
				scrollWebElement(this.d.findElement(By.linkText(elementlocator)));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(elementlocator)));
				return this.d.findElement(By.linkText(elementlocator));
			}catch(Exception e1){
				getReport().insertStep(e1.toString(), "", TestStatus.FAIL, "", false);
				throw e;
			}
		}

	}

	
	public List<WebElement> getWebElements(String locator){
		
		String data[] = locator.split("=");
		 
		String elementlocator = data[1].trim();
		List<WebElement> elements=null;
		elements = getWD().findElements(By.xpath(elementlocator));
		return elements;
	}

	public  WebElement getWebElement(String locator) throws IOException {

		WebElement element=null;
		if(locator.startsWith(".//") || locator.startsWith("(.//")){
			
			
				element = getXpath(locator);
			
			
		}else{
		String data[] = locator.split("=");
		String locatortype = data[0].trim();
		String elementlocator = data[1].trim();
		
		if (locatortype.equalsIgnoreCase("id")) {
			element = getId(elementlocator);
		} else if (locatortype.equalsIgnoreCase("name")) {
			element = getName(locatortype);
		} else if (locatortype.equalsIgnoreCase("xpath")) {
			element = getXpath(elementlocator);
		} else if (locatortype.equalsIgnoreCase("css")) {
			element = getCSS(elementlocator);
		} else if (locatortype.equalsIgnoreCase("class")) {
			element = getClassName(elementlocator);
		} else if (locatortype.equalsIgnoreCase("link")) {
			element = getLinkText(elementlocator);
		}
		}
		return element;

	}

	public void scrollWebElement(WebElement element){

		JavascriptExecutor je = (JavascriptExecutor) this.d; 
		je.executeScript("arguments[0].scrollIntoView(true);",element);

	}
	
	
	

	/**
	 * To open the defined URL.
	 * @param URL
	 * @return and return the given URL if needed
	 * @throws Exception
	 */

	public  String openURL(String URL) throws Exception {
		getWD().get(URL);
		getWD().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return URL;
	}




	/**
	 * To Wait for required amount of time for each action performed in the called method
	 * @param Seconds
	 */

	public  void wait(int Seconds) {
		getWD().manage().timeouts().implicitlyWait(Seconds, TimeUnit.SECONDS);
	}

	/**
	 * To Wait the Execution for required amount of seconds
	 * @param Seconds
	 * @throws InterruptedException
	 */


	public  void delay(int Seconds) throws InterruptedException {
		Thread.sleep(Seconds * 1000);

	}

	/**
	 * Waits for page to load
	 * @throws Exception
	 */

	public  void waitForPageToLoad() throws Exception {
		WebDriverWait wait = new WebDriverWait(getWD(),40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//*[not (.='')]")));
	}

	
	

	/**
	 * Does not wait for the page to load .Just clicks and proceeds for the next
	 * statement.
	 * 
	 * @param elementlocator
	 * @param idtype
	 * @throws Exception
	 */

	public  void click(WebElement element) throws Exception {
		element.click();
	}



	/**
	 * Click on the required element and waits page to load
	 * 
	 * 
	 * @param elementlocator
	 * @param locatortype
	 * @throws Exception
	 */

	public  void clickAndWait(WebElement elementlocator) throws Exception {

		
		click(elementlocator);
		waitForPageToLoad();
	}

	/**
	 * To Find the WebElement in the web page.
	 * @param element
	 * @param idtype
	 * @return
	 */

	


	/**
	 * To Maximize the window.
	 */

	public  void maximize() {
		getWD().manage().window().maximize();
	}


	/**
	 * To Close the Instance of the Created WebDriver and assign the NULL.
	 */

	public  void close() {
		getWD().close();
		getWD().quit();
		d = null;
	}


	/**
	 * Returns the visible text of the element.
	 * 
	 * @param elementlocator
	 * @param locatortype
	 * @return
	 * @throws Exception
	 */

	public  String getText(WebElement element) throws Exception {
		String Text =null;
		Text =element.getText();
		return Text;
	}

	/**
	 * Returns the visible text of the element.
	 * 
	 * @param elementlocator
	 * @param locatortype
	 * @return
	 * @throws Exception
	 */

	public  String getValue(WebElement elementlocator) throws Exception {
		String Text =null;
		Text = elementlocator.getAttribute("value");
		return Text;
	}

	/**
	 * Check a toggle-button (checkbox/radio)
	 * 
	 * @param elementlocator
	 * @param locatortype
	 */

	public  void check(WebElement elementlocator) {


		if (!elementlocator.isSelected()) {
			elementlocator.click();
		}
	}

	/**
	 * Uncheck a toggle-button (checkbox/radio)
	 * if element is selected
	 * 
	 * 
	 * @param elementlocator
	 * @param locatortype
	 * @throws Exception
	 */

	public  void uncheck(WebElement elementlocator) throws Exception { 


		if (elementlocator.isSelected()) {
			elementlocator.click();
		}	
	}

	/**
	 * To Select the visible text option from the Dropdown
	 * present in the webpage.
	 * 
	 * 
	 * @param selectlocator
	 * @param locatortype
	 * @param optionText
	 * @throws Exception
	 */


	public  void selectByVisibleText(WebElement selectlocator ,String optionText) throws Exception {


		new Select(selectlocator).selectByVisibleText(optionText);

	}


	/**
	 * to get the selected value from the drop down list.
	 * 
	 * @param selectlocator
	 * @param locatortype
	 * @return
	 */

	public  String selectedValue(WebElement selectlocator) {


		return new Select(selectlocator).getFirstSelectedOption().getText();
	}


	/**
	 * Simulates a user hovering a mouse over the specified element.
	 * 
	 * 
	 * @param elementlocator
	 * @param locatortype
	 */

	public  void mouseOver(WebElement elementlocator) {


		Actions builder = new Actions(getWD());
		builder.moveToElement(elementlocator).build().perform();
	}

	/**
	 * Simulates a user hovering a mouse over the specified element.
	 * and click on the particular element.
	 * 
	 * @param elementlocator
	 * @param locatortype
	 */

	public  void mouseOverClick(WebElement elementlocator) {


		Actions builder = new Actions(getWD());
		builder.moveToElement(elementlocator).click().build().perform();	
	}

	/**
	 * Gets whether a toggle-button (checkbox/radio) is checked.
	 * 
	 * 
	 * @param elementlocator
	 * @param locatortype
	 * @return true if the checkbox is checked, otherwise false
	 * @throws Exception
	 */

	public  boolean isChecked(WebElement elementlocator) throws Exception {

		return elementlocator.isSelected();
	}

	/**
	 * Gets whether a webelement is displayed or not.
	 * 
	 * 
	 * @param elementlocator
	 * @param locatortype
	 * @return true if the specified element is visible,otherwise false
	 * @throws Exception
	 */

	public  boolean isVisible(WebElement elementlocator) throws Exception {

		try {
			return elementlocator.isDisplayed();

		} catch(Exception e) {
			return false;
		}
	}





	/**
	 * To sendkeys in to any text box present on webelement
	 * 
	 * 
	 * @param elementlocator
	 * @param locatortype
	 * @param valuetotype
	 * @throws IOException 
	 */

	public  void sendKeys(WebElement elementlocator , String valuetotype) throws IOException {

		
		elementlocator.sendKeys(valuetotype);
	}

	/**
	 * Returns the title of the current active window
	 * 
	 * @return title of the open web page
	 * @throws Exception
	 */

	public  String getTitle() throws Exception
	{
		return getWD().getTitle();
	}





	/**
	 * To get the Xpath count of
	 * any element present in the web page
	 * 
	 * @param elementlocator
	 * @return
	 * @throws Exception
	 */

	public  int getXPathCount(String elementlocator) throws Exception {

		return getWD().findElements(By.xpath(elementlocator)).size();
	}


	/**
	 * To switch the cursor the defined iframe located in the web page
	 * 
	 * @param framelocator
	 * @param locatortype
	 */

	public  void switchFrame(WebElement framelocator) {
		
		getWD().switchTo().frame(framelocator);
	}

	/**
	 * To switch the cursor the default web page.
	 */

	public  void switchToDefaultConatiner() {
		getWD().switchTo().defaultContent();
	}


	/**
	 * To verify the alert present in the web page
	 * 
	 * 
	 * @return true if alert present , other wise false.
	 * @throws Exception
	 */

	public  boolean isAlertPresent() throws Exception {

		try {
			WebDriverWait wait = new WebDriverWait(getWD(), 20);
			wait.until(ExpectedConditions.alertIsPresent());
			return true;
		}
		catch(Exception e) {
			return false;
		}

	}


	/**
	 * to get the values in the drop down
	 * @param Property
	 * @param PropertyType
	 * @return
	 */
	public  ArrayList<String> getDropDownValue(WebElement Property , String PropertyType) {

		ArrayList<String> ddlvalues = new ArrayList<String>();
		Select select = new Select(Property);
		List<WebElement> values = select.getOptions();
		for(WebElement value :values) {
			ddlvalues.add(value.getText());
		}
		return ddlvalues;

	}

	/**
	 * To get the text present on the Alert
	 * or confirmation box.
	 * 
	 * @return
	 * @throws Exception
	 */

	public  String getAlertText() throws Exception {

		String alerttext = null;
		alerttext =getWD().switchTo().alert().getText();
		return alerttext;
	}

	/**
	 * To click OK on the Confirmation box
	 * or accept the alert
	 * 
	 * @throws Exception
	 */

	public  void chooseOkOnNextConfirmation() throws Exception {

		getWD().switchTo().alert().accept();
	}

	/**
	 * To Click No on the confirmation box.
	 * or to dismiss alert
	 * 
	 * @throws Exception
	 */

	public  void chooseNoOnNextConfirmation() throws Exception {

		getWD().switchTo().alert().dismiss();
	}


	/**
	 * to handle windows
	 * @return
	 */
	/**
	 * To read the Text on the confirmation box.
	 * or to dismiss alert
	 * 
	 * @throws Exception
	 */


	public  String windowHandle() {

		String parentWindow = getWD().getWindowHandle();
		for(String childWindow: getWD().getWindowHandles()) {
			getWD().switchTo().window(childWindow);
		}
		return parentWindow;
	}

	/**
	 * to Switch between windows
	 * @param Window
	 */
	public  void switchWindow(String Window) {

		getWD().switchTo().window(Window);
	}

	/**
	 * to execute java scripts
	 * @param Code
	 */

	public  void javaScrpitExcecutor(String Code) {
		JavascriptExecutor javascript = (JavascriptExecutor)getWD();
		javascript.executeScript(""+Code+"");
	}


	/**
	 * to generate Alert with
	 * user defined message
	 * @param Message
	 * @param secondstoAccept
	 * @throws Exception
	 */
	public  void generateAlertandAccept(String Message, int secondstoAccept) throws Exception {

		javaScrpitExcecutor("alert('"+Message+"');");
		delay(secondstoAccept);
		chooseOkOnNextConfirmation();
	}


	public void waitforPageLoadJS() {

		JavascriptExecutor javascript = (JavascriptExecutor)getWD();
		javascript.executeScript("return document.readyState").equals("complete");

	}


	public  void mouseclick(WebElement a,WebElement b) {
		try {
			String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
			((JavascriptExecutor) getWD()).executeScript(mouseOverScript,a);
			Thread.sleep(1000);
			((JavascriptExecutor) getWD()).executeScript(mouseOverScript,b);
			Thread.sleep(1000);
			((JavascriptExecutor) getWD()).executeScript("arguments[0].click();",b);


		} catch (Exception e) {

		}
	}


	/**
	 * To clear the Data
	 * @param elementlocator
	 * @param locatortype
	 * @throws Exception
	 */
	public  void Clear(WebElement elementlocator) throws Exception {

		elementlocator.clear();
	}

}






