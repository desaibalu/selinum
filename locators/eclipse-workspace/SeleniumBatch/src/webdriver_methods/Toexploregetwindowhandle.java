package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Toexploregetwindowhandle {

	public static void main(String[] args) {
		// TO launch broswer and maximize the window
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//to open instagram
		driver.get("https://www.instagram.com/");
		
		// to capture sessionId and it give only parent web page Id as unique 32 alphanumeric value
		String ParentId = driver.getWindowHandle();
		System.out.println(ParentId); // first time - 2B9DDBDC0E41101DA13A65E31F54EE02
		                              // second time - F8C1ED0BADB0B360614DEDEEE7D29D2C
		

	}

}
