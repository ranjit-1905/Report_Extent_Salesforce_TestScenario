package AccountScenario;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;



public class AddressCheck {

	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	By Button = By.xpath("//*[@id=\"brandBand_1\"]/div/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div/div/table/tbody/tr[1]/td[6]/span/div/a/span/span[1]");
	By Edit =By.xpath("/html[1]/body[1]/div[12]/div[1]/ul[1]/li[1]/a[1]");    //("//li//a[@title='Edit']");
	By AccountName = By.xpath("(//div[@part='input-container'])[2]");
	By Label = By.xpath("(//label[@class='slds-form-element__label slds-no-flex'])");
	By BillingAddresstext = By.xpath("(//textarea[@class='slds-textarea'])[1]");
	By ShippingAddressText = By.xpath("(//textarea[@class='slds-textarea'])[2]");
	//By AccountName = By.xpath("//div//input[contains(@name,'Name')]");	

	public AddressCheck(WebDriver driver) {
		this.driver = driver;
	}



	// Billing Address
	public void BillingAddress() throws Exception {
		Thread.sleep(2000);
		// TODO Auto-generated method stub		
		String	BAddress = driver.findElement(BillingAddresstext).getText();
		System.out.println(BAddress);
	}

	// Shipping Address
	public void ShippingAddress() throws InterruptedException {
		Thread.sleep(2000);
		// TODO Auto-generated method stub
		String ShipAddress =driver.findElement(ShippingAddressText).getText();
		System.out.println(ShipAddress);
	}

	public void BillingShippingAddressEqual() {
		// Retrieve the values of the billing and shipping address fields
		WebElement billingAddress = driver.findElement(BillingAddresstext);
		WebElement shippingAddress = driver.findElement(ShippingAddressText);

		// Retrieve the values of the billing and shipping address fields
		String billingAddressValue = billingAddress.getAttribute("value");
		String shippingAddressValue = shippingAddress.getAttribute("value");

		// Compare the values of the billing and shipping address fields
		if (billingAddressValue.equals(shippingAddressValue)) {
			// The billing and shipping addresses are the same
			System.out.println("Billing and shipping addresses are the same.");
		} else
			// The billing and shipping addresses are different
			System.out.println("Billing and shipping addresses are different.");

		//screenshot.captureScreenshot(driver, "Billing");
	}

	public void GotoSrolldown() throws Exception { 
		Thread.sleep(3000); Robot
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

	}

	// Account Name
	public void Accountname() throws InterruptedException {
		Thread.sleep(2000);
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(AccountName));
		driver.findElement(AccountName).click();
	}

	// Account Click New Account
	public void clickButton() throws Exception {
		Thread.sleep(1000);
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Button));
		driver.findElement(Button).click();
	}

	// Account Click Edit 
	public void clickEdit() throws Exception {
		Thread.sleep(3000);
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Edit));
		driver.findElement(Edit).click();
	}	

	// Account Name
	public void AccountnameSF() throws InterruptedException {
		Thread.sleep(2000);
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(AccountName));
		driver.findElement(AccountName).click();
	}
	// New Account Label List
	public void strLinkText() throws Exception {
		Thread.sleep(3000);
		List<WebElement> objLinks = driver.findElements(Label);
		for (WebElement label : objLinks) {
			String strLinkText = label.getText();
			System.out.println("New Account :" + strLinkText);
		}
	}

	public void AddressFields()  	throws Exception {

		//Click button
		this.clickButton();
		// Edit
		this.clickEdit();
		//Account Name
		this.Accountname();
		//Account Name
		//this.AccountnameSF();
		// go to Down to Address Field
		this.GotoSrolldown();
		//Billing address
		this.BillingAddress();
		//Shipping Address
		this.ShippingAddress();
		//Check the Address
		this.BillingShippingAddressEqual();		

	}
}