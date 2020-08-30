package Julybatch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class naukriprofile {

	public static void main(String[] args) throws InterruptedException {
		// Naukri log-in and cv upload
		
		//Launch Chrome Browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chaitu\\Desktop\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//maximize the current browser window
		
		driver.manage().window().maximize();
		
		//wait for 20 seconds 
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Launch the browser
		
		driver.get("https://www.naukri.com/nlogin/login");
		
		// Enter the username
		
		driver.findElement(By.id("usernameField")).sendKeys("chaitureddy509@outlook.com");
		
		//Enter the password
		
		driver.findElement(By.id("passwordField")).sendKeys("090509");
		
		
		//click on login button
		
		driver.findElement(By.xpath("//*[@type='submit'] [1]")).click();
		
		Thread.sleep(3000);
		
		//update the profile
		
		driver.findElement(By.xpath("//*[@class='btn btn-block btn-large white-text']")).click();
		
		Thread.sleep(2000);
		
		//upload the resume
		
		driver.findElement(By.id("attachCV")).sendKeys("C:\\Users\\Chaitu\\Downloads\\resume\\chaitanya.docx");
		
		Thread.sleep(2000);
		
		//move the mouse overview
		
		WebElement e=driver.findElement(By.xpath("//div[contains(text(),'My Naukri')]"));
		Actions a=new Actions(driver);
		a.moveToElement(e).build().perform();
		
		driver.findElement(By.linkText("Logout")).click();
		
		//close the browser
		
		driver.quit();
		
		
		
	}

}
