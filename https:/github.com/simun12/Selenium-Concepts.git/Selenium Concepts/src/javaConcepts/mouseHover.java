package javaConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {

	public static void main(String[] args) throws InterruptedException {
	 
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.google.com");
	//driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("facebook");
		//Thread.sleep(5000);
	
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"gbqfbb\"]"));

		//Create object 'action' of an Actions class

		Actions action = new Actions(driver);

		//Mouseover on an element

		action.moveToElement(ele).build().perform();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/div")).click();;
		
		driver.quit();
	
	
	}
		
		


}
