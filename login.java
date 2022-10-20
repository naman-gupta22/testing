package speakin.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/naman/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://grow.speakin.co/#/pages/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("naman.gupta@cosmictechnologies.in");
		driver.findElement(By.name("password")).sendKeys("naman@20138!");
		driver.findElement(By.className("mat-button-wrapper")).click();
		String at = driver.getTitle();
		String et = "Speakin Grow";
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
