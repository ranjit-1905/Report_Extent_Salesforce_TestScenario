package OpportunityScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Test.screenshot;

public class Closed_lost{

	By opportunity = By.xpath("(//one-app-nav-bar-item-root[@role='listitem']//a)[2]");
	By ClickName = By.xpath("(//a[@data-special-link='true'])[1]");
	By ChangeClosedStage = By.xpath("//span[contains(text(),'Change Closed Stage')]");
	By Closeopportunity =By.xpath("//div//div//div//div//div//select[@class='stepAction required-field select']");
	By Save =By.xpath("//button[@title='Save']");
	By Quotesapp=By.xpath("//a//span[text()='Quotes']");
	By QuotesName =By.xpath(" //*[@id='brandBand_1']/div/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div/div/table/tbody/tr/th/span/a");
	By Contract = By.xpath("//span[text()='Contracts']");

	WebDriver driver;
	public Closed_lost(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;

	}

	//Click the Opportunity Tab
	public void opportunitytab() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(opportunity);
		js.executeScript("arguments[0].click();", m);
	}
	// Account Name
	public void AccountnameSF() throws InterruptedException {
		Thread.sleep(2000);
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickName));
		driver.findElement(ClickName).click();
	}
	public void ClosedStage() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(ChangeClosedStage);
		js.executeScript("arguments[0].click();", m);
	}
	public void CloseopportunityClick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Closeopportunity);
		js.executeScript("arguments[0].click();", m);
	}
	public void Closed_Lose(String strClosedLose2) throws InterruptedException {
		Thread.sleep(4000); 
		// TODO Auto-generated method stub
		driver.findElement(Closeopportunity).sendKeys(strClosedLose2);	  
	}

	public void Savebutton() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Save);
		js.executeScript("arguments[0].click();", m);
	}

	public void Contract_tab_Click() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Contract);
		js.executeScript("arguments[0].click();", m);
		System.out.println("Contract has been Rejected" );
	}
	public void QuotesappClick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Quotesapp);
		js.executeScript("arguments[0].click();", m);
		//System.out.println("Quote has been created" );
	}
	public void QuotesNameClick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(QuotesName);
		js.executeScript("arguments[0].click();", m);
	}
	public void Printer() {
		System.out.println("Opportuninty Closed Lost");
	}
	public void Printer1() {
		System.out.println("Quote Rejected");
	}
	public void Screen() {

		screenshot.captureScreenshot(driver, "22.Closed Lost");
	}
	public void Screen1() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);

		screenshot.captureScreenshot(driver, "23.Check Quote Rejected");
	}
	public void Lost_Closed(String strClosedLose2) throws Exception {


		//Opportunity tab
		this.opportunitytab();
		//Account name
		this.AccountnameSF();
		//MArk Stage Click
		this.ClosedStage();
		// Close
		this.CloseopportunityClick();
		//
		this.Closed_Lose(strClosedLose2);
		//printer
		this.Printer();
		//Screen Shot
		//this.Screen();
		//
		//this.Savebutton();
		//
		//this.QuotesappClick();
		//
		//this.QuotesNameClick();
		//Printer
		//this.Printer1();
		//Screen Shot
		//this.Screen1();
	}
}