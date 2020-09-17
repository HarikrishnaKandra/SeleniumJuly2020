package Julybatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sainavigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\munis\\\\Desktop\\\\SELENIUM\\\\chromedriver\\\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.navigate().to("https://www.youtube.com");
Thread.sleep(2000);
driver.navigate().to("https://www.cnbctv18.com/live-tv");
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.get("https://www.gmail.com");
String title=driver.getTitle();
System.out.println(title);
String url=driver.getCurrentUrl();

System.out.println(url);

if( url.startsWith("https"))
{
	System.out.println("secure");
}
	else
	{
		System.out.println("not secure");
		
	}


driver.close();



	}

	private static void contains(String string) {
		// TODO Auto-generated method stub
		
	}

}
