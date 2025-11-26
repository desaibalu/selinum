package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUsegetCssValueMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.actitime.com/");
		Thread.sleep(3000);
		
		WebElement tryfreElement = driver.findElement(By.linkText("Try actiTIME for Free"));
		
        System.out.println(tryfreElement.getCssValue("border-radius"));
        System.out.println(tryfreElement.getCssValue("height"));
        System.out.println(tryfreElement.getCssValue("line-height"));
        System.out.println(tryfreElement.getCssValue("background-color"));
        System.out.println(tryfreElement.getCssValue("font-family"));
        Thread.sleep(3000);
        
       /* driver.get("https://www.w3schools.com/colors/colors_hexadecimal.asp");
        Thread.sleep(2000);
        driver.findElement(By.id("hex01")).sendKeys("rgba(66, 198, 87, 1)");
        driver.findElement(By.id("result01")).click();*/
        
	}

}
