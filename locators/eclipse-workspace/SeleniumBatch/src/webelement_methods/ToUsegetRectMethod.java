package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUsegetRectMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		Rectangle loginrect = driver.findElement(By.name("login")).getRect();
		System.out.println(loginrect);      // if you print rectangle directly you will address of the method
        System.out.println(loginrect.getHeight());
        System.out.println(loginrect.getWidth());
        System.out.println(loginrect.getX());
        System.out.println(loginrect.getY());
	}

}
