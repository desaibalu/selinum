package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.findElement(By.linkText("Register")).click();
		 Thread.sleep(3000);
		 // fill the details by using css selector
		 driver.findElement(By.cssSelector("input[value='M']")).click();
		 driver.findElement(By.cssSelector("input[name='FirstName']")).sendKeys("raju");
		 driver.findElement(By.cssSelector("input[name='LastName']")).sendKeys("bhai");
		 driver.findElement(By.cssSelector("input[data-val-required='Email is required.']")).sendKeys("rajubhai0007@gmail.com");
		 driver.findElement(By.cssSelector("input[data-val-length-min='6']")).sendKeys("raju0070");
		 driver.findElement(By.cssSelector("input[data-val-equalto-other='*.Password']")).sendKeys("raju0070");
		 Thread.sleep(3000);
		 driver.findElement(By.cssSelector("input[value='Register']")).click();
		 Thread.sleep(2000);
		 driver.quit();

	}

}
