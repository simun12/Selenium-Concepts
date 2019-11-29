package p3cw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cw4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//mohammadhasan//Downloads//chromedriver 2");
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		WebElement bd=driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/ul"));
System.out.println(bd.findElements(By.tagName("a")).size());

for(int i=0;i<bd.findElements(By.tagName("a")).size();i++)
{
	//System.out.println(bd.findElements(By.tagName("a")).get(i).getText());
	if(bd.findElements(By.tagName("a")).get(i).getText().contains("site map")) {
		
		System.out.println(driver.getTitle());
		bd.findElements(By.tagName("a")).get(i).click();
		break;
	}
}
	
	
	
	
	
	
	}

}
