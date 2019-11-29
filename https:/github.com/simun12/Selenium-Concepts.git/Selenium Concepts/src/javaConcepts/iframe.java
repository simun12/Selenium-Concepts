package javaConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//mohammadhasan//Downloads//chromedriver 2");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
Thread.sleep(400);

System.out.println(driver.findElement(By.xpath("//*[@id=\'content\']/p[1]")).getText());
//System.out.println(driver.findElement(By.xpath("//*[@id=\"droppable\"]/p")).getText());
List<WebElement> li =driver.findElements(By.tagName("iframe"));
System.out.println("iframe count");
driver.switchTo().frame(0);
System.out.println();



	}

}
