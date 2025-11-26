package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClearMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
	    Thread.sleep(3000);
	    
	    // store the address of the element into a variable and perform clear method to clear existing value in username
	    WebElement username = driver.findElement(By.id("username"));
	    username.clear();
	    Thread.sleep(2000);
	    username.sendKeys("desaibalu2272@gmail.com");
	    
	    // store the address of the element into a variable and perform clear method to clear existing value in password
	    WebElement Password = driver.findElement(By.id("password"));
	    Password.clear();
	    Thread.sleep(2000);
	    Password.sendKeys("78941");
	    
	    Thread.sleep(5000);
	    driver.quit();
	}

}
