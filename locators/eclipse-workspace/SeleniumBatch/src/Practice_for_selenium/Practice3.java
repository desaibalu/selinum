package Practice_for_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {

	public static void main(String[] args) throws InterruptedException {
		// To open the web browser
		ChromeDriver driver = new ChromeDriver();
		// to maximize the browser
		driver.manage().window().maximize();
		// to open the instagram
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
		// to enter the details
		driver.findElement(By.name("username")).sendKeys("rajubhai2272");
		driver.findElement(By.name("password")).sendKeys("4567891");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log in")).click();// not able to login
	}

}
