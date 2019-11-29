package javaConcepts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utilityScreen {

	public static void captureScreenShoot(WebDriver driver, String screenShoot) throws IOException   {
		  
		TakesScreenshot ts=(TakesScreenshot)driver;
		      
		  File soure= ts.getScreenshotAs(OutputType.FILE);
		      
		  FileHandler.copy(soure, new File("./screenShot/"+ screenShoot+ ".png"));
		  
		  System.out.println("screenshot taken");
		  
		  driver.close();
		  
	}
		     
}
