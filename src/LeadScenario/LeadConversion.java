package LeadScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LeadConversion{

	@SuppressWarnings("unused")
	private static String LeadStatusfield =null;

	WebDriver driver;

	JavascriptExecutor js = (JavascriptExecutor)driver;


	By Converted = By.xpath("//a[@data-tab-name='converted']");
	By ConvertedStatus = By.xpath("//button[contains(@class,'slds-button slds-button--brand')]//span[1]");
	By Converbutton = By.xpath("//span[@data-aura-class='runtime_sales_leadConvertModalFooter']//button[1]");
	By GotoLead = By.xpath("//button[text()='Go to Leads']");        

	public LeadConversion(WebDriver driver){
		this.driver = driver;
	}

	public void clickConverted() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement m=driver.findElement(Converted);
		js.executeScript("arguments[0].click();", m);
		//screenshot.captureScreenshot(driver, "4.Lead Conversion");	
	}
	public void clickConvertedStatus() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement m=driver.findElement(ConvertedStatus);
		js.executeScript("arguments[0].click();", m);
	}
	public void clickConverbutton() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement m=driver.findElement(Converbutton);
		js.executeScript("arguments[0].click();", m);
			
	}
	public void clickGotoLead() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement m=driver.findElement(GotoLead);
		js.executeScript("arguments[0].click();", m);
	}

	public void gotoConversion() throws Exception {


		//Click the converted
		this.clickConverted();		
		//Click the ConvertedStatus
		this.clickConvertedStatus();
		//Click the Conver button
		this.clickConverbutton();
		//Click the GotoLead
		this.clickGotoLead();
	}
}

