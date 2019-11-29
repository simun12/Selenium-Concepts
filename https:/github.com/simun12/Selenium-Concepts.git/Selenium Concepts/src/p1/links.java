package p1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "//Users//mohammadhasan//Downloads//chromedriver 2");
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.facebook.com");
		String title=driver.getTitle();
		System.out.println(title);
		if(!title.equals("Facebook - Log In or Sign Up"))
		System.out.println("window is wrong");
		
		List<WebElement> ur=driver.findElements(By.tagName("a"));//Verify links
		System.out.println(ur.size());
		for(int i=0;i<ur.size();i++)
		{
			System.out.println(ur.get(i).getText());
			
			WebElement yolo=ur.get(i);
			String url=yolo.getAttribute("href");
			verfiylinkactive(url);
		}
		
//		List<WebElement> obj=driver.findElements(By.tagName("a"));
//		System.out.println(obj.size());
//		System.out.println("These are the links exist in facebook co");
//		for( int i=0;i<obj.size();i++)
//		{
//			System.out.println(obj.get(i).getText());
//		}
		
		
		
		Thread.sleep(6000);
		driver.close();
	}

	private static void verfiylinkactive(String url) {
		// TODO Auto-generated method stub
		
	}

}
