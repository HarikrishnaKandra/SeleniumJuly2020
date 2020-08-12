package Julybatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Krishna6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Krishna Reddy Buchi\\Desktop\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.facebook.com");
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Krishna");
		Thread.sleep(1000);
		driver.findElement(By.name("surname")).sendKeys("Buchi");
		Thread.sleep(1000);
		driver.close();

	}

}
