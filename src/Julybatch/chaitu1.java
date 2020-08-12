package Julybatch;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chaitu1 {

	public static void main(String[] args) {
		//Lauching the all Browsers
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chaitu\\Desktop\\Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://mail.google.com");
		
		driver.close();
		
		
			

	}

}
