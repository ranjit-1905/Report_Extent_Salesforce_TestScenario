package Login;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	By userSFName = By.name("username");
	By passwordSF = By.id("password");
	By login = By.id("Login");
	public Login(WebDriver  driver){
		this.driver = driver;
	}
	public void setUserName(String strUserName) {
		// TODO Auto-generated method stub
		driver.findElement(userSFName).sendKeys(strUserName);
	}
	public void setPassword(String strPasword) {
		// TODO Auto-generated method stub
		driver.findElement(passwordSF).sendKeys(strPasword);
	}
	public void clickLogin() {
		// TODO Auto-generated method stub
		driver.findElement(login).click();
	}
	public void loginToSF(String strUserName,String strPasword){
		//Fill user name
		this.setUserName(strUserName);
		//Fill password
		this.setPassword(strPasword);
		//Click Login button
		this.clickLogin(); 
	}
}

