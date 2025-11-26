package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUsegetLocationMethod {

	public static void main(String[] args) throws InterruptedException {
		// this method use to find the position of the element in the web page
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		Point createaccountpos = driver.findElement(By.linkText("Create new account")).getLocation();
		System.out.println(createaccountpos);
		System.out.println(createaccountpos.getX());
        System.out.println(createaccountpos.getY());
	}

}
