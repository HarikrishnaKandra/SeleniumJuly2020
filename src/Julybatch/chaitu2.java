package Julybatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chaitu2 {

	public static void main(String[] args) {
		//Launching chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chaitu\\Desktop\\Testing\\chromedriver_win32");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.google.com");
		
		driver.close();
		
		

	}

}
