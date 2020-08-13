package Julybatch;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class saidimensions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\munis\\\\Desktop\\\\SELENIUM\\\\chromedriver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		int x= driver.manage().window().getSize().getHeight();
		int y= driver.manage().window().getSize().getWidth();
		System.out.println(x);
		System.out.println(y);
		Dimension d=new Dimension(200,1000);
		driver.manage().window().setSize(d);
		int a= driver.manage().window().getPosition().getX();
		int b= driver.manage().window().getPosition().getY();
		System.out.println(a);
		System.out.println(b);
        Point p= new Point(5,5);
        driver.manage().window().setPosition(p);
		 
		driver.close();
		
		

	}

}
