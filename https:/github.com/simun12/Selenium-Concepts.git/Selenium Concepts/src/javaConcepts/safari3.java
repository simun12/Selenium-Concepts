package javaConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class safari3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.safari.driver", "/Users/mohammadhasan/Library/Safari/Extensions/safaridriver");
		WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://www.605.tv");
		
		driver.close();
	}

}
