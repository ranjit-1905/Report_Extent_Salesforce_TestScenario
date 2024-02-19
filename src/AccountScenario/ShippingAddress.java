package AccountScenario;

import org.openqa.selenium.JavascriptExecutor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ShippingAddress {

	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	By Checkbox = By.xpath("//input[@part='checkbox']");
	By ShipingAddress = By.xpath("//lightning-input[@class='slds-form-element_stacked slds-form-element']//div[1]");
	By Save = By.xpath("//button[text()='Save']");
	

	public ShippingAddress(WebDriver driver) {
		this.driver = driver;
	}

	public void GotoSrolldown() throws AWTException, Exception {
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	}

	public void CheckboxClick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement m=driver.findElement(Checkbox);
		js.executeScript("arguments[0].click();", m);
	}

	// Check Same as Shipping Address Field
	public void strShipingAddress() throws Exception {
		Thread.sleep(1000);
		List<WebElement> objLinks = driver.findElements(ShipingAddress);
		for (WebElement label : objLinks) {
			String strShipingAddress = label.getText();
			System.out.println("ShipingAddress :" + strShipingAddress);

		}
	}

	@SuppressWarnings("unused")
	public void ShipAddressEnabled() throws InterruptedException {
		Thread.sleep(2000);
		// TODO Auto-generated method stub
		boolean Enabled = driver.findElement(ShipingAddress).isEnabled();

		boolean Displayed = driver.findElement(ShipingAddress).isDisplayed();

		if (Enabled)

			System.out.println("Shipping Address Field Checkbox");
		else {
			System.out.println("Shipping Address Field Checkbox UnAvailable");
			//screenshot.captureScreenshot(driver, "Shipping Address Field");

		}
	}
	// Account Click New Account
	public void Save() throws Exception {
		Thread.sleep(1000);
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Save));
		driver.findElement(Save).click();
	}	

	public void ShipAddressfield()  throws Exception {

		//Gotodown
		//this.GotoSrolldown();
		//
		this.CheckboxClick();
		//
		this.strShipingAddress();
		//Field Available
		this.ShipAddressEnabled();
		//Field Save
		this.Save();
		//Click button
		//this.clickButton();
		// Edit
		//this.clickEdit();
		//Account Name
		//this.AccountnameSF();




	}	
}





