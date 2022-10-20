package speakin.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/naman/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://grow.speakin.co/#/pages/auth/registration");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"signup-form\"]/form/div/div[2]/div[1]/input")).sendKeys("Naman");
		driver.findElement(By.xpath("//*[@id=\"signup-form\"]/form/div/div[2]/div[2]/input")).sendKeys("Gupta");
		driver.findElement(By.xpath("//*[@id=\"signup-form\"]/form/div/div[2]/div[3]/input")).sendKeys("gnaman60+10@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"signup-form\"]/form/div/div[2]/div[4]/div[1]/input")).sendKeys("9717437486");
		driver.findElement(By.xpath("//*[@id=\"signup-form\"]/form/div/div[2]/div[5]/div[1]/input")).sendKeys("Test#12345");
		driver.findElement(By.className("mat-button-wrapper")).click();
		String at = driver.getTitle();
		String et = "SpeakIn Grow";
		driver.close();
		if(at.equals(et))
		{
			System.out.println("Test Successful");
			
			
		}
		else
		{
			System.out.println("Failed");
		}

	}

}
