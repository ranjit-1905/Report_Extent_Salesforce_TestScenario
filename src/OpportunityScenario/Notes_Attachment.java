package OpportunityScenario;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Test.screenshot;

public class Notes_Attachment {

	By Clickbutton=By.xpath("//a[@title='Show 6 more actions']");
	By StartSync =By.xpath("//a[@title='Start Sync']");
	By Continue  =By.xpath("//span[normalize-space()='Continue']");
	By CreatePdf =By.xpath("//a[@title='Create PDF']");
	By SavePDF =By.xpath("//span[normalize-space()='Save to Quote']");
	By MarkStatus =By.xpath("//span[.='Mark Status as Complete']"); 

	WebDriver driver;

	public Notes_Attachment (WebDriver driver) {
		this.driver = driver;
	}



	public void Clickbutton1() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Clickbutton);
		js.executeScript("arguments[0].click();", m);
	}
	public void   StartSyncClick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(StartSync);
		js.executeScript("arguments[0].click();", m);
	}
	public void  CreatePdfClick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(CreatePdf);
		js.executeScript("arguments[0].click();", m);
	}

	public void  ContinueClick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Continue );
		js.executeScript("arguments[0].click();", m);
	}
	public void SavePDFClick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(  SavePDF );
		js.executeScript("arguments[0].click();", m);
		//System.out.println("Quotation PDF created " );
	}
	public void GotoSrolldown() throws AWTException, Exception {
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}

	public void GotoSrollUp() throws AWTException, Exception {
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
	}

	public void MarkStatusClick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(MarkStatus);
		js.executeScript("arguments[0].click();", m);
	}
	public void Printer() throws InterruptedException {
		Thread.sleep(2000);
	  System.out.println("Notes & Attachment section");
	}
	public void Screen() throws InterruptedException {
		Thread.sleep(2000);
		screenshot.captureScreenshot(driver, "16.Check Product availability & generate Quote PDF");
	}
	public void Screen1() throws InterruptedException {
		Thread.sleep(2000);
		screenshot.captureScreenshot(driver, "17.Quote PDF in Opportunity - Notes & Attachment section");
	}

	public void Screen2() throws InterruptedException {
		Thread.sleep(2000);
		screenshot.captureScreenshot(driver, "18.Check Quote Accepted");
	}
	public void Notes_Attachment_section()throws Exception {
		// TODO Auto-generated method stub

		//
		//this.Clickbutton1();
		//
		//this.StartSyncClick();
		//
		//this.ContinueClick();
		//
		//this.Clickbutton1();
		//
		//this.CreatePdfClick();
		//
		this. SavePDFClick();
		//
		//this.Screen();
		//
		this.GotoSrolldown();
		//Screen Shot
		this.Printer();
		//Go to scroll Up
		this.GotoSrollUp();
		//Need Review
		//this.MarkStatusClick();
		//IN Review
		//this.MarkStatusClick();
		//Approved
		//this.MarkStatusClick();
		//Rejected
		//this.MarkStatusClick();
		//Presented
		//this.MarkStatusClick();
		//Printer
		//this.Printer();
		//Screen Shot
		//this.Screen2();

	}
}