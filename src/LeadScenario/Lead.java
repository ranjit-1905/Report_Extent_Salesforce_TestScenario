package LeadScenario;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Test.screenshot;

import org.openqa.selenium.JavascriptExecutor;


import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Lead {


	private static String MCompanyfield = null;
	private static String MLastNamefield = null;

	WebDriver driver;

	JavascriptExecutor js = (JavascriptExecutor)driver;


	By Lead = By.xpath("//span[text()='Leads']"); 
	By New = By.xpath("//a[@title='New']");
	By Save =By.xpath("//button[text()='Save']");
	By Name =By.xpath("//a[normalize-space()='Name']");
	By Salutationclick = By.xpath("(//span[text()='--None--'])[1]");
	By Salutation = By.xpath("//lightning-base-combobox-item[@data-value='Mr.']");
	By FirstName = By.xpath("(//input[@class='slds-input'])[3]");
	By LastName = By.xpath("//input[@placeholder='Last Name']");
	By Company = By.xpath("(//label[text()='Company']/following::input)[1]");
	By Address = By.xpath("//textarea[@name='street']");
	By MLastname =By.xpath("//label[text()='Last Name']");
	By MCompany = By.xpath("//label[text()='Company']");


	//private Object keyEvent;

	public Lead(WebDriver driver){
		this.driver = driver;
	}
	public void clickSave() throws InterruptedException  {
		Thread.sleep(4000);
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Save));
		driver.findElement(Save).click();
	}	
	public void clickName() throws InterruptedException  {
		Thread.sleep(4000);
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Name));
		driver.findElement(Name).click();
	}	
	public void Leadtabclick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement m=driver.findElement(Lead);
		js.executeScript("arguments[0].click();", m);
	}
	public void clickNew()  {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(New));
		driver.findElement(New).click();
	}
	public void clickSalutation()  {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Salutationclick));
		driver.findElement(Salutationclick).click();
	}
	public void LeadSalutation() throws InterruptedException {
		Thread.sleep(2000);
		// TODO Auto-generated method stub
		driver.findElement(Salutation).click();
	}	
	public void LeadFirstName(String strFirstName) throws InterruptedException {
		Thread.sleep(2000);
		// TODO Auto-generated method stub
		driver.findElement(FirstName).sendKeys(strFirstName);
	}
	public void LeadLastName(String strLastName) throws InterruptedException {
		Thread.sleep(2000);
		// TODO Auto-generated method stub
		driver.findElement(LastName).sendKeys(strLastName);
	}
	public void LeadCompany(String strCompany) throws InterruptedException {
		Thread.sleep(2000);
		// TODO Auto-generated method stub
		driver.findElement(Company).sendKeys(strCompany);
					
	}
	
	public void Addressdetails(String strAddress) throws InterruptedException {
		Thread.sleep(2000);
		// TODO Auto-generated method stub
		driver.findElement(Address).sendKeys(strAddress);
	}

	public void MLastNamefield()  {
		MLastNamefield = driver.findElement(MLastname).getText();
	}
	public void MCompanyfield()  {
		MCompanyfield = driver.findElement(MCompany).getText();
		System.out.println("Lead - Check required fields in Lead - Last Name & Companys: " +MLastNamefield+ MCompanyfield);
	}

	public void GotoSrolldown() throws AWTException, Exception {
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);


	}
	public void screen() throws Exception {
		Thread.sleep(1000);
		screenshot.captureScreenshot(driver, "1.Last Name,Company");	
	}
	

	public void gotoLead(String strSalutation, String strFirstName, String strlastName, String strCompany ) throws Exception {
		//Fill user name
		//this.Leadtabclick();
		//Fill password
		//this.clickNew();
		// Save Button
		//this.clickSave();
		//Screen Shot
		//this.screen();
		// Name Click
		this.clickName();
		//Salutation
		this.clickSalutation();
		//Fill Salutation
		this.LeadSalutation();
		//Fill First name
		this.LeadFirstName(strFirstName);
		//Fill Last Name
		this.LeadLastName(strlastName);
		//Click Company Name
		this.LeadCompany(strCompany);
		//Fill Adddress
		//	this.Addressdetails(strAddress);
		//Scroll Down
		//this.GotoSrolldown();
		//Print the Tag
		this.MLastNamefield();
		//Print the Tag
		this.MCompanyfield();

	}
}

