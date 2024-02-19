package OpportunityScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Test.screenshot;

public class Closed_won {



	By MarkStatus =By.xpath("//span[.='Mark Status as Complete']"); 
	By opportunity = By.xpath("(//one-app-nav-bar-item-root[@role='listitem']//a)[2]");
	By ClickName = By.xpath("(//a[@data-special-link='true'])[1]");
	By MarkStage = By.xpath("//span[contains(text(),'Mark Stage as Complete')]"); 
	By Closeopportunity =By.xpath("//div//div//div//div//div//select[@class='stepAction required-field select']");
	By Save =By.xpath("//button[@title='Save']");
	By Contract = By.xpath("//span[text()='Contracts']");
	By ID=By.xpath("//th//span//a[@data-navigable='true']");
	By Activited =By.xpath("//span[text()='Activated']");
	By Markstatuscomplete =By.xpath("//div//button[.='Mark Status as Complete']");
	By Quotesapp=By.xpath("//a//span[text()='Quotes']");
	By QuotesName =By.xpath(" //*[@id='brandBand_1']/div/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div/div/table/tbody/tr/th/span/a");

	WebDriver driver;

	public Closed_won (WebDriver driver) {
		this.driver = driver;
	}

	public void MarkStatusClick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(MarkStatus);
		js.executeScript("arguments[0].click();", m);
	}

	//Click the Opportunity Tab
	public void opportunitytab() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(4000);
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
	public void MarkStageClick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(MarkStage);
		js.executeScript("arguments[0].click();", m);
	}
	public void CloseopportunityClick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Closeopportunity);
		js.executeScript("arguments[0].click();", m);
	}
	public void Closed_won (String strClosedwon2) throws InterruptedException {
		Thread.sleep(4000); 
		// TODO Auto-generated method stub
		driver.findElement(Closeopportunity).sendKeys(strClosedwon2);	  
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
		System.out.println("Contract has been created" );
	}
	public void ID_Click() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(ID);
		js.executeScript("arguments[0].click();", m);
	}
	public void Activited_Click() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Activited);
		js.executeScript("arguments[0].click();", m);
	}

	public void Markstatus_complete() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Markstatuscomplete);
		js.executeScript("arguments[0].click();", m);
	}
	public void QuotesappClick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Quotesapp);
		js.executeScript("arguments[0].click();", m);
		System.out.println("Quote has been created" );
	}
	public void QuotesNameClick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(QuotesName);
		js.executeScript("arguments[0].click();", m);
	}


	public void Closed_Won_task(String strClosedwon2) throws Exception {

		//Opportunity tab
		this.opportunitytab();
		//Account name
		this.AccountnameSF();
		//MArk Stage Click
		this.MarkStageClick();
		//
		this.MarkStageClick();
		// Close
		this.CloseopportunityClick();
		//
		this.Closed_won(strClosedwon2);
		// Save Button
		//this.Savebutton();
	}
}
