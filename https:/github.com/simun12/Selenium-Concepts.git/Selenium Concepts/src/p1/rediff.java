package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadhasan/Downloads/chromedriver 2");
		WebDriver player=new ChromeDriver();
		player.get("http://www.rediff.com");
		player.manage().window().maximize();
		player.findElement(By.cssSelector("a[title*='user']")).click();
        player.findElement(By.xpath("//input[@name='login']")).sendKeys("hasanrakibul97");
        player.findElement(By.xpath("//input[@tabindex='2']")).sendKeys("poput");
        player.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
       System.out.println(player.findElement(By.xpath("//*[@id=\"login\"]/div[2]/div[2]/div[4]/div")).getText());
	}

}
