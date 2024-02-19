		
package AccountScenario;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class dependency {

	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor)driver;

     By Type = By.xpath("//button[@aria-label='Type, --None--']");
     By customerpriority=By.xpath("//lightning-base-combobox-item[@data-value='Customer - Direct']");
     By Typetext=By.xpath("//button[@data-value='Customer - Direct']//span");
     By Customer=By.xpath("//button[@aria-label='Customer Priority, --None--']//span");
     By CustomerPriority=By.xpath("//lightning-base-combobox-item[.='Medium']");
     By CustomerPriorityclick=By.xpath("//button[@data-value='Medium']//span");   //("//button[@data-value='Medium']/@data-value"); 
     By Save = By.xpath("//button[@name='SaveEdit']");

     public dependency(WebDriver driver) {
 		this.driver = driver;
 	}

public void GotoSrolldown() throws Exception { 
	Thread.sleep(3000); Robot
	robot = new Robot();
	robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
}
public void typeofcustomer() throws InterruptedException	{
	Thread.sleep(2000);
	//WebDriverWait wait = new WebDriverWait(driver,20);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(Type));
	driver.findElement(Type).click();
}	
public void customertypeClick() throws InterruptedException {
Thread.sleep(2000);
		driver.findElement(customerpriority).click();
		}

public void customertypetext() throws InterruptedException	{
	Thread.sleep(2000);
		List<WebElement> l = driver.findElements(Typetext);
	for (WebElement Selectfordependency : l) {
		String strSelect1 = Selectfordependency.getText();
		System.out.println("Type :" + strSelect1);
	}
}
public void CustomerPriorityclick() throws InterruptedException	{
	Thread.sleep(2000);
	driver.findElement(Customer).click();
	
}	
public void CustomerPriority() throws InterruptedException	{
	Thread.sleep(2000);
	driver.findElement(CustomerPriority).click();
	}
	
public void Gettext() throws InterruptedException	{
	Thread.sleep(2000);
		List<WebElement> l = driver.findElements(CustomerPriorityclick);
	for (WebElement Selectfordependency : l) {
		String strSelect1 = Selectfordependency.getText();
		System.out.println("CustomerPriority :" + strSelect1);
	}
	
}	
public void SaveClick()	{
	WebDriverWait wait = new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(Save));
	driver.findElement(Save).click();
}	

public void dependency_picklist(String strSelectfordependency,String strCustomerPriority ) throws Exception {

	// Scroll Down
	this.GotoSrolldown();
	//type
	this.typeofcustomer();
	//type
	this.customertypeClick();
	//Customer text
	this.customertypetext();
	//Customer
	this.CustomerPriorityclick();
	//
	this.CustomerPriority();
	//get text
	this.Gettext();
	//cancel
	this.SaveClick();
	
}
}