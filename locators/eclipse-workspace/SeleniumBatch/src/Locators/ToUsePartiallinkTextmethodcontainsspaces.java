package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUsePartiallinkTextmethodcontainsspaces {
	public static void main(String[] args) throws InterruptedException {
		// TO open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//to maximize the web page
		driver.manage().window().maximize();
		
		// to open the demo web shop
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		// to click on books
		driver.findElement(By.partialLinkText("BOOKS")).click();

	}

}
