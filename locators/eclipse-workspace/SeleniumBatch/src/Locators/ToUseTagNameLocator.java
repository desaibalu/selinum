package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseTagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);

//to count number of images present in a filpkart homepage by using tagname locator with findElements

		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());

		// to count number of links present in a Filpkart Homepage by using tagName with findElements
		// locator with findElements
		List<WebElement> links = driver.findElements(By.tagName("a")); // every link is present in "a" anchor tag in HTML inspect
		System.out.println(links.size());

	}
}
