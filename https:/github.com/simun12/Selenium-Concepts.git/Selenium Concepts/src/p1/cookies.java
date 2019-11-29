package p1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookies {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadhasan/Downloads/chromedriver 2");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.superdry.com");
//		driver.findElement(By.xpath("//div[@class='table header-menu-row']/div/ul/li[5]/a")).click();
//      Set<Cookie> allcookies=driver.manage().getCookies();
//      System.out.println("before delete cookie"+allcookies.size());
//      driver.manage().deleteAllCookies();
//    Set<Cookie> allcookies1=driver.manage().getCookies();
//      System.out.println("after delete cookie"+allcookies.size());
		
		
		Set<Cookie> allcookies=driver.manage().getCookies();
		  System.out.println("beofre delete cookies"+allcookies.size());
		  driver.manage().deleteAllCookies();
		  Set<Cookie> allcookies1=driver.manage().getCookies();
		  System.out.println("beofre delete cookies"+allcookies1.size());
		  driver.close();
	}

}
