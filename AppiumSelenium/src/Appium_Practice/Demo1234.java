package Appium_Practice;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Demo1234 {

	
	public static void main(String[] args) throws MalformedURLException
	
	{
		
		 File appDir = new File("src");
	     File app = new File(appDir, "ApiDemos-debug.apk");
	     DesiredCapabilities capabilities = new DesiredCapabilities();
	     
	     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "sravanakumarreddyb");
	     capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	     AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.1.1:4723/wd/hub"), capabilities);

	     
		
		
		 System.out.println("start"); 
		 
		 //String text=driver.findElement(By.xpath(
				  //android.widget.TextView[@text='Preference']")).getText();
		 /**System.out.println(text);
		 * 
		 * driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']"))
		 * .click();
		 * 
		 * System.out.println("1"); driver.findElement(By.
		 * xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click
		 * (); System.out.println("2");
		 * driver.findElement(By.id("android:id/checkbox")).click();
		 * System.out.println("3");
		 * driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		 * 
		 * System.out.println("sucess");
		 */
		 
	}

}
