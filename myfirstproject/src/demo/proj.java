package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class proj {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NISHANT276\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("jeans");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-orders\"]/span[2]")).click();
		driver.findElement(By.name("email")).sendKeys("kumarnishan276@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.findElement(By.name("password")).sendKeys("Myamazon276@");
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		driver.quit();
		
		
		
	}

}
