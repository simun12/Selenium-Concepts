package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fire {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/mohammadhasan/Downloads/gecko 20.0");
		WebDriver driver= new FirefoxDriver();
driver.get("https://www.hm.com");
	}

}
