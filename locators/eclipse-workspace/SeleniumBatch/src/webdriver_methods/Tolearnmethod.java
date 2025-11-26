package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnmethod {

	public static void main(String[] args) {
		// launch browser
		ChromeDriver driver =new ChromeDriver();
		
		//to open facebook
		driver.get("https://www.facebook.com/");
		
		//to open instagram
		driver.get("https://www.instagram.com/accounts/login/?hl=en");

	}

}
