package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tousequitmethod {

	public static void main(String[] args) throws InterruptedException {
		//to launch browser
				ChromeDriver driver = new ChromeDriver(); //Start server
				
				//to open facebook
				driver.get("https://www.facebook.com/");
				
				Thread.sleep(5000); //5seconds //pause execution
				
				//quit browser
				driver.quit();

	}

}
