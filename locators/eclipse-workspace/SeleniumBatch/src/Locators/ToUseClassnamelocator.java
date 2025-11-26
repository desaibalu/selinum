package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClassnamelocator {
	public static void main(String[] args) throws InterruptedException {
		// To launch a broswer
		ChromeDriver driver = new ChromeDriver();
		// to maximize
		driver.manage().window().maximize();

		/* to perform invalid data for classname
		 // to open instagram
		 
		driver.get("https://www.instagram.com/accounts/login/");

		// to enter username
		driver.findElement(By.className("_aa4b _add6 _ac4d _ap35")).sendKeys("balu@123");
		// error displays : org.openqa.selenium.InvalidSelectorException: Compound class names not permitted*/
		
		// to open demo webshop
		driver.get("https://demowebshop.tricentis.com/");
		
		// to click on login link using  link text and store in a variable " loginlink "
		WebElement loginlink = driver.findElement(By.linkText("Log in"));
		loginlink.click();
		Thread.sleep(3000);
		
		// to enter email by using class name
		driver.findElement(By.className("email")).sendKeys("balu@123");

	}

}
