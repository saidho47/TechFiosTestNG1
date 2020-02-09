package class_one.lib;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstSelProg {
	
	
	@Test
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Said\\eclipse-workspace\\Said1\\driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://selenium.dev/downloads/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}

}
