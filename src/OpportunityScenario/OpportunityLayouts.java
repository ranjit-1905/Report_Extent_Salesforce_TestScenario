package OpportunityScenario;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Test.screenshot;


public class OpportunityLayouts {

	By opportunity = By.xpath("//a[contains(@title,'Opportunities')]");                                                                       //("(//one-app-nav-bar-item-root[@role='listitem']//a)[2]");
	By Button = By.xpath("(//a[contains(@class,'rowActionsPlaceHolder slds-button')]//span)[1]");
	By Edit =By.xpath("/html/body/div[11]/div/ul/li[1]/a");    //("//li//a[@title='Edit']");
	By Account = By.xpath("(//input[@name='Name'])");
	//By New = By.xpath("//div[@title='New']");
	By Label = By.xpath("(//label[@part='label'])");
	By Picklist = By.xpath("(//lightning-combobox[@class='slds-form-element_stacked slds-form-element']//label)");

	WebDriver driver;

	public OpportunityLayouts (WebDriver driver) {
		this.driver = driver;
	}

	// Click the Opportunity Tab
	public void opportunitytab() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(opportunity);
		js.executeScript("arguments[0].click();", m);
	}
	// Account Click New Account
	public void clickButton() throws Exception {
		Thread.sleep(5000);
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Button));
		driver.findElement(Button).click();
	}

	// Account Click Edit 
	public void clickEdit() throws Exception {
		Thread.sleep(2000);
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Edit));
		driver.findElement(Edit).click();
	}	
	// Account Name
	public void AccountnameSF() throws InterruptedException {
		Thread.sleep(2000);
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Account));
		driver.findElement(Account).click();
	}

	/*
	 * // Account Click New Account public void clickNew() throws Exception {
	 * Thread.sleep(5000); // TODO Auto-generated method stub WebDriverWait wait =
	 * new WebDriverWait(driver, 20);
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(New));
	 * driver.findElement(New).click(); }
	 */
	// New opportunity Label List
	public void strLinkText() throws Exception {
		Thread.sleep(1000);
		List<WebElement> objLinks = driver.findElements(Label);
		for (WebElement label : objLinks) {
			String strLinkText = label.getText();
			System.out.println("New Account :" + strLinkText);
		}
	}
	public void Screen() {

		screenshot.captureScreenshot(driver, "10.opportunity -Check Field availables in Opportunity Layouts");
	}

	public void strPicklist() throws Exception {
		Thread.sleep(1000);
		List<WebElement> objPicklist = driver.findElements(Picklist);
		for (WebElement Picklist : objPicklist) {
			String strPicklist = Picklist.getText();
			System.out.println("New Account :" + strPicklist);
		}
	}
	public void GotoSrolldown() throws Exception { 
		Thread.sleep(2000); Robot
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
	}
	public void gotoOpportunity () throws Exception {

		//Click Account tab
		this.opportunitytab();
		// Fill New button
		this.clickButton();
		//Edit the Pervious 
		this.clickEdit();
		//this.clickNew();
		// Get Field
		this.strLinkText();
		// Picklist Field
		this.strPicklist();
		//Screen Shot
		//this.Screen();
		//Datafield 
	}
}
//
