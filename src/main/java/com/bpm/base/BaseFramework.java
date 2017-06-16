package com.bpm.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import com.bpm.util.ExtentReport;
import com.bpm.util.Xls_Reader;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class BaseFramework {
	
	private  static Logger logger = LogManager.getLogger(BaseFramework.class);
	private WebDriver d;
	private static Properties prop ;
	private static Xls_Reader xls;
	private static ExtentReport report;
	
	
	
	
	
	public static ExtentReport getReport() {
		return report;
	}

	public static void setReport(ExtentReport report) {
		BaseFramework.report = report;
	}

	public static Xls_Reader getXls() {
		return xls;
	}

	public static void setXls(Xls_Reader xls) {
		BaseFramework.xls = xls;
	}

	public WebDriver getDriver() {
		return d;
	}

	public void setDriver(WebDriver d) {
		this.d = d;
	}
	
	

	public static Properties getProp() {
		return prop;
	}

	public static void setProp(Properties prop) {
		BaseFramework.prop = prop;
	}
	
	
	
	
	public void loadconfig() throws FileNotFoundException, IOException
	{
		
		prop =  new Properties();
		prop.load(new FileInputStream(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"config.properties"));//Uncomment in order to execute Tests from Eclipse
		
		
		
		
	}
	
	public static String getProperty(String property){
		
		return prop.getProperty(property);
	}
	
	public void getBaseUrl(){
		d.get(prop.getProperty("appURL"));
		d.manage().window().maximize();
	}
	/**
	 * To create the required browser instance.
	 * 
	 * @param Browser
	 * @return the instance of created web-driver
	 * @throws MalformedURLException
	 */

	public  WebDriver createWebDriverInstance(String Browser) throws MalformedURLException
	{
		if(d==null && Browser.equals("Firefox"))
		{

			d = new FirefoxDriver();
			logger.info("--FireFox Browser has opened ");
		}

		else if(d==null &&  Browser.equals("Chrome"))
		{
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			DesiredCapabilities capabilities = new DesiredCapabilities(DesiredCapabilities.chrome());
			capabilities.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
			capabilities.setCapability (ChromeOptions.CAPABILITY,options);
			ChromeDriverManager.getInstance().setup();
			
			//Don't Remember Passwords by default
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			options.setExperimentalOption("prefs", prefs);
			/*
			String path =System.getProperty("user.dir")+File.separator+"chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			ChromeOptions options = new ChromeOptions();
			DesiredCapabilities caps = DesiredCapabilities.chrome();*/
			d = new ChromeDriver(capabilities);
			logger.info("--Chrome Browser has opened ");
		}

		else if (d==null && Browser.equals("IE"))
		{
			String path ="binary/IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", path);
			logger.info("--IEDriver has setup");
			DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
			caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			caps.setCapability("requireWindowFocus", true);
			caps.setCapability("enablePersistentHover", true);
			caps.setCapability("native events", true);
			d = new InternetExplorerDriver(caps);
			logger.info("--IE Browser has opened ");
		}
		else if (d==null && Browser.equals("IE32bit"))
		{
			String path ="binary/IEDriverServer_32bit.exe";
			System.setProperty("webdriver.ie.driver", path);
			logger.info("--IEDriver has setup");
			DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
			caps.setCapability(
					InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
					true);
			caps.setCapability("requireWindowFocus", true);
			caps.setCapability("enablePersistentHover", false);
			caps.setCapability("native events", true);
			d = new InternetExplorerDriver(caps);
			logger.info("--IE Browser has opened ");
		}
		return d;


	}

	public String replaceLocator(String locator , String value){
		String returnLocator =  null;
		returnLocator= locator.replace("@@value@@", value);
		return returnLocator;
		
	}

}
