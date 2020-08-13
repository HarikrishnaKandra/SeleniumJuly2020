package Julybatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chaitu4 {

	public static void main(String[] args) throws InterruptedException {
		// Navigation method
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chaitu\\Desktop\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://mail.google.com");
		
		driver.navigate().back();
		
		//driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		driver.close();

	}

}
