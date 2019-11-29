package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class praticesele {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadhasan/Downloads/chromedriver 2");
		WebDriver player=new ChromeDriver();
		player.get("http://www.instagram.com");
		Thread.sleep(5000);
		player.manage().window().maximize();
//		player.findElement(By.xpath("//button[contains(@class,'_qv64')]")).click();
		/*player.findElement(By.xpath("//input[@id='email']")).sendKeys("hasanrakibul97@yahoo.com");
		player.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Rakibul@93");
		player.findElement(By.xpath("//button[@value='1']")).click();*/
		player.findElement(By.cssSelector("a[href*='/ac']")).click();
		
		player.findElement(By.cssSelector("input[id*='f2']")).sendKeys("hasanrakibul97@yahoo.com");
		
		player.findElement(By.cssSelector("input[type='password']")).sendKeys("Simun123");
		Thread.sleep(1000);
	
		player.findElement(By.cssSelector("button[class*='_']")).click();
		player.findElement(By.cssSelector("a[class*='_8scx2 _gvoze coreSpriteDesktopNavP']")).click();
	
	}
	

}
