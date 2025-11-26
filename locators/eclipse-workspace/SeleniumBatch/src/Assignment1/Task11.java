package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task11 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("garuda gamana tava");
		driver.findElement(By.xpath("//button[@title='Search']")).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(@title,'Garuda Gamana Tava Song Lyric Video') and @id='video-title']")).click();
        Thread.sleep(6000);
        driver.quit();
	}

}
