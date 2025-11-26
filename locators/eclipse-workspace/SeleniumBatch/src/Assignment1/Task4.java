package Assignment1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task4 {
	public static void main(String[] args) throws InterruptedException {
		// to open the web browser
		ChromeDriver driver = new ChromeDriver();
		// to maximize
		driver.manage().window().maximize();
		// to open the demo web shop
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		//fill out all details
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Balasai");
		driver.findElement(By.id("LastName")).sendKeys("Desai");
		driver.findElement(By.id("Email")).sendKeys("desaibalu1@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("password");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("password");
		Thread.sleep(3000);
		// click on register button
		driver.findElement(By.id("register-button")).click();
	}
}
