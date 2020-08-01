package Julybatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooksignup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\munis\\Desktop\\SELENIUM\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("sai");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("p");
		Thread.sleep(1000);
		driver.close();
	}

}
