package p3cw;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class cw2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//mohammadhasan//Downloads//chromedriver 2");
		WebDriver driver=new  ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
//		List<WebElement> boss=driver.findElements(By.tagName("a"));
//		System.out.println(boss.size());
//		Thread.sleep(300);
//		for(int i=0;i<boss.size();i++)
//		{
//			System.out.println(boss.get(i).getText());
//		}
		
		List<WebElement> orla=driver.findElements(By.tagName("iframe"));
		System.out.println(orla.size());
		
//		driver.switchTo().frame(0);
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"droppable\"]/p")).getText());
//		driver.switchTo().frame(1);
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"draggable\"]/p")).getText());
//		driver.switchTo().defaultContent();
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText());
		driver.switchTo().frame(0);
		WebElement drag=driver.findElement(By.xpath("//*[@id=\'draggable\']/p"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\\\'droppable\\\']/p"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop);
		
		
		
		
		
		Thread.sleep(6000);
		driver.close();

	}

}
