package Test;


import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

//import SalesFlows.Utility;
import AccountScenario.AccountLayouts ;
import AccountScenario.AddressCheck;
import AccountScenario.ShippingAddress;
import AccountScenario.dependency;
import Login.Login;
import Login.Navigation;



public class Account_Scenario_ExtentReport {
	public WebDriver driver;
	public ExtentHtmlReporter htmlextent = null;
	public ExtentReports report = null;
	public ExtentTest log = null;
	Login objLogin;
	Navigation objNavigation;
	AccountLayouts objAccountLayouts;
	ShippingAddress objShippingAddress;
	AddressCheck objAddressCheck; 
	dependency objdependency;



	//To Calculate test class run time

	long Starttime;
	long Endtime;

	@BeforeTest
	public void beforetest(){
		System.setProperty("webdriver.chrome.silentOutput","true");
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (4)\\chromedriver.exe");
		
		//htmlextent = new ExtentHtmlReporter("C://Users//ranjith.raghavan//eclipse-workspace//ExtantReports_Salesforce_Scenario//test-output//Account_extent_Report.html");
		htmlextent = new ExtentHtmlReporter("D://Automation_Reports//Account_extent_Report.html");
		report = new ExtentReports();
		 // Create object of HashMap Class
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		 Actions action=new Actions(driver);
	        action.moveByOffset(150,50).click().build().perform();
	        
	}
	@BeforeMethod
	public void beforemethod(){
		report.attachReporter(htmlextent);
		htmlextent.config().setTheme(Theme.STANDARD);
	}
	@Test(priority = 0)
	public void Login_Salesforce_page() {
		// Create Login Page object
		objLogin = new Login(driver);
		// login to application
		objLogin.loginToSF("ranjithraghavan@htcinc.com","Indumathi@4321");		
	}
	@Test (priority = 1)
	public void Homepage() throws Exception {
		objNavigation = new Navigation(driver);
		objNavigation.gotoNavigation();
	}
	@Test (priority = 2)//,enabled=false)
	public void Account_Layouts () throws Exception {
		log = report.createTest("Account_Layouts");
		try {
			objAccountLayouts = new AccountLayouts(driver);
			objAccountLayouts.gotoAccount();  
			log.log(Status.PASS, "Account-Check Field availables in Account Layouts-Pass"+log.addScreenCaptureFromPath(captureScreen()));
		} catch (Exception e) {
			log.log(Status.FAIL, "Account-Check Field availables in Account Layouts-Fail"+log.addScreenCaptureFromPath(captureScreen()));
			Assert.assertTrue(false);
			e.printStackTrace();
		}
	}

	@Test (priority = 3)//,enabled=false)
	public void ShippingAddress_checkbox() throws Exception {
		log = report.createTest("ShippingAddress_checkbox");
		objShippingAddress = new ShippingAddress(driver);
		try {
			objShippingAddress.ShipAddressfield();
			log.log(Status.PASS, "Check Same as Shipping Address Field Checkbox-Pass"+log.addScreenCaptureFromPath(captureScreen()));
		} catch (Exception e) {
			log.log(Status.FAIL, "Check Same as Shipping Address Field Checkbox-Fail"+log.addScreenCaptureFromPath(captureScreen()));
			Assert.assertTrue(false);
			e.printStackTrace();
		}
	}

	@Test (priority = 4)//,enabled=false)
	public void Address_compare() throws Exception {
		log = report.createTest("Address_compare");
		objAddressCheck = new AddressCheck (driver);
		try {
			objAddressCheck .AddressFields();
			log.log(Status.PASS, "Check Billing and Shipping Address are same-Pass"+log.addScreenCaptureFromPath(captureScreen()));
		} catch (Exception e) {
			log.log(Status.FAIL, "Check Billing and Shipping Address are same-Fail"+log.addScreenCaptureFromPath(captureScreen()));
			Assert.assertTrue(false);
			e.printStackTrace();
		}
	}


	@Test (priority = 5)//,enabled=false)
	public void Dependency_Filed( ) throws Exception {
		log = report.createTest("Dependency_Filed");
		objdependency=new dependency(driver);
		try {
			objdependency.dependency_picklist("Customer - Direct","Medium");
			log.log(Status.PASS, "Check dependency picklist value in Account-Pass"+log.addScreenCaptureFromPath(captureScreen()));
		} catch (Exception e) {
			log.log(Status.FAIL, "Check dependency picklist value in Account-Fail"+log.addScreenCaptureFromPath(captureScreen()));
			Assert.assertTrue(false);
			e.printStackTrace();
		}
	}

	@AfterTest
	public void aftertest(){
		report.flush();
		driver.close();
	}

	public String captureScreen() throws IOException {
		TakesScreenshot screen = (TakesScreenshot) driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		//String dest ="D://Screenshot//"+getcurrentdateandtime()+".png";
		String dest ="D://Automation_Reports//screenshots//"+getcurrentdateandtime()+".png";
		File target = new File(dest);
		FileUtils.copyFile(src, target);
		return dest;

	}
	public String getcurrentdateandtime(){
		String str = null;
		try{
			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SSS");
			Date date = new Date();
			str= dateFormat.format(date);
			str = str.replace(" ", "").replaceAll("/", "").replaceAll(":", "");
		}
		catch(Exception e){

		}
		return str;

	}
}

