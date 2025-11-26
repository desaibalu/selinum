package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {

	public static void main(String[] args) throws InterruptedException {
		// navigate to demowebshop click on books, click on any book name.click on add to cart
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Books")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Health Book")).click();
		driver.findElement(By.xpath("//input[@fdprocessedid='22f0a8']")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
