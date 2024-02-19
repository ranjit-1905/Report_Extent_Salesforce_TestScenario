package LeadScenario;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Account_Creation {


	By Account = By.xpath("//span[text()='Accounts']");
	By Opportunities = By.xpath("//span[text()='Opportunities']");
	
	 WebDriver driver;


	public Account_Creation(WebDriver driver) {
		this.driver = driver;
	}


	// Click the Account Tab
	public void Accounttabclick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement m=driver.findElement(Account);
		js.executeScript("arguments[0].click();", m);
	}
	@SuppressWarnings("unused")
	public void AccountCreated() throws InterruptedException {
		Thread.sleep(5000);
		// TODO Auto-generated method stub
		boolean isEnabled = driver.getPageSource().startsWith("Corp");
		//boolean isDisplayed = driver.getPageSource().startsWith("CorpMoody");

		if (isEnabled) 
			System.out.println("Account Not Created");  	
		else {
			System.out.println("Account Created");
			//screenshot.captureScreenshot(driver, "5.AccountCreated");		
					}
	}

	/*
	 * // Click the Opportunities Tab public void Opportunitiestabclick() throws
	 * Exception { // TODO Auto-generated method stub Thread.sleep(5000);
	 * JavascriptExecutor js = (JavascriptExecutor)driver; WebElement
	 * m=driver.findElement(Opportunities);
	 * js.executeScript("arguments[0].click();", m); }
	 * 
	 * @SuppressWarnings("unused") public void OpportunitiesCreated() throws
	 * InterruptedException { Thread.sleep(5000); // TODO Auto-generated method stub
	 * boolean isEnabled = driver.getPageSource().startsWith("Corp"); //boolean
	 * isDisplayed = driver.getPageSource().startsWith("CorpMoody");
	 * 
	 * if (isEnabled) System.out.println("Opportunities Not Created"); else {
	 * System.out.println("Opportunities Created");
	 * screenshot.captureScreenshot(driver, "5.OpportunitiesCreated"); }
	 * 
	 * }
	 */
	public void Accounttabclick_Validate() throws Exception {
		//Click Account
		this.Accounttabclick();
		//Account Created
		this.AccountCreated();
		//Click Opportunities
		//this. Opportunitiestabclick();
		// Opportunities Created
		//this.OpportunitiesCreated();

	}


	}