package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       ChromeDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.myntra.com/"); // some websites not allow to inspect directly then use shit+ctrl+i to inspect the elements and using arrow button on html code page
       Thread.sleep(3000);
       driver.findElement(By.xpath("//input[contains(@placeholder,'Search for products')]")).sendKeys("smart watches");
       driver.findElement(By.xpath("//span[contains(@class,'iconSearch')] ")).click();
       Thread.sleep(2000);
       driver.quit();
       
	}

}
