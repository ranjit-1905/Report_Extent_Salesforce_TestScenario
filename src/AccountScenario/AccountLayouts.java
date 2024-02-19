package AccountScenario;

import org.openqa.selenium.JavascriptExecutor;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Test.screenshot;


public class AccountLayouts {

	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
		 

	By Account = By.xpath("//span[text()='Accounts']");
	By Button = By.xpath("//*[@id=\"brandBand_1\"]/div/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div/div/table/tbody/tr[1]/td[6]/span/div/a/span/span[1]");
	By Edit =By.xpath("/html/body/div[11]/div/ul/li[1]/a");    //("//li//a[@title='Edit']");
	By AccountName = By.xpath("(//div[@part='input-container'])[2]");
	By Label = By.xpath("(//label[@class='slds-form-element__label slds-no-flex'])");
	
	public AccountLayouts(WebDriver driver) {
		this.driver = driver;
	}

	// Click the Account Tab
	public void Accounttabclick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Account);
		js.executeScript("arguments[0].click();", m);
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

	@SuppressWarnings("unused")
	public void Enabled() throws InterruptedException {
		Thread.sleep(5000);
		// TODO Auto-generated method stub
		boolean isEnabled = driver.findElement(Label).isEnabled();

		boolean isDisplayed = driver.findElement(Label).isDisplayed();

		if (isEnabled)

			System.out.println(" Field availables in Account Layouts");
		else {
			System.out.println("Field Not availables in Account Layouts");
			screenshot.captureScreenshot(driver, "Field availables in Account Layouts");
		}
	}
	public void GotoSrolldown() throws Exception {
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
	
	
	
		public void gotoAccount()  	throws Exception {
		// Fill Account tabs
		this.Accounttabclick();
		// Get Field
		this.clickButton();
		// Edit
		this.clickEdit();
		//Account Name
		this.AccountnameSF();
		// Go to Down
		this.GotoSrolldown ();
		// Account Field 
		this.strLinkText();
		// Field Available
		this.Enabled();
		//Dependency 
		
	}
		
	}