package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tocapturethesourcecode {

	public static void main(String[] args) {
		// to launch browser
				ChromeDriver driver = new ChromeDriver();
				
				// to open zomato
				driver.get("https://www.zomato.com/bangalore/delivery");
				
				// to capture source code
				String sourcecodeofwebpage = driver.getPageSource();
				System.out.println(sourcecodeofwebpage);
				

	}

}
