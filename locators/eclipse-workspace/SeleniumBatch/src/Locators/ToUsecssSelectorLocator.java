package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUsecssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		// To launch a broswer
		ChromeDriver driver = new ChromeDriver();
		// to maximize
		driver.manage().window().maximize();
		// to open demo webshop
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		// to click on search button by using css selector locator by giving syntax as expression
		driver.findElement(By.cssSelector("input[value='Search']")).click();
	}

}
/*Syntax:
     tagname[AttributeName='AttributeValue'] --- using attibutes
     */