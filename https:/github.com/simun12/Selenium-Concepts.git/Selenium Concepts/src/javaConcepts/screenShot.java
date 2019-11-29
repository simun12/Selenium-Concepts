package javaConcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class screenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
	    
		driver.get("http://cvs.com");
		//driver.manage().window().maximize();
		
		utilityScreen.captureScreenShoot(driver, "cvsHomePage55");
		
	      
	 
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      /*Properties pro=new Properties();
	      FileInputStream file=new FileInputStream("//Users//mohammadhasan//Desktop//VanguardTest//VanguardTest/src/property");
	      pro.load(file);
	      //driver.get("url");
	      Thread.sleep(400);
	      driver.quit();
	      
	      
	      
	      /*driver.findElement(By.name("userName")).sendKeys("mecury");
	      driver.findElement(By.name("password")).sendKeys("mecury");
	      driver.findElement(By.name("login")).click();
	      driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
	      driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select")).click();
	      Select s= new Select(driver.findElement(By.name("fromPort")));
	      s.selectByIndex(3);//findFlights
	     
	      driver.findElement(By.name("findFlights")).click();*/
	      
	      

	}

}
