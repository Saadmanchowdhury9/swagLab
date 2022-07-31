package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import base.Base;

public class LoginPage extends Base {

	By userName = By.xpath("//input[@id='user-name']");
	By userPassword = By.xpath("//input[@id='password']");
	By loginButton = By.xpath("//input[@id='login-button']");
	
	@Test(priority=1)
	public void enterUserName() throws InterruptedException {
		driver.findElement(userName).sendKeys("standard_user");
		Thread.sleep(5000);
	}
	
	@Test(priority=2)
	public void enterPassword() throws InterruptedException {
		driver.findElement(userPassword).sendKeys("secret_sauce");
		Thread.sleep(5000);
	}
	
	@Test(priority=3)
	public void clickLogIn() throws InterruptedException {
		driver.findElement(loginButton).click();
		Thread.sleep(5000);
	}
	
}
