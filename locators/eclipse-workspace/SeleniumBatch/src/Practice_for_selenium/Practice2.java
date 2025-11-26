package Practice_for_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		// To launch the browser
		ChromeDriver driver = new ChromeDriver();

		// to maximize
		driver.manage().window().maximize();

		// to open the facebook
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);

		// to enter email
		driver.findElement(By.id("email")).sendKeys("desaibalasai@gmail.com");
		Thread.sleep(2000);

		// to enter password
		driver.findElement(By.id("pass")).sendKeys("Balu@456");

		Thread.sleep(3000);

		// to click on login
		driver.findElement(By.name("login")).click();

	}

}
