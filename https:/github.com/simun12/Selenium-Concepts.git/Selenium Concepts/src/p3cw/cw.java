package p3cw;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cw {

	public static <cookie> void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//mohammadhasan//Downloads//chromedriver 2");
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.hm.com");
		driver.manage().window().maximize();
		
		Set<Cookie> allcookies=driver.manage().getCookies();
		System.out.println(allcookies.size());
		driver.manage().deleteAllCookies();
		Set<Cookie> allcookies1=driver.manage().getCookies();
		System.out.println(allcookies1.size());
		driver.manage().deleteAllCookies();
		
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("United States")).click();
		driver.findElement(By.xpath("//*[@id=\'search-input\']")).sendKeys("man shirt");
		driver.findElement(By.xpath("//*[@name='q']")).submit();
		
		//link count
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement solo=driver.findElement(By.xpath("//*[@class='footer-menu']"));
		System.out.println(solo.findElements(By.tagName("a")).size());
		
		List<WebElement> boss=driver.findElements(By.tagName("iframe"));
		System.out.println(boss.size());
		for(int i=0;i<boss.size();i++)
		{
			System.out.println(boss.get(i).getText());
		}
		
	int now=	driver.findElements(By.tagName("iframe")).size();
	System.out.println(now);
		
		
		
		
		
		Thread.sleep(6000);
		driver.close();
		

	}

}
