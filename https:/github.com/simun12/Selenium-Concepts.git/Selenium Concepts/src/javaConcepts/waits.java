package javaConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class waits {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/mohammadhasan/Downloads/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.hm.com");
		
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.findElement(By.linkText("United States")).click();
		driver.manage().window().maximize();
		List<WebElement> hm=driver.findElements(By.tagName("a"));
		System.out.println(hm.size());
		for(int i=0;i<hm.size();i++)
		{
			System.out.println(hm.get(i).getText());
			WebElement ele=hm.get(i);
			String url=ele.getAttribute("href");
			verifylinkactive(url);
		}
		
		
		
		
		Thread.sleep(6000);
		driver.close();

	}

	private static void verifylinkactive(String url) {
		// TODO Auto-generated method stub
		
	}

}
