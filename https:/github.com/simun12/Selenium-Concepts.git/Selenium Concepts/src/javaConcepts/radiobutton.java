package javaConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//mohammadhasan//Downloads//chromedriver 2");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.hm.com/us/");	
		driver.manage().window().maximize();

//		WebElement yo=driver.findElement(By.xpath("//*[@id=\"mysite-newsletterSubscriptionFields\"]/div[2]/label[1]"));
//		boolean bol=yo.isDisplayed();
//		if ( bol==true)
//			System.out.println("is exist");
//		else
//			System.out.println("not exist");
//		
//		System.out.println(yo.isEnabled());
//		System.out.println(yo.isSelected());
//		yo.click();
//		System.out.println(yo.isSelected());
		List<WebElement> f=driver.findElements(By.tagName("iframe"));
		System.out.println(f.size());
		
		for( int i=0;i<f.size();i++)
		{
			System.out.println(f.get(i).getText());
		}
		
		
		//Thread.sleep(5000);
		//driver.close();
		
		
		
		
		
	}

}
