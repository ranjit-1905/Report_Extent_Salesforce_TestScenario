package LeadScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Test.screenshot;

public class Opportunities_Creation {

	
	By Opportunities = By.xpath("//span[text()='Opportunities']");
	
	
	WebDriver driver;


	public Opportunities_Creation(WebDriver driver) {
		this.driver = driver;
	}
	// Click the Opportunities Tab
		public void Opportunitiestabclick() throws Exception {
			// TODO Auto-generated method stub
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement m=driver.findElement(Opportunities);
			js.executeScript("arguments[0].click();", m);
		}
		@SuppressWarnings("unused")
		public void OpportunitiesCreated() throws InterruptedException {
			Thread.sleep(5000);
			// TODO Auto-generated method stub
			boolean isEnabled = driver.getPageSource().startsWith("Corp");
			//boolean isDisplayed = driver.getPageSource().startsWith("CorpMoody");

			if (isEnabled) 
				System.out.println("Opportunities Not Created");  	
			else {
				System.out.println("Opportunities Created");
				//screenshot.captureScreenshot(driver, "5.OpportunitiesCreated");	
			}
		
		}
	
		public void Opportunitiestabclick_Validate() throws Exception {
		
		//Click Opportunities
				this. Opportunitiestabclick();
				// Opportunities Created
				this.OpportunitiesCreated();

			}
}
