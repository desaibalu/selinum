package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearngettitlemethod {

	public static void main(String[] args) {
		// launch browser
		ChromeDriver driver = new ChromeDriver();
		
		// to open facebook
		driver.get("https://www.facebook.com/");
		
		// to capture the title 
		String titleofwebpage = driver.getTitle();
		System.out.println(titleofwebpage);

	}

}
