package p3cw;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/mohammadhasan/Downloads/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
//		List<WebElement> cho=driver.findElements(By.tagName("iframe"));
//		System.out.println("count the iframe"+cho.size());
//		driver.switchTo().frame(0);
//		
//		Thread.sleep(400);
//		System.out.println(driver.findElement(By.xpath("//*[@id=\'draggable\']")).getText());
		
		//driver.switchTo().frame(1);
		//driver.switchTo().defaultContent();
		//System.out.println(driver.findElement(By.xpath("//*[@id=\'droppable\']")).getText());
		//driver.close();
		
		driver.switchTo().frame(0);
		WebElement drag=driver.findElement(By.xpath("//*[@id=\'draggable\']"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		
		
		
		
		

	}

}
