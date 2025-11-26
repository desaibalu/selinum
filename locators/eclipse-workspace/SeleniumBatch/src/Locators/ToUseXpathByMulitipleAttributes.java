package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathByMulitipleAttributes {

	public static void main(String[] args) throws InterruptedException {
		// launch browser and maximize
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// navigate to demowebshop
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		//click on login link
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		//click on search button with passing any value and check for the waring popup message
		driver.findElement(By.xpath("//input[@type='submit' and @value='Search']")).click(); // using x-path by multiple attributes
	}

}
/*syntax: //tag*/