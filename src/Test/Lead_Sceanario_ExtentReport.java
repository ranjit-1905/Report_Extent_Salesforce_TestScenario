package Test;


import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

import LeadScenario.Account_Creation;
import LeadScenario.Address_update;
import LeadScenario.AnnualRevenue;
import LeadScenario.LastName_Company;
import LeadScenario.Lead;
import LeadScenario.LeadConversion;
import LeadScenario.LeadStatus;
import LeadScenario.Opportunities_Creation;
import LeadScenario.ValidationRule;
import Login.Login;
import Login.Navigation;

public class Lead_Sceanario_ExtentReport {
	public WebDriver Webdriver ;
	public WebDriver driver;
	public ExtentHtmlReporter htmlextent = null;
	public ExtentReports report = null;
	public ExtentTest log = null;
	Login objLogin;
	Navigation objNavigation;
	Lead objLead;
	ValidationRule objValidationRule;
	AnnualRevenue objAnnualRevenue;
	LeadStatus objLeadStatus;
	LeadConversion objLeadConversion;
	Address_update objAddress_update;
	LastName_Company objLastName_Company;
	Opportunities_Creation objOpportunities_Creation;
	Account_Creation objAccount_Creation;



	@BeforeTest
	public void beforetest(){
		System.setProperty("webdriver.chrome.silentOutput","true");
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (4)\\chromedriver.exe");
		htmlextent = new ExtentHtmlReporter("C://Users//ranjith.raghavan//eclipse-workspace//ExtantReports_Salesforce_Scenario//test-output//Account_extent_Report.html");
		htmlextent = new ExtentHtmlReporter("D://Automation_Reports//Lead_extent_Report.html");
		report = new ExtentReports();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
	}
		
	

	@BeforeMethod
	public void beforemethod(){
		report.attachReporter(htmlextent);
		htmlextent.config().setTheme(Theme.STANDARD);
	}

	@Test(priority = 0)
	public void Login_Salesforce_page() {
		// Create Login Page object
		//log = report.createTest("Login_Salesforce_page");
		objLogin = new Login(driver);
		objLogin.loginToSF("ranjithraghavan@htcinc.com","Indumathi@4321");	
		
		
	}
	@Test (priority = 1)
	public void Homepage() throws Exception {
		//log = report.createTest("Homepage");
		objNavigation = new Navigation( driver );
		objNavigation.gotoNavigation();
	}

	@Test (priority = 2)//,enabled=false)
	public void LastName_company_check() throws IOException {
		log = report.createTest("LastName_company_check");
		try {
			objLastName_Company= new LastName_Company( driver );
			objLastName_Company.LastName_company_check();  
			// TODO Auto-generated catch block

			log.log(Status.PASS, "Lead - Check required fields in Lead - Last Name & Company-Pass"+log.addScreenCaptureFromPath(captureScreen()));
		} catch (Exception e) {
			log.log(Status.FAIL, " Lead - Check required fields in Lead - Last Name & Company-Fail"+log.addScreenCaptureFromPath(captureScreen()));
			Assert.assertTrue(false);
			e.printStackTrace();
		}
	}

	@Test (priority = 3)//,enabled=false)
	public void Lead_LastName_Company () throws IOException {
		try {
			objLead = new Lead( driver );
			objLead.gotoLead("Mr.","Allen","Zimmers","Corp Moody");  
			// TODO Auto-generated catch block

			log.log(Status.PASS, "Lead - Check required fields in Lead - Last Name & Company-Pass"+log.addScreenCaptureFromPath(captureScreen()));
		} catch (Exception e) {
			log.log(Status.FAIL, " Lead - Check required fields in Lead - Last Name & Company-Fail"+log.addScreenCaptureFromPath(captureScreen()));
			Assert.assertTrue(false);
			e.printStackTrace();
		}
	}
	@Test (priority = 4)
	public void Validate_the_field() throws IOException {
		log = report.createTest("Validate_the_field");
		objValidationRule = new ValidationRule(driver);
		try {
			objValidationRule.Validate ();
			log.log(Status.PASS, "Lead - Validation Rule - Annual Revenue field should be filled-Pass"+log.addScreenCaptureFromPath(captureScreen()));
		} catch (Exception e) {
			log.log(Status.FAIL, " Lead - Validation Rule - Annual Revenue field should be filled - Fail"+log.addScreenCaptureFromPath(captureScreen()));
			Assert.assertTrue(false);
			e.printStackTrace();

		}
	}
	@Test (priority = 5)// ,enabled=false)
	public void AnnualRevenue() throws IOException {
		log = report.createTest("AnnualRevenue");
		objAnnualRevenue= new AnnualRevenue(driver);
		try {
			objAnnualRevenue.gotoAnnual("25100");
			log.log(Status.PASS, "Lead - Validation Rule - Annual Revenue has filled-Pass"+log.addScreenCaptureFromPath(captureScreen()));
		} catch (Exception e) {
			log.log(Status.FAIL, " Lead - Validation Rule - Annual Revenue has filled-Fail"+log.addScreenCaptureFromPath(captureScreen()));
			Assert.assertTrue(false);
			e.printStackTrace();

		}
	}
	@Test (priority = 6)
	public void Address() throws Exception {
		objAddress_update = new Address_update(driver);
		objAddress_update.Address_update_Field("123 Main Street Apartment 4B ", "Anytown", "13126","NA", "United States");
	}
	@Test (priority = 7)//,enabled=false)
	public void LeadConversion( ) throws Exception {
		log = report.createTest("LeadConversion");
		objLeadStatus=new LeadStatus(driver);
		try {
			objLeadStatus.LeadStatusreport();
			log.log(Status.PASS, "Lead Status should be changed to Qualified Lead-Pass"+log.addScreenCaptureFromPath(captureScreen()));
		} catch (Exception e) {
			log.log(Status.FAIL, " Lead Status should be changed to Qualified Lead -Fail"+log.addScreenCaptureFromPath(captureScreen()));
			Assert.assertTrue(false);
			e.printStackTrace();

		}
	}
	@Test (priority = 8)//,enabled=false)
	public void LeadStauts() throws Exception {
		log = report.createTest("LeadStauts");
		objLeadConversion=new LeadConversion(driver);
		try {
			objLeadConversion.gotoConversion();
			log.log(Status.PASS, "Check Lead Conversion-Pass"+log.addScreenCaptureFromPath(captureScreen()));

		} catch (Exception e) {
			log.log(Status.FAIL, " Check Lead Conversion-Fail"+log.addScreenCaptureFromPath(captureScreen()));
			Assert.assertTrue(false);
			e.printStackTrace();
		}
	}

	@Test(priority = 9)//,enabled=false)
	public void Account_Creation() throws Exception {
		log = report.createTest("Account_OpportunityCreation");
		objAccount_Creation = new Account_Creation(driver);		
		try {
			objAccount_Creation. Accounttabclick_Validate();
			log.log(Status.PASS, "Check Account/Opportunity Creation-Pass"+log.addScreenCaptureFromPath(captureScreen()));
		} catch (Exception e) {
			log.log(Status.FAIL, "Check Account/Opportunity Creation-Fail"+log.addScreenCaptureFromPath(captureScreen()));
			Assert.assertTrue(false);
			e.printStackTrace();
		}
	}

	@Test(priority = 10)//,enabled=false)
	public void Opportunity_Creation() throws Exception {
		//log = report.createTest("Account_OpportunityCreation");
		objOpportunities_Creation = new Opportunities_Creation(driver);		

		try {
			objOpportunities_Creation. Opportunitiestabclick_Validate();
			log.log(Status.PASS, "Check Account/Opportunity Creation-Pass"+log.addScreenCaptureFromPath(captureScreen()));
		} catch (Exception e) {
			log.log(Status.FAIL, "Check Account/Opportunity Creation-Fail"+log.addScreenCaptureFromPath(captureScreen()));
			Assert.assertTrue(false);
			e.printStackTrace();
		}
	}
	@AfterTest
	public void aftertest(){
		
		report.flush();
	    // Close the browser
		
		
	    //driver.quit();
	    
	

	 try {
         driver.quit();
     } catch (NullPointerException e) {
         System.err.println("Error: driver is null");
     }
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
