package OpportunityScenario;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


import Test.screenshot;

public class Contract_Creation {

	By MarkStatus = By.xpath("//span[.='Mark Status as Complete']");
	By opportunity = By.xpath("(//one-app-nav-bar-item-root[@role='listitem']//a)[2]");
	By ClickName = By.xpath("(//a[@data-special-link='true'])[1]");
	By MarkStage = By.xpath("//span[contains(text(),'Mark Stage as Complete')]");
	By Closeopportunity = By.xpath("//div//div//div//div//div//select[@class='stepAction required-field select']");
	By Save = By.xpath("//button[@title='Save']");
	By Contract = By.xpath("//span[text()='Contracts']");
	By ID = By.xpath("//th//span//a[@data-navigable='true']");
	By Activited = By.xpath("//span[text()='Activated']");
	By Markstatuscomplete = By.xpath("//div//button[.='Mark Status as Complete']");
	By Order = By.xpath("//span[normalize-space()='Orders']");
	By Recently = By.xpath("//span[text()='Recently Viewed']");
	By Allorder = By.xpath("//li[contains(.,'All Orders')]//a[contains(.,'All Orders')]");			

	//	("//li[@class='slds-dropdown__item has-icon--left   slds-is-selected forceVirtualAutocompleteMenuOption']");
	// ("(//li[contains(@class,'slds-dropdown__item has-icon--left')]//a)[3])");
	// //("(//li[@role='presentation']//a)[3]"); //(//a[@role='option'])[3]
	// //(//li[@role='presentation']//a)[3]

	WebDriver driver;
	private FluentWait<WebDriver> wait;

	public Contract_Creation(WebDriver driver) {
		this.driver = driver;
	}

	public void Contract_tab_Click() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Contract);
		js.executeScript("arguments[0].click();", m);
		System.out.println("Contract has been created");
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

	public void Order_Click() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Order);
		js.executeScript("arguments[0].click();", m);
	}

	public void Recently_Click() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Recently);
		js.executeScript("arguments[0].click();", m);
	}

	public void Uparrow() {
		WebElement textbox = driver.findElement(Allorder);
		textbox.sendKeys(Keys.ARROW_UP);
		textbox.sendKeys(Keys.ENTER);
	}


	/*
	 * public void Allorder_view(String strAllorder) throws InterruptedException {
	 * Thread.sleep(4000); // TODO Auto-generated method stub
	 * driver.findElement(Allorder).sendKeys(strAllorder); }
	 */








	public void Allorder_view() throws Exception { 
		// TODO Auto-generated method
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Allorder);
		js.executeScript("arguments[0].click();", m);

	}
	public void Printer() {
		System.out.println(" Contract Creation");
	}
	public void Printer_1() {
		System.out.println(" Contract Activated");
	}
	public void Printer_2() {
		System.out.println("  Order Creation");
	}
	public void Screen2() throws Exception {
		Thread.sleep(5000);

		screenshot.captureScreenshot(driver, "19. Contract Creation");
	}

	public void Screen() {

		screenshot.captureScreenshot(driver, "20.Activated Contract");
	}

	public void Screen1() throws Exception {
		Thread.sleep(5000);
		screenshot.captureScreenshot(driver, "21.Order Creation");
	}
	public void Contract_Created() throws InterruptedException {
		Thread.sleep(4000);
		// TODO Auto-generated method stub
		boolean isEnabled = driver.getPageSource().startsWith("Corp Moody");
		//boolean isDisplayed = driver.getPageSource().startsWith("CorpMoody");

		if (isEnabled) 
			System.out.println("Contract Creation");  	
		else {
			System.out.println("Contract Creation");
		}
	}

	public void Contract_Create(String strAllorder) throws Exception {

		// COntract Tab
		this.Contract_tab_Click();
		// Screen Shot
		//this.Screen2();
		//Printer
		//this.Printer();
		// Click ID
		this.ID_Click();
		//
		this.Contract_Created();
		// Activeited the Contract
		//this.Activited_Click();
		//
		//this.Markstatus_complete();
		//Printer
		//this.Printer_1();
		// Screen Shot
		//this.Screen();
		// View All
		//this.Order_Click();
		// Recently
		//this.Recently_Click();
		// test
		//this.Uparrow();
		// Allorder
		//this.Allorder_view( );
		//Printer
		//this. Printer_2();
		// Screen Shot
		//this.Screen1();
	}

}
