package Login;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;





public class Navigation {
	WebDriver driver;

	By waffleSF = By.xpath("//button//div[@class='slds-icon-waffle']");

	By viewallSF = By.xpath("//button[contains(text(),'View All')]");

	By viewSales = By.xpath("//span//p[text()='Sales']");
	
	By test = By.cssSelector("button.block-button");
	
	public Navigation(WebDriver driver){

		this.driver = driver;
	}

	public void allownotification () throws AWTException, Exception {
		Thread.sleep(7000);
				
		  Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_TAB);
		  robot.keyRelease(KeyEvent.VK_TAB); robot.keyPress(KeyEvent.VK_TAB);
		  robot.keyRelease(KeyEvent.VK_TAB); robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
		 
	 }
	public void clickwaffleSF() {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(waffleSF));
		driver.findElement(waffleSF).click();
		
	}
	public void clickviewAll()  {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(viewallSF));	
		driver.findElement(viewallSF).click();
	}
	public void clickSales() {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(viewSales));
		driver.findElement(viewSales).click();
	}

	public void gotoNavigation() throws Exception {
		//Fill user name
		this.allownotification();
		// Waffle SF
		this.clickwaffleSF();
		//Fill password
		this.clickviewAll();
		//Click Login button
		this.clickSales(); 
		
	}
}

