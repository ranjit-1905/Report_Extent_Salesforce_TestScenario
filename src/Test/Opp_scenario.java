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
import Login.Login;
import Login.Navigation;
import OpportunityScenario.AnnualRevenueAutopopulate;
import OpportunityScenario.Check_Product_generate;
import OpportunityScenario.Closed_lost;
import OpportunityScenario.Closed_won;
import OpportunityScenario.ContactDetails;
import OpportunityScenario.Contract_Creation;
import OpportunityScenario.DataType;
import OpportunityScenario.Notes_Attachment;
import OpportunityScenario.OpportunityLayouts;
import OpportunityScenario.QualificationTask;
import OpportunityScenario.Quote_PDF;
import OpportunityScenario.Quote_created;
import OpportunityScenario.Quote_Accepted;
import OpportunityScenario.Activated_Contract;
import OpportunityScenario.Order_Creation;
import OpportunityScenario.Quote_Rejected;


public class Opp_scenario {
	public WebDriver driver;
	public ExtentHtmlReporter htmlextent = null;
	public ExtentReports report = null;
	public ExtentTest log = null;
	Login objLogin;
	Navigation objNavigation;
	OpportunityLayouts objOpportunityLayouts;
	DataType objDataType;
	AnnualRevenueAutopopulate objAnnualRevenueAutopopulate;
	ContactDetails objContactDetails;
	QualificationTask objQualificationTask;
	Quote_created objQuote_created;
	Closed_won objClosed_won;
	Contract_Creation objContract_Creation;
	Closed_lost objClosed_lost;
	Quote_PDF objQuote_PDF;	
	Check_Product_generate objCheck_Product_generate;
	Notes_Attachment objNotes_Attachment;
	Quote_Accepted objQuote_Accepted;
	Activated_Contract objActivated_Contract;
	Order_Creation objOrder_Creation;
	Quote_Rejected objQuote_Rejected;
	
	
	@BeforeTest
	public void beforetest(){
		System.setProperty("webdriver.chrome.silentOutput","true");
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (4)\\chromedriver.exe");
		driver = new ChromeDriver();
		//htmlextent = new ExtentHtmlReporter("C:C://Users//ranjith.raghavan//eclipse-workspace//ExtantReports_Salesforce_Scenario//test-output//Opportunity_extent_Report.html");
		htmlextent = new ExtentHtmlReporter("D://Automation_Reports//Opportunity_extent_Report.html");
		report = new ExtentReports();
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
		objLogin = new Login(driver);
		// login to application
		objLogin.loginToSF("ranjithraghavan@htcinc.com","Welcome$123");		
	}
	@Test (priority = 1)
	public void Homepage() throws Exception {
		objNavigation = new Navigation(driver);
		objNavigation.gotoNavigation();
	}
	@Test (priority = 8)
	public void Check_Product() throws Exception {
		objCheck_Product_generate = new Check_Product_generate(driver);
		objCheck_Product_generate.gengenerate_Quote_PDF("5","5");
	}
	@Test(priority = 9)//,enabled=false)
	public void Quote_created_PDF() throws Exception {
		log = report.createTest("Quote_created_PDF");
		objQuote_PDF = new Quote_PDF(driver);
		try {
			objQuote_PDF.goto_Quotes_PDF();
			log.log(Status.PASS, " Check Product availability & generate Quote PDF-Pass"+log.addScreenCaptureFromPath(captureScreen()));
		} catch (Exception e) {
			log.log(Status.FAIL, " Check Product availability & generate Quote PDF-Fail"+log.addScreenCaptureFromPath(captureScreen()));
			Assert.assertTrue(false);
			e.printStackTrace();
		}

	}
	@Test(priority = 10)//,enabled=false)
	public void Notes_Attachmented() throws Exception {
		log = report.createTest("Notes & Attachment section");
		objNotes_Attachment = new Notes_Attachment(driver);
		try {
			objNotes_Attachment.Notes_Attachment_section();
			log.log(Status.PASS, " Notes & Attachment section-Pass"+log.addScreenCaptureFromPath(captureScreen()));
		} catch (Exception e) {
			log.log(Status.FAIL, " Notes & Attachment section-Fail"+log.addScreenCaptureFromPath(captureScreen()));
			Assert.assertTrue(false);
			e.printStackTrace();
		}

	}
	@Test(priority = 11)//,enabled=false)
	public void  Quote_Accepted() throws Exception {
		log = report.createTest("Quote_Accepted");
		objQuote_Accepted = new Quote_Accepted(driver);
		try {
			objQuote_Accepted.Quote_Accepted_PDF();
			log.log(Status.PASS, "Check Quote Accepted -Pass"+log.addScreenCaptureFromPath(captureScreen()));
		} catch (Exception e) {
			log.log(Status.FAIL, "Check Quote Accepted -Fail"+log.addScreenCaptureFromPath(captureScreen()));
			Assert.assertTrue(false);
			e.printStackTrace();
		}

	}
	@Test(priority = 12)//,enabled=false)
	public void  Closed_won() throws Exception {
		log = report.createTest("Closed_won");
		objClosed_won = new Closed_won(driver);
		try {
			objClosed_won.Closed_Won_task("Closed Won");
			log.log(Status.PASS, "Check Quote Accepted -Pass"+log.addScreenCaptureFromPath(captureScreen()));
		} catch (Exception e) {
			log.log(Status.FAIL, "Check Quote Accepted -Fail"+log.addScreenCaptureFromPath(captureScreen()));
			Assert.assertTrue(false);
			e.printStackTrace();
		}

	}
	

	@Test(priority = 13)//,enabled=false)
	public void  Contract_Created() throws Exception {
		log = report.createTest("Contract_Created");
		objContract_Creation = new Contract_Creation(driver);
		try {
			objContract_Creation.Contract_Create("All Orders");
			log.log(Status.PASS, "Activated Contract and Order Creation-Pass"+log.addScreenCaptureFromPath(captureScreen()));
		} catch (Exception e) {
			log.log(Status.FAIL, "Check Quote Accepted and Check Contract Creation-Fail"+log.addScreenCaptureFromPath(captureScreen()));
			Assert.assertTrue(false);
			e.printStackTrace();
		}
	}

	@Test(priority = 14)//,enabled=false)
	public void  Activated_Contract() throws Exception {
		log = report.createTest("Activated_Contract");
		objActivated_Contract = new Activated_Contract(driver);
		try {
			objActivated_Contract.Activated("All Orders");
			log.log(Status.PASS, "Activated Contract -Pass"+log.addScreenCaptureFromPath(captureScreen()));
		} catch (Exception e) {
			log.log(Status.FAIL, "Activated Contract-Fail"+log.addScreenCaptureFromPath(captureScreen()));
			Assert.assertTrue(false);
			e.printStackTrace();
		}
	}
	@Test(priority = 15)//,enabled=false)
	public void  Order_Creation() throws Exception {
		log = report.createTest("Order_Creation");
		objOrder_Creation = new Order_Creation(driver);
		try {
			objOrder_Creation.Order_Create();
			log.log(Status.PASS, "Activated Contract -Pass"+log.addScreenCaptureFromPath(captureScreen()));
		} catch (Exception e) {
			log.log(Status.FAIL, "Activated Contract-Fail"+log.addScreenCaptureFromPath(captureScreen()));
			Assert.assertTrue(false);
			e.printStackTrace();
		}
	}
	
	
	@Test(priority = 16)//,enabled=false)
	public void  Contract_Lost()  throws Exception {
		log = report.createTest("Contract_Lost");
		objClosed_lost = new Closed_lost(driver);
		try {
			objClosed_lost.Lost_Closed("Closed Lost");
			log.log(Status.PASS, "Closed Lost/Check Quote Rejected-Pass"+log.addScreenCaptureFromPath(captureScreen()));
		} catch (Exception e) {
			log.log(Status.FAIL, "Closed Lost/Check Quote Rejected-Fail"+log.addScreenCaptureFromPath(captureScreen()));
			Assert.assertTrue(false);
			e.printStackTrace();
		}
	}

	@Test(priority = 17)//,enabled=false)
	public void  Quote_Rejected()  throws Exception {
		log = report.createTest("Quote_Rejected");
		objQuote_Rejected = new Quote_Rejected(driver);
		try {
			objQuote_Rejected.Reject();
			log.log(Status.PASS, "Closed Lost/Check Quote Rejected-Pass"+log.addScreenCaptureFromPath(captureScreen()));
		} catch (Exception e) {
			log.log(Status.FAIL, "Closed Lost/Check Quote Rejected-Fail"+log.addScreenCaptureFromPath(captureScreen()));
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

