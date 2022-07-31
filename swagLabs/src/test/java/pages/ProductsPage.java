package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import base.Base;

public class ProductsPage extends Base {
		
		By addItem = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
		
		@Test(priority=4)
		public void addItemToCart() throws InterruptedException{
			driver.findElement(addItem).click();
			Thread.sleep(5000);
		}

}
