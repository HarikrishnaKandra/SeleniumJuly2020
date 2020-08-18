package Julybatch;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Krishna7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna Reddy Buchi\\Desktop\\Java\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.gmail.com");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		int h=driver.manage().window().getSize().getHeight();
		int w=driver.manage().window().getSize().getWidth();
		System.out.println(h+","+w);
		Thread.sleep(2000);
	
		Dimension d=new Dimension(650,1100);
		driver.manage().window().setSize(d);
		int x=driver.manage().window().getPosition().getX();
		int y=driver.manage().window().getPosition().getY();
		System.out.println(x+","+y);
		Thread.sleep(3000);
		Point p=new Point(7,6);
		driver.manage().window().setPosition(p);

	}

}
