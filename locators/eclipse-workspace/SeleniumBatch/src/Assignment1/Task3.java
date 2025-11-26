package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		// launch browser
				ChromeDriver driver = new ChromeDriver();

				// to maximize the broswer
				driver.manage().window().maximize();

				// to open actitime
				driver.get("https://www.actitime.com/free-online-trial");
				Thread.sleep(3000);

				// enter first name
				driver.findElement(By.id("FirstName")).sendKeys("balasai");
				Thread.sleep(2000);

				// enter last name 
				driver.findElement(By.id("LastName")).sendKeys("desai");
				Thread.sleep(2000);
				
				// enter email id
				driver.findElement(By.id("Email")).sendKeys("baludesai@gmail.com");
				Thread.sleep(2000);
				
				// enter company name
				driver.findElement(By.id("Company")).sendKeys("TCS COMPANY");
	}

}
