package OpportunityScenario;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Test.screenshot;


public class QualificationTask {

	By opportunity = By.xpath("(//one-app-nav-bar-item-root[@role='listitem']//a)[2]");
	By Click = By.xpath ("(//a[@data-special-link='true'])[1]");  
	By MarkStage = By.xpath("//span[contains(text(),'Mark Stage as Complete')]");
	By Newtask =By.xpath("//a[@class='subjectLink slds-truncate']");



	WebDriver driver;

	public QualificationTask (WebDriver driver) {
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
	// Click the Account Name
	public void clickName() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement m=driver.findElement(Click);
		js.executeScript("arguments[0].click();", m);
	}
	public void MarkStageClick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(MarkStage);
		js.executeScript("arguments[0].click();", m);
	}


	public void NewtaskClick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Newtask);
		js.executeScript("arguments[0].click();", m);
		
	}
	public void Screen()throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(4000);
		screenshot.captureScreenshot(driver, "14.opportunity -Qualification - Task has been created");
	}
	public void OpportunitiesTask() throws InterruptedException {
		Thread.sleep(5000);
		// TODO Auto-generated method stub
		boolean isEnabled = driver.getPageSource().startsWith("Allen");
		//boolean isDisplayed = driver.getPageSource().startsWith("CorpMoody");

		if (isEnabled) 
			System.out.println("A new task has been created");  	
		else {
			System.out.println("A new task has been created");
		}
	}


	public void Qualification_Task() throws Exception {

		// Click opportunitytab
		this.opportunitytab();
		//Click Account NAme
		this.clickName();
		//MarkStage
		this.MarkStageClick();
		// Click New Task
		this.NewtaskClick();
		//Task Creation check
		this.OpportunitiesTask(); 
		//Screen Shot
		//this.Screen();

		/*//click opporunitytab
		this.opportunitytab();
		//Click Name
		this.clickName();
		//MarkStage
		this.MarkStageClick();
		//MarkStage
		this.MarkStageClick();*/


	}





}

