package Julybatch;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chaitu6 {

	public static void main(String[] args) throws InterruptedException {
		// getPosition()
		// setPosition()
		// getSize() 
		// setSize()
		// we can use this method to manage browser window size position on Desktop.
		
		//open chrome browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chaitu\\Desktop\\Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser window.
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//launch Facebook site
		driver.get("https://www.facebook.com");
		
		//Get size of the current Browser window.
		
		int W=driver.manage().window().getSize().getWidth();
		int H=driver.manage().window().getSize().getHeight();
		
		System.out.println(W+ " " +H);
		
		//change size of browser window.
		
		Dimension d= new Dimension(1100,500);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		//get position of browser window
		int x=driver.manage().window().getPosition().getX();
		int y=driver.manage().window().getPosition().getY();
		
		System.out.println(x+ " " +y);
		Thread.sleep(2000);
		
		//change position of browser window.
		Point p=new Point(300,400);
		driver.manage().window().setPosition(p);
		
		Thread.sleep(2000);
		
		//close the site
		driver.close();
		
		
		
		
		

	}

}
