package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Touseidlocator {

	public static void main(String[] args) throws InterruptedException {
		// launch browser
		ChromeDriver driver = new ChromeDriver();

		// to maximize the broswer
		driver.manage().window().maximize();

		// to open facebook
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);

		// enter username
		driver.findElement(By.id("email")).sendKeys("desaibalasairoyals@gmail.com");
		Thread.sleep(3000);

		// enter password
		driver.findElement(By.id("pass")).sendKeys("rajubhai133");

	}

}
