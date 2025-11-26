package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUselinkTextmethod {

	public static void main(String[] args) throws InterruptedException {
		// TO launch browser
		ChromeDriver driver = new ChromeDriver();
		
		// to maximize web browser
		driver.manage().window().maximize();
		
		// to open demo web shop
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		// to click on login button
		driver.findElement(By.linkText("Log in")).click();

	}

}
