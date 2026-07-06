package org.vtiger.businessutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.vtiger.genericutility.FileUtility;
import org.vtiger.genericutility.JavaUtility;
import org.vtiger.genericutility.WebDriverUtility;
import org.vtiger.objectrepository.CampaignsPage;
import org.vtiger.objectrepository.CreateCampaignPage;
import org.vtiger.objectrepository.Homepage;
import org.vtiger.objectrepository.LoginPage;


public class BaseClass {
	public static WebDriver sdriver;
	public WebDriver driver;
	public FileUtility futil=new  FileUtility();
	public WebDriverUtility webUtil=  new WebDriverUtility();
	public JavaUtility jUtil = new JavaUtility();
	public LoginPage loginPage;
	public Homepage homePage;
	public CampaignsPage campaignPage;
	public CreateCampaignPage createCampaignPage;
	@BeforeMethod
	public void login() throws IOException {
		loginPage=new LoginPage(driver);
		String USERNAME=futil.readDataFromPropertiesFile("username");
		String PASSWORD= futil.readDataFromPropertiesFile("password");
		loginPage.getUsernameTextFiled().sendKeys(USERNAME);
		loginPage.getPassswordTextField().sendKeys(PASSWORD);
		loginPage.getSubmitButton().submit();
		
	}
	//@Parameters("browser")
	@BeforeClass
	public void launchBrowser() throws IOException,SkipException {
		String BROWSER=futil.readDataFromPropertiesFile("browser");

		if(BROWSER.equalsIgnoreCase("chrome")) {
			ChromeOptions setting= new ChromeOptions();
			setting.addArguments("--disable-notifications");
			driver= new ChromeDriver(setting);
			
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			EdgeOptions setting= new EdgeOptions();
			setting.addArguments("--disable-popup-blocking");
			driver= new EdgeDriver(setting);
			
			
		}
		else if(BROWSER.equalsIgnoreCase("firefox")){
			FirefoxOptions setting= new FirefoxOptions();
			setting.addArguments("--disable-popup-blocking");
			driver	= new FirefoxDriver(setting);
			
		}
		else
		{
			Reporter.log("Enter the Valid browser");
		}
		
		String URL = futil.readDataFromPropertiesFile("url");
		sdriver=driver;
		webUtil.toMaximize(driver);
		webUtil.toImplicityWait(driver);
		webUtil.toGet(driver, URL);
	}
	@AfterMethod
	public void logout() {
		homePage=new Homepage(driver);
		webUtil.toMoveToElement(driver,homePage.getAdministatorIcon());
		homePage.getSigOutLink().click();
	}
	@AfterClass
	public void closeBrowser() {
		webUtil.toQuit(driver);
	}
}
