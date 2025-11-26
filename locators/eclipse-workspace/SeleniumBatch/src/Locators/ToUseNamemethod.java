package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseNamemethod {

	public static void main(String[] args) throws InterruptedException {
		// launch browser
		ChromeDriver driver = new ChromeDriver();

		// to maximize the broswer
		driver.manage().window().maximize();

		// to open demo ornage hrm
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

		// enter username
		driver.findElement(By.name("username")).sendKeys("balu123");
		Thread.sleep(3000);

		// enter password
		driver.findElement(By.name("password")).sendKeys("4567891");
	}

}
