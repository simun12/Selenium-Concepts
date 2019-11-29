package javaConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//mohammadhasan//Downloads//chromedriver 2");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.sgx.com/wps/portal/sgxweb/home/!ut/p/a1/04_Sj9CPykssy0xPLMnMz0vMAfGjzOKNHB1NPAycDSz9wwzMDTxD_Z2Cg8PCDANdjYEKIoEKDHAARwNC-sP1o8BK8JhQkBthkO6oqAgAzDYPQQ!!/dl5/d5/L2dBISEvZ0FBIS9nQSEh/");
		Thread.sleep(1500);
		
		WebElement xy =driver.findElement(By.xpath("//*[@id=‘tots’]/table/tbody"));
		//xy.findElements(By.tagName("tr"));
		
		List<WebElement> row=xy.findElements(By.tagName("tr"));
		System.out.println(row.size());
		
for(int i=0;i<row.size();i++) {
	List<WebElement>col=row.get(i).findElements(By.tagName("td"));
	for(int j=0;j<col.size();j++)
	{
		System.out.println(col.get(j).getText());
	}
		
		
}
	}

}
