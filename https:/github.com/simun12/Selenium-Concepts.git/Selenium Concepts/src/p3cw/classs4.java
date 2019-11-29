package p3cw;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class classs4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//mohammadhasan//Downloads//chromedriver 2");
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
WebElement vet=driver.findElement(By.xpath("//*[@id='pass']"));
WebDriverWait wt=new WebDriverWait(driver, 500);
wt.until(ExpectedConditions.visibilityOfAllElements(vet));
	}

}
