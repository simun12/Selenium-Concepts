package javaConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class breakingxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/mohammadhasan/Downloads/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		 String part1="//*[@id=\'content\']/div/div/div/div/div[1]/div[2]/div[2]/span[";
		 String part2="]";
		 
		 for(int i=1;i<=2;i++)
		 {
			 String y=part1+i+part2;
			 System.out.println(driver.findElement(By.xpath(y)).getText());
		 }
			 
	}

}
