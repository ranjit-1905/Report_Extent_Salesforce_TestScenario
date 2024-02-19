package LeadScenario;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Address_update {

	WebDriver driver;

	JavascriptExecutor js = (JavascriptExecutor)driver;

	By Annual = By.xpath ("//div//input[@name='AnnualRevenue']");    
	By Address = By.xpath("//textarea[@name='street']");
	By city = By.xpath("//input[@name='city']");
	By Postalcode =By.xpath("//input[@name='postalCode']");
	By State =By.xpath("//input[@name='province']");
	By Country = By.xpath("//input[@name='country']");
	By Save =By.xpath("//button[text()='Save']");


	public Address_update(WebDriver driver){
		this.driver = driver;
	}
	public void GotoSrolldown() throws AWTException, Exception {
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);

	}

	public void annualRevenueField(String annualRevenueString) throws InterruptedException {
		Thread.sleep(1000);
		// TODO Auto-generated method stub
		driver.findElement(Annual).sendKeys(annualRevenueString);
		System.out.println(" Annual revenue has been filled : "+annualRevenueString);
		//screenshot.captureScreenshot(driver, "2.Annual Revenue field");	
	}
	public void citydetails(String strcity) throws InterruptedException {
		Thread.sleep(2000);
		// TODO Auto-generated method stub
		driver.findElement(city).sendKeys(strcity);
	}
	public void Postalcodedetails(String strPostalcode) throws InterruptedException {
		Thread.sleep(2000);
		// TODO Auto-generated method stub
		driver.findElement(Postalcode).sendKeys(strPostalcode);
	}

	public void Statetails(String strState) throws InterruptedException {
		Thread.sleep(2000);
		// TODO Auto-generated method stub
		driver.findElement(State ).sendKeys(strState );
	}

	public void Countrydetails(String strCountry) throws InterruptedException {
		Thread.sleep(2000);
		// TODO Auto-generated method stub
		driver.findElement(Country).sendKeys(strCountry);
	}
	public void Addressdetails(String strAddress) throws InterruptedException {
		Thread.sleep(2000);
		// TODO Auto-generated method stub
		driver.findElement(Address).sendKeys(strAddress);
	}
	public void clickSave() throws InterruptedException  {
		Thread.sleep(3000);
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Save));
		driver.findElement(Save).click();
	}	
	
	public void Address_update_Field(String StrAddress,String StrCity,String strPostalcode,String strState,String strCountry) throws Exception {


		//Scroll Down
		//this.GotoSrolldown();
		//Click AnnualRevenue 
		//this.annualRevenueField(annualRevenueString);
		//Fill Adddress
		this.Addressdetails(StrAddress);
		//fill City
		this.citydetails(StrCity);
		//Fill Pincode
		this.Postalcodedetails(strPostalcode);
		//Fill State
		this.Statetails(strState);
		//Fill Country
		this.Countrydetails(strCountry);
		//Click Login button
		this.clickSave(); 

	}


}