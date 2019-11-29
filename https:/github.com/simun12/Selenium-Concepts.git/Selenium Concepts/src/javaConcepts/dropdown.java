package javaConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//mohammadhasan//Downloads//chromedriver 2");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(100);
		
		List<WebElement> pol=driver.findElements(By.tagName("a"));
		System.out.println(pol.size());
		for( int i=0;i<pol.size();i++) 
		{
			System.out.println(pol.get(i).getText());
		}
		
		
		
		
		
//Select s= new Select(driver.findElement(By.id("//*[@id='month']")));
//s.selectByValue("4");
//driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("hasan");


		

	}

}
