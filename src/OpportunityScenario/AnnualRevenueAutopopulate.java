package OpportunityScenario;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import Test.screenshot;


public class AnnualRevenueAutopopulate {


	By Cancel = By.xpath("//button[text()='Cancel']");

	WebDriver driver;

	public AnnualRevenueAutopopulate (WebDriver driver) {
		this.driver = driver;
	}


	@SuppressWarnings("unused")
	public void AnnualRevenuefield() throws InterruptedException {
		Thread.sleep(2000);
		// TODO Auto-generated method stub
		boolean isEnabled = driver.getPageSource().startsWith("Annual");

		boolean isDisplayed = driver.getPageSource().startsWith("Annual");


		if (isEnabled)
			System.out.println("Annual Revenue field not autopopulate from Account");

		else { System.out.println("Annual Revenue field autopopulate from Account");
		}

	}

	// Click the Cancel 
	public void clickCancel() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement m=driver.findElement(Cancel);
		js.executeScript("arguments[0].click();", m);
	}

	public void GotoSrolldown() throws  Exception {
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

	}
	//Robot robot = new Robot();
	//robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	@SuppressWarnings("unused")
	public void OpportunitiesCheckContact() throws InterruptedException {
		Thread.sleep(5000);
		// TODO Auto-generated method stub
		boolean isEnabled = driver.getPageSource().startsWith("Allen");
		//boolean isDisplayed = driver.getPageSource().startsWith("CorpMoody");

		if (isEnabled) 
			System.out.println("Contact detials  is Not available");  	
		else {
			System.out.println("Contact detials  is available");
		}
	}
	public void Screen() {

		screenshot.captureScreenshot(driver, "12.Annual Revenue field should be autopopulate from Account");
	}

	public void AnnualRevenue_Autopopulate() throws Exception {
		//Screen Shot
		//this.Screen();
		//Annual Revenue
		this.AnnualRevenuefield();
		//Go to srolldown
		//this.GotoSrolldown();
		//Screen Shot
		//this.Screen();
		//Cancel button
		this.clickCancel();		
		// Click Accoutn Name


	}


}

