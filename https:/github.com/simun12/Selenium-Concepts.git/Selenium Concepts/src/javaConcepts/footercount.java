package javaConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class footercount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//mohammadhasan//Downloads//chromedriver 2");
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.ebay.com");
		System.out.println(driver.findElements(By.tagName("a")).size());
	WebElement footer=driver.findElement(By.id("glbfooter"));
	System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement sec=driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[3]/ul"));
		System.out.println(sec.findElements(By.tagName("a")).size());
	}

}
