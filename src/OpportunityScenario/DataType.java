package OpportunityScenario;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Test.screenshot;



public class DataType {

	By Account =By.xpath("//div//input[contains(@name,'Name')]");
	By Fieldtype = By.xpath("(//input[@class='slds-input'])[3]");
		

	WebDriver driver;

	public DataType (WebDriver driver) {
		this.driver = driver;
	}
	public void GotoSrolldown() throws AWTException, Exception {
		Thread.sleep(3000);
		/*
		 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		 * robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 */
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,75)", "");
	}
	public void clickAccount() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement m=driver.findElement(Account);
		js.executeScript("arguments[0].click();", m);
	}
	public void DataField() throws Exception {
		Thread.sleep(2000);
		// Locate the input field element
		WebElement inputField = driver.findElement(Fieldtype);
		// Get the value of the "type" attribute
		String fieldType = inputField.getAttribute("type");
		// Print the field data type
		System.out.println("Field data type: " + fieldType);
	}
	public void Screen() {

		screenshot.captureScreenshot(driver, "11.Field Data Type");
	}
	public void toGetFieldtype() throws Exception {
		
		//Account 
		this.clickAccount();
        // GotoScrolldown
		//this.GotoSrolldown();
		//Datafield 
		this.DataField();
		//Annual Revenue
		
	}

	
}
