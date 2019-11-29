package javaConcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class childwindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/mohammadhasan/Downloads/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp?hl=en");

				
		
		System.out.println(driver.getTitle());
  driver.findElement(By.partialLinkText("Learn ")).click();
  Set<String> win=driver.getWindowHandles();
  Iterator<String> it=win.iterator();
  String parent=it.next();
  String child=it.next();
  driver.switchTo().window(child);
  System.out.println(driver.getTitle());
		
		
		/*driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Learn")).click();
		
		Thread.sleep(400);
		
		System.out.println(driver.getTitle());
		
		Set<String> lose=driver.getWindowHandles();
		Iterator<String> in=lose.iterator();
		String parent=in.next();
		String child=in.next();
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		
		 driver.close();
		 Thread.sleep(5000);
		 driver.switchTo().window(parent);
		 System.out.println(driver.getTitle());
		 driver.quit();*/
		 
		
		
		
	}

}
