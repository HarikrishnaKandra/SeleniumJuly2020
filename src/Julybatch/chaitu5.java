package Julybatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chaitu5 {

	public static void main(String[] args) throws InterruptedException {
		//Testing the Web page URL and page TITLE.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chaitu\\Desktop\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		if (url.startsWith("https"))
		{
			System.out.println("URL IS SECURED");
		}
		else {
			System.out.println("URL IS NOT SECURED");
		}
		
		String title=driver.getTitle();
		System.out.println(title);
		
		if (title.startsWith("Facebook – log in or sign up"))
		{
			System.out.println("TITLE TEST IS PASSED");
		}
		else
		{
			System.out.println("TITLE TEST IS NOT PASSED");
		}
		
		driver.close();
		
		
		
		

	}

}
