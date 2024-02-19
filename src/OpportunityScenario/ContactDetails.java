package OpportunityScenario;


import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Test.screenshot;



public class ContactDetails {

	By opportunity = By.xpath("//a[contains(@title,'Opportunities')]");    
	By Click = By.xpath ("(//a[@data-special-link='true'])[1]");  
	By MarkStage = By.xpath("//span[contains(text(),'Mark Stage as Complete')]");//("//a[@title='Corp Moody-']"); /* ((//one-app-nav-bar-item-root[@role='listitem']//a)[2]")*/
	By ContactView = By.xpath("//span[@title='Contact Roles']");

	WebDriver driver;


	public ContactDetails(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	// Click the Opportunity Tab
	public void opportunitytab() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(7000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(opportunity);
		js.executeScript("arguments[0].click();", m);
	}

	// Click the Account Name
	public void clickName() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement m=driver.findElement(Click);
		js.executeScript("arguments[0].click();", m);
	}
	public void GotoSrolldown() throws AWTException, Exception {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,75)", "");

	}
	public void ContactViewClick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(ContactView);
		js.executeScript("arguments[0].click();", m);
	}

	@SuppressWarnings("unused")
	public void OpportunitiesCheckContact() throws InterruptedException {
		Thread.sleep(5000);
		// TODO Auto-generated method stub
		boolean isEnabled = driver.getPageSource().startsWith("Allen");
		//boolean isDisplayed = driver.getPageSource().startsWith("CorpMoody");

		if (isEnabled) 
			System.out.println("autopopulate Not from Contact");  	
		else {
			System.out.println("autopopulate from Contact");
		}
	}

	public void MarkStageClick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(MarkStage);
		js.executeScript("arguments[0].click();", m);
	}
	public void Screen() {

		screenshot.captureScreenshot(driver, "13.autopopulate from Contact");
	}

	public void Contact_Details() throws Exception {

		//Click Account tab
		this.opportunitytab();
		// Fill New button
		//this.GotoSrolldown();
		// Click Accoutn Name
		this.clickName();
		// MarkStage
		this.MarkStageClick();
		//Scroll Down
		this.GotoSrolldown();
		//Contact View 
		this.ContactViewClick();
		// Contact Detials
		this.OpportunitiesCheckContact();
		//Screen
		//this.Screen();
		// Click opportunitytab
		//this.opportunitytab();
		//Click Name
		//this.clickName();
		//MarkStage
		//this.MarkStageClick();
		//MarkStage
		//this.MarkStageClick();
		//Markstage
		//this.MarkStageClick();
		//Markstage
		//this.MarkStageClick();

	}

}

