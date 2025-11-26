package Practice_for_selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import sun.java2d.opengl.WGLSurfaceData.WGLVSyncOffScreenSurfaceData;

public class pratice1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("start Execution");
		//to launch browser and maximize the window
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// to open youtube
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000); // pause for 5 seconds
		
		
		// to open facebook through string url
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);// pause for 5 seconds
		driver.manage().window().setPosition(new Point(500,200));
		
		// to open flipkart
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		
		// to navigate to backward
		driver.navigate().back();//redirect to facebook
		Thread.sleep(3000);
		driver.navigate().back();// redirect to youtube
		driver.manage().window().minimize();
		driver.manage().window().setSize( new Dimension(1000,1200));
		Thread.sleep(3000);
		
		// to open naukari
		driver.get("https://www.naukri.com/mnjuser/homepage");
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.manage().window().setSize(new Dimension(500,800));
		driver.navigate().back();//redirect to youtube
		//driver.navigate().forward();//redirect to flipkart
		//driver.navigate().forward();//redirect to instagram
		Dimension getwindowsize = driver.manage().window().getSize();
		System.out.println(getwindowsize);
		driver.manage().window().maximize();
		//driver.navigate().back();// redirect to flipkart
		Thread.sleep(4000);
		
		// to close the window
		//driver.close();
		
		//to open amazon
		driver.get("https://www.amazon.in/");
		Point getpositionofwindow = driver.manage().window().getPosition();
		System.out.println(getpositionofwindow);
		Thread.sleep(4000);
		driver.navigate().back();
		
		//to open qtalk
		driver.navigate().to("https://chat.qspiders.com/");
		driver.manage().window().setPosition(new Point(1000,1000));
		Point getposionofwindow = driver.manage().window().getPosition();
		System.out.println(getposionofwindow);
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		
		//to open the youtube
		driver.get("https://www.youtube.com/watch?v=aEa1Dn_tOkA");
		driver.manage().window().fullscreen();
		String getwindowid = driver.getWindowHandle();
		System.out.println(getwindowid);
		Thread.sleep(60000);
		driver.quit();
        System.out.println("stop execution");
		
		
		
		
		
		

	}

}
