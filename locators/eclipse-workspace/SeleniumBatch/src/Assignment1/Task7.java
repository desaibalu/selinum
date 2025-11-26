package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {

	public static void main(String[] args) throws InterruptedException {
		// write automation script for navigate to demoshop and do the reqistration by using only xpath
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='M']")).click();
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Harry");
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Potter");
		driver.findElement(By.xpath("//input[@data-val-email='Wrong email']")).sendKeys("harry2006@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("haryy123");
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("haryy123");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		Thread.sleep(3000);
		driver.quit();
		

	}

}
