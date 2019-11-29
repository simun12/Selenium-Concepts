package p1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class express {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//mohammadhasan//Downloads//chromedriver 2");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.express.com");
		Set<Cookie> allcookies=driver.manage().getCookies();
		System.out.println("before delete cookie"+ allcookies.size());

		driver.manage().deleteAllCookies();
		
		Set<Cookie> allcookies1=driver.manage().getCookies();
		System.out.println("After delete cookie"+ allcookies1.size());
		driver.findElement(By.xpath("///input[@type='text' and @id='header-search-field']")).sendKeys("men sale");
		driver.findElement(By.xpath("//*[@placeholder='Search Express']")).click();
		

			


	
	}
}
