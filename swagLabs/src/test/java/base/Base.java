package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public static void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
//	public static void navigate(String url) {
//		driver.get(url);
//		//driver.get("https://www.saucedemo.com/");
//	}
	
	@AfterSuite
	public static void close(){
		driver.quit();
	}	

}
