package Julybatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newrepeat {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\munis\\Desktop\\SELENIUM\\chromedriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.gmail.com");
driver.manage().window().maximize();
System.out.println(driver.manage().window().getSize());
Thread.sleep(1000);
System.out.println(driver.getTitle());
Thread.sleep(1000);
driver.navigate().to("https://www.youtube.com");
Thread.sleep(2000);
driver.navigate().to("https://www.cnbctv18.com/live-tv");
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().refresh();
Thread.sleep(2000);
driver.close();
	}

}
