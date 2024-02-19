package LeadScenario;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Test.screenshot;

public class ValidationRule {

	WebDriver driver;

	JavascriptExecutor js = (JavascriptExecutor)driver;

	By Annual = By.xpath ("//div[text()='Annual Revenue field should be filled']");
	By Save =By.xpath("//button[text()='Save']");
	By Hitsnag =By.xpath("//a[normalize-space()='Annual Revenue']");


	public ValidationRule(WebDriver driver){
		this.driver = driver;
	}


	public void annualRevenueField() throws InterruptedException {
		Thread.sleep(2000);
		// TODO Auto-generated method stub
		String AnnualRevenue= driver.findElement(Annual).getText();
		System.out.println("Notification : "+ AnnualRevenue);
		//screenshot.captureScreenshot(driver, "2.Annual Revenue field should be filled");	
	}
	public void clickSave() throws InterruptedException  {
		Thread.sleep(4000);
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Save));
		driver.findElement(Save).click();
	}	

	public void Hitsnagclick() throws InterruptedException  {
		Thread.sleep(4000);
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Hitsnag));
		driver.findElement(Hitsnag).click();
	}	

	public void GotoSrolldown() throws AWTException, Exception {
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);


	}
	public void Validate() throws Exception {

		//Scroll Down
		this.GotoSrolldown();
		//Click Login button
		this.clickSave(); 
		//HitSnag
		this.Hitsnagclick();
		//Validate the field
		//this.annualRevenueField();

	}

}