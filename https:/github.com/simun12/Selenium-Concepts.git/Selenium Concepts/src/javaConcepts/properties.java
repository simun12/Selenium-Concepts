package javaConcepts;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class properties {
	WebDriver driver;

	public static void main(String[] args) throws IOException  {
		
		WebDriver driver;	
		
   Properties prop= new Properties();
   FileInputStream fs= new FileInputStream("/Users/mohammadhasan/workspace/Selenium Concepts/clon.properites");
   prop.load(fs);
   //System.out.println(prop.getProperty("browser"));
   
   String browserName= prop.getProperty("browser");
   
   if(browserName.equals("chrome")) {
	   System.setProperty("webdriver.chrome.driver", "//Users//mohammadhasan//Downloads//chromedriver 2");
		 driver=new  ChromeDriver();
		driver.get("https://www.facebook.com");
	   
   }


	}

}
