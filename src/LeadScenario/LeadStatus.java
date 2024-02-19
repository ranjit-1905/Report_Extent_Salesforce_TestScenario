package LeadScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;

import Test.screenshot;

public class LeadStatus{

	@SuppressWarnings("unused")
	private static String LeadStatusfield =null;

	WebDriver driver;

	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	By Address = By.xpath("//textarea[@name='street']");
	By city = By.xpath("//input[@name='city']");
	By Postalcode =By.xpath("//input[@name='postalCode']");
	By State =By.xpath("//input[@name='province']");
	By Country = By.xpath("//input[@name='country']");
	By Save =By.xpath("//button[text()='Save']");
	By LeadStatus = By.xpath("//span[@class='title slds-path__title'][normalize-space()='Qualified Lead']");      //("//li//a//span[text()='Working - Contacted']");
	By Converted = By.xpath("//a[@data-tab-name='converted']");
	By ConvertedStatus = By.xpath("//button[contains(@class,'slds-button slds-button--brand')]//span[1]");
	By Converbutton = By.xpath("//span[@data-aura-class='runtime_sales_leadConvertModalFooter']//button[1]");
	By GotoLead = By.xpath("//button[text()='Go to Leads']");        

	public LeadStatus(WebDriver driver){
		this.driver = driver;
	}
	public void LeadStatusfield () throws Exception  {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		String LeadStatusfield = driver.findElement(LeadStatus).getText();
		System.out.println(" Lead Status : " +LeadStatusfield);
		//screenshot.captureScreenshot(driver, "3.Lead Field");	
	}
	public void clickConverted() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement m=driver.findElement(Converted);
		js.executeScript("arguments[0].click();", m);
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

	public void LeadStatusreport() throws Exception {

		//Lead Status
		this.LeadStatusfield();
		/*//Click the converted
		this.clickConverted();		
		//Click the ConvertedStatus
		this.clickConvertedStatus();
		//Click the Conver button
		this.clickConverbutton();
		//Click the GotoLead
		this.clickGotoLead();*/
	}
}

