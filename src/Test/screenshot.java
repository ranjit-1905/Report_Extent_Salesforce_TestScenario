package Test;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.WebDriver;


public class screenshot {
	public static String captureScreenshot(WebDriver driver, String screenshotName) {
			
	String methodname = screenshotName;
	DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY hh_mm_ss");
	Date date = new Date();
	String location = "D://Automation_Reports//screenshots"; 
	    
		{
		 
		try 
		{
		TakesScreenshot ts=(TakesScreenshot)driver;
		 
		File source=ts.getScreenshotAs(OutputType.FILE);
		 
		FileHandler.copy(source, new File(location + methodname + " " + dateFormat.format(date) + ".jpg"));
		 
		System.out.println("Screenshot taken");
		} 
		catch (Exception e)
		{
		 
		System.out.println("Exception while taking screenshot "+e.getMessage());
		} 
		
		}
		return screenshotName;
		}
	}
