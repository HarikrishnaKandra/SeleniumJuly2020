package Julybatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class saitextboxtest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\munis\\Desktop\\SELENIUM\\chromedriver\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
	Thread .sleep(1000);
	driver.findElement(By.name("firstname")).sendKeys("sai");
	Thread .sleep(1000);
	driver.findElement(By.name("lastname")).sendKeys("p");
	Thread .sleep(1000);
	driver.findElement(By.name("reg_email__")).sendKeys("9885653748");
	WebElement e=driver.findElement(By.name("birthday_day"));
	Select s=new Select(e);
	s.selectByVisibleText("5");
	Thread .sleep(1000);
	Select d= new Select(driver.findElement(By.name("birthday_month")));
	d.selectByIndex(11);
	Select y= new Select(driver.findElement(By.name("birthday_year")));
	y.selectByValue("1991");
	
//	driver.close();
	
	
	}

}
