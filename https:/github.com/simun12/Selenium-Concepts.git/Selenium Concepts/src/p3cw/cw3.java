package p3cw;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cw3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//mohammadhasan//Downloads//chromedriver 2");
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.ebay.com/");
		String title=driver.getTitle();
		System.out.println(title);
		
		if(!title.equals("Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay"))
		System.out.println("window is wrong");
		System.out.println(driver.getCurrentUrl());
		
		WebElement slow=driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]"));
		List<WebElement> lo=slow.findElements(By.tagName("td"));
		System.out.println(lo.size());
		
		driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[3]/ul/li[7]/a")).click();
		
		Thread.sleep(6000);
		System.out.println(driver.getTitle());
		
		Thread.sleep(6000);
		//driver.close();
	}

}
