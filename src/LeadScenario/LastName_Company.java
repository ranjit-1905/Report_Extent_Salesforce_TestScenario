package LeadScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LastName_Company {

	By Lead = By.xpath("//span[text()='Leads']"); 
	By New = By.xpath("//a[@title='New']");
	By Save =By.xpath("//button[text()='Save']");




	WebDriver driver;

	JavascriptExecutor js = (JavascriptExecutor)driver;

	public LastName_Company(WebDriver driver){
		this.driver = driver;
	}
	public void clickSave() throws InterruptedException  {
		Thread.sleep(4000);
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Save));
		driver.findElement(Save).click();
	}	

	public void Leadtabclick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement m=driver.findElement(Lead);
		js.executeScript("arguments[0].click();", m);

	}
	public void clickNew()  {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(New));
		driver.findElement(New).click();
	}

	public void LastName_company_check() throws Exception {
		//Fill user name
		this.Leadtabclick();
		//Fill password
		this.clickNew();
		// Save Button
		this.clickSave();
		//Screen Shot
	}
	}

// return Lead 