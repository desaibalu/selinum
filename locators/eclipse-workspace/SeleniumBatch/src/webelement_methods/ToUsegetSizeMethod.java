package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUsegetSizeMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		
		WebElement loginElement = driver.findElement(By.xpath("//div[text()='Log in']"));
        System.out.println(loginElement.getSize());
        System.out.println(loginElement.getSize().getWidth());
        System.out.println(loginElement.getSize().height);
	}

}
