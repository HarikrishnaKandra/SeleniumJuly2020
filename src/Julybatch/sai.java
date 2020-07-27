package Julybatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("weddriver.chrome.driver","C:\\Users\\munis\\Desktop\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
System.out.println("read");
	}

}
