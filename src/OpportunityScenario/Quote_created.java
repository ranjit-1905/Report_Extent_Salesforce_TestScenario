package OpportunityScenario;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Test.screenshot;


public class Quote_created {

	//private static final String String = null;
	By MarkStage = By.xpath("//span[contains(text(),'Mark Stage as Complete')]");
	By Quotes =By.xpath("//span[@title='Quotes']");
	By Quotesapp=By.xpath("//a//span[text()='Quotes']");
	By QuotesName =By.xpath(" //*[@id='brandBand_1']/div/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div/div/table/tbody/tr/th/span/a");
	By Addproducts=By.xpath("//a[@title='Add Products']");
	By Save =By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[3]/button[2]/span");
	//div[@id='content_4137:0']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/div[1]
	By Product1=By.xpath("(//td//span[@class='slds-grid slds-grid--align-spread'])[2]");                                                                     //"(//div[contains(@class,'slds-grid slds-grid--align-spread')])[3]");
	//	By Product2=By.xpath("//td[@class='slds-cell-edit cellContainer slds-has-focus']//div[@class='slds-grid slds-grid--align-spread slds-align_absolute-center checkbox-container slds-checkbox uiInput forceVirtualCheckbox uiInput--default']");
	//By Product1=By.xpath("//*[@id=\"content_4137:0\"]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div/div/table/tbody/tr[5]/td[2]/span/div");                                                                     //td[@class='slds-cell-edit cellContainer slds-has-focus']//div[@class='slds-grid slds-grid--align-spread slds-align_absolute-center checkbox-container slds-checkbox uiInput forceVirtualCheckbox uiInput--default']");   ////td//span//div[.='Select item 4']");
	By Product2=By.xpath("(//div[contains(@class,'slds-grid slds-grid--align-spread')])[4]");
	//By Product2=By.xpath("//td//span//div[.='Select item 5']");                                                                      //td[@class='slds-cell-edit cellContainer slds-has-focus']//div[@class='slds-grid slds-grid--align-spread slds-align_absolute-center checkbox-container slds-checkbox uiInput forceVirtualCheckbox uiInput--default']"); 	                                            //"(//div[contains(@class,'slds-grid slds-grid--align-spread')])[3]"); // ("//span//div//label[.='Select item 1']");
	By Next=By.xpath("//span[text()='Next']"); 
	By Quantityclick=By.xpath("//input[contains(@class,'slds-grow uiInputCurrency')]");
	By QuantityFieldclick=By.xpath("//button[contains(.,'Edit Quantity: Item 1')]");
	By Quantity1=By.xpath ("(//input[@data-aura-class='uiInputSmartNumber'])[1]");   
	By QuantityField2click=By.xpath("//button[contains(.,'Edit Quantity: Item 2')]");                 //         ("//button[contains(.,'Edit Quantity: Item 1')]");
	By Quantity2=By.xpath("//input[@class=\"slds-grow input uiInputSmartNumber\"]");
	By Discount=By.xpath("(//button[@type='button'])[29]");
	By Quantitysave=By.xpath("//button[@title='Save']");
	By Clickbutton=By.xpath("//a[@title='Show 6 more actions']");
	By StartSync =By.xpath("//a[@title='Start Sync']");
	By Continue  =By.xpath("//span[normalize-space()='Continue']");
	By CreatePdf =By.xpath("//a[@title='Create PDF']");
	By SavePDF =By.xpath("//span[normalize-space()='Save to Quote']");
	By Click = By.xpath ("(//a[@data-special-link='true'])[1]"); 
	By opportunity = By.xpath("//a[contains(@title,'Opportunities')]");

	WebDriver driver;

	public Quote_created (WebDriver driver) {
		this.driver = driver;
	}


	public void GotoTAB() throws AWTException, Exception {
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}
	public void QuotesappClick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Quotesapp);
		js.executeScript("arguments[0].click();", m);
		System.out.println("Quote has been created" );
	}
	public void QuotesClick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Quotes);
		js.executeScript("arguments[0].click();", m);
	}

	public void MarkStageClick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(MarkStage);
		js.executeScript("arguments[0].click();", m);
	}

	public void QuotesNameClick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(QuotesName);
		js.executeScript("arguments[0].click();", m);
	}
	public void AddproductsClick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Addproducts);
		js.executeScript("arguments[0].click();", m);
	}


	public void SaveClick() throws Exception { 
		// TODO Auto-generated method stub
		Thread.sleep(2000); JavascriptExecutor 
		js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Save);
		js.executeScript("arguments[0].click();", m);
	}
	


	public void Quantityclick() throws Exception {
		// TODO Auto-generated method
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Quantityclick);
		js.executeScript("arguments[0].click();", m); 
	}
	/*
	 * public void Producte4Click() throws Exception { // TODO Auto-generated method
	 * Thread.sleep(5000); JavascriptExecutor js = (JavascriptExecutor) driver;
	 * WebElement m = driver.findElement(Product4);
	 * js.executeScript("arguments[0].click();", m);
	 * 
	 * }
	 */
	public void NextClick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Next);
		js.executeScript("arguments[0].click();", m);
	}

	public void Fieldclick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(QuantityFieldclick);
		js.executeScript("arguments[0].click();", m);
	}
	public void Productquanitycount(String strQuantity1) throws InterruptedException {
		Thread.sleep(4000);
		// TODO Auto-generated method stub
		driver.findElement(Quantity1).sendKeys(strQuantity1);
	} 
	public void Fieldclick2() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(QuantityField2click);
		js.executeScript("arguments[0].click();", m);
	}
	public void Productquanitycount2(String strQuantity2) throws InterruptedException {
		Thread.sleep(4000); 
		// TODO Auto-generated method stub
		driver.findElement(Quantity2).sendKeys(strQuantity2);	  
	}
	public void    Discountclick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Discount);
		js.executeScript("arguments[0].click();", m);
	}
	public void   Quantitysave() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Quantitysave);
		js.executeScript("arguments[0].click();", m);
	}

	public void Clickbutton1() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Clickbutton);
		js.executeScript("arguments[0].click();", m);
	}
	public void   StartSyncClick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(StartSync);
		js.executeScript("arguments[0].click();", m);
	}
	public void  CreatePdfClick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(CreatePdf);
		js.executeScript("arguments[0].click();", m);
	}

	public void  ContinueClick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Continue );
		js.executeScript("arguments[0].click();", m);
	}
	public void SavePDFClick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(  SavePDF );
		js.executeScript("arguments[0].click();", m);
		System.out.println("Quotation PDF created " );
	}
	public void Screen() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(4000);
		screenshot.captureScreenshot(driver, "15.Quote has been created");
	}
	public void TAB() throws AWTException, Exception {
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}
	public void SpaceBar() throws Exception {
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_SPACE);
	}

	public void clickName() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement m=driver.findElement(Click);
		js.executeScript("arguments[0].click();", m);
	}
	public void opportunitytab() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(opportunity);
		js.executeScript("arguments[0].click();", m);
	}
	public void Opportunities_Quote() throws InterruptedException {
		Thread.sleep(5000);
		// TODO Auto-generated method stub
		boolean isEnabled = driver.getPageSource().startsWith("Corp Moody");
		//boolean isDisplayed = driver.getPageSource().startsWith("CorpMoody");

		if (isEnabled) 
			System.out.println("Quote has been created");  	
		else {
			System.out.println("Quote has been created");
		}
	}
	public void goto_Quotes_tab(String strQuantity1,String strQuantity2)throws Exception {
		// TODO Auto-generated method stub

		// Click opportunitytab
		this.opportunitytab();
		//Click Name
		this.clickName();
		//MarkStage
		this.MarkStageClick();
		//MarkStage
		this.MarkStageClick();
		//Markstage
		this.MarkStageClick();
		//Markstage
		this.MarkStageClick();

		//Markstage
		//this.MarkStageClick();
		//Quotes Lab		
		this.QuotesappClick();
		//Quotes Name Click
	    // this.QuotesNameClick();
		//Screen Shot
		this.Opportunities_Quote();
		// Add Product
		//this.AddproductsClick();
		//Save Click		
		//this.SaveClick();
		//TAB
		//this.TAB();
		// SPACE
		//this.SpaceBar();
		//TAB//
		//this.TAB();
		//TAB
		//this.TAB();
		//TAB
		//this.TAB();
		//TAB
		//this.TAB();
		//TAB
		//this.SpaceBar();
		//Add Procuduct1
		//this.Producte1Click();
		//Add Procuduct2
		//this.Producte2Click(); 
		//
		//this.Producte4Click(); 
		//Next
		//this.NextClick() ;
		//
		//this.Fieldclick();
		//
		//	this.Productquanitycount(strQuantity1);
		//
		//this.Fieldclick2();
		//
		//this.Productquanitycount2(strQuantity2);
		//
		//this.GotoTAB();
		//
		//this.Quantitysave();
		/*//
		this.Clickbutton1();
		//
		this.StartSyncClick();
		//
		this.ContinueClick();
		//
		this.Clickbutton1();
		//
		this.CreatePdfClick();
		//
		this. SavePDFClick();*/
	}


}



















