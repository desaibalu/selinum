package Assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	// launch browser and open kyc webpage and capture the title of web page
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://online.kfc.co.in/");
		String titleofwebpage = driver.getTitle();
		System.out.println(titleofwebpage);

	}

}
