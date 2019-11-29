package p1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firebox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/mohammadhasan/Downloads/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.com");
		
		/*driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone x");
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).submit();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.get("https://www.papajohns.com/");
		/*driver.findElement(By.cssSelector("li.nav-main-item:nth-child(4) > form:nth-child(1) > input:nth-child(1)")).sendKeys("pizaa");
		driver.findElement(By.cssSelector("li.nav-main-item:nth-child(4) > form:nth-child(1) > input:nth-child(2)")).click();*/
	
		/*driver.findElement(By.cssSelector("li.nav-utility-item:nth-child(3) > a:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#header-account-sign-in-email")).sendKeys("hasanrakibul@yahoo.com");
		driver.findElement(By.cssSelector("#header-account-sign-in-password")).sendKeys("hasan123");
		driver.findElement(By.cssSelector("div.input:nth-child(3) > label:nth-child(2)")).click();
		driver.findElement(By.cssSelector("input.button:nth-child(1)")).submit();
	//System.out.println(driver.findElement(By.cssSelector("#header-recaptcha_error_msg")).getText());
	driver.findElement(By.xpath("//*[@id=\"header-recaptcha_error_msg\"]")).getText();
	
	driver.manage().deleteAllCookies();
	Set<Cookie> allcookies1=driver.manage().getCookies();
	System.out.println("before delete cookie"+ allcookies1.size());*/
	
		
		
	}

}
