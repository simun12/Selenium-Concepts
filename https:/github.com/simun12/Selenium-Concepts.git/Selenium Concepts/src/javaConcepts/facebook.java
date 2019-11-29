package javaConcepts;

import java.awt.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static  void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//mohammadhasan//Downloads//chromedriver 2");
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		Set<Cookie> allcookies=driver.manage().getCookies();
		System.out.println("cookies "+ allcookies.size());
		driver.manage().deleteAllCookies();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.name("firstname")).sendKeys("MO");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("hasan");
		driver.findElement(By.name("reg_email__")).sendKeys("hasanrakibul@yahoo.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='u_0_n']")).sendKeys("hasanrakibul@yahoo.com");
		driver.findElement(By.xpath("//input[contains(@name,'reg_passwd__')]")).sendKeys("simun&123");
		
		WebElement op=driver.findElement(By.id("month"));
		Select app=new Select(op);
		app.selectByIndex(8);
		
	//	List<WebElement>
		
		
		Select sos=new Select(driver.findElement(By.xpath("//select[@id='day']")));
		sos.selectByValue("9");
		
		Select so=new Select(driver.findElement(By.xpath("//select[@id='year']")));
		so.selectByValue("2000");
		
		driver.findElement(By.xpath("//*[@id=\'u_0_d\']")).click();
		//WebElement yogo=driver.findElement(By.xpath("//*[@id=\\'u_0_d\\']"));
//		boolean bow=yogo.isDisplayed();
//		if (bow==true)
//			System.out.println("is apppeared");
//		else
//			System.out.println("didnt appeswhat");
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		driver.findElement(By.xpath("//div[@id='reg_error_inner']")).getText();
	//System.out.println(driver.findElement(By.xpath("//*[@id=\'reg_error_inner\']")).getText());
		
		//List<WebElement> ob=driver.findElement(By.tagName("a"))
		

	}

}
