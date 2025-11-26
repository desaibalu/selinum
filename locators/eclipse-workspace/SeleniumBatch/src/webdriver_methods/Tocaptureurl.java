package webdriver_methods;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tocaptureurl {

	public static void main(String[] args) {
		// to launch browser
		ChromeDriver driver = new ChromeDriver();
		
		// to open zomato
		driver.get("https://www.zomato.com/bangalore/delivery");
		
		// to capture url
		String urlofwebpage = driver.getCurrentUrl();
		System.out.println(urlofwebpage);
		

	}

}
