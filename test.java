package speakin.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/naman/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://xemptlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("menu-item-162")).click();
		driver.findElement(By.className("woocommerce-loop-product__title")).click();
		driver.findElement(By.className("single_add_to_cart_button")).click();
		driver.findElement(By.className("cart-icon")).click();
		driver.findElement(By.className("checkout-button")).click();
		String at = driver.getTitle();
		String et = "Checkout – Xempt";
		driver.close();
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Test Successful");
			
			
		}
		else
		{
			System.out.println("Failed");
		}

	}

}
