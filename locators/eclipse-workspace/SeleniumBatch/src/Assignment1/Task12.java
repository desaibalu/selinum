package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task12 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		Thread.sleep(3000);
		WebElement errormsg = driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful')]"));
		
        System.out.println(errormsg.getCssValue("color"));
	}

}
