package Julybatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Krishna8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna Reddy Buchi\\Desktop\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.gmail.com");
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(url.startsWith("https"))
		{
			System.out.println("URL TEST IS Passed");
		}
		else {
			System.out.println("URL TEST IS FAILED");
		}
		System.out.println("Test Failed");
		driver.close();
		}

	}



