package Julybatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHubTestclass 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
	
		System.setProperty("weddriver.chrome.driver","chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		System.out.println("Testing the GitHub As Test Lead");
		Thread.sleep(2000);
		driver.close();

	}

}
