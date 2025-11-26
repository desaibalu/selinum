package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toexploremanagemethod {

	public static void main(String[] args) throws InterruptedException {
		// launch browser
		ChromeDriver driver = new ChromeDriver();
		
		//open flipkart
		driver.get("https://www.flipkart.com/");
		
		//to maximaize
		//driver.manage().window().maximize();
		
		//Thread.sleep(5000);
		
		// to minimize
		//driver.manage().window().minimize();

		// to fullscreen
		//driver.manage().window().fullscreen();
		
		//to capture size of window
		//Dimension sizeofwindow = driver.manage().window().getSize();
		//System.out.println(sizeofwindow);
		//System.out.println(sizeofwindow.getHeight());
		//System.out.println(sizeofwindow.getWidth());
		
		//to set size if window
		//Dimension d = new Dimension(500,500);
		//driver.manage().window().setSize(d);
		
		//driver.manage().window().setSize(new Dimension(400,500));
		
		//to get position
	
		//Point positionofwindow = driver.manage().window().getPosition();
		//System.out.println(positionofwindow);
		
		//to set position
		// Point p = new Point(200,150);
		//driver.manage().window().setPosition(p);
		
		driver.manage().window().setPosition(new Point(100,300));
		
		
		 
		
		
		
		
		}

}
