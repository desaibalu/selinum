package webdriver_methods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class Toexplorenavigatemethod {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// to launch a browser
		
		ChromeDriver driver = new ChromeDriver();
		
		// to maximize the window
		
driver.manage().window().maximize();

// to open facebook to string url

// driver.navigate().to("https://www.facebook.com/");

// to open facebook to url url

//driver.navigate().to(new URL("https://www.facebook.com/"));


//to open facebook
driver.get("https://www.facebook.com/");
Thread.sleep(5000); //to pause for 5 seconds 

// to open filpkart
driver.get("https://www.flipkart.com/");
Thread.sleep(5000); //to pause for 5 seconds 

// to navigate back to previous web page
driver.navigate().back();//facebook
Thread.sleep(5000); //to pause for 5 seconds 

//to navigate forward to previous web page
driver.navigate().forward();//filipkart
Thread.sleep(5000); //to pause for 5 seconds 

//to navigate to refresh the current web page
driver.navigate().refresh();









	}

}
