package Julybatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chaitu3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chaitu\\Desktop\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys("chaitureddy509@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("09bn1a0509");
		
		driver.findElement(By.id("loginbutton")).click();
		
		driver.close();
		
	

	}

}
