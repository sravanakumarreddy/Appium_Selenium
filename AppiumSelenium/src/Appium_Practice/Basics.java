package Appium_Practice;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends Base {
	
	public static void main(String[] args) throws MalformedURLException
	{
		
		//AndroidDriver<AndroidElement> driver =Capabilities();
		 AndroidDriver<AndroidElement>driver=Capabilities(); 
		 driver = Capabilities();



		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		System.out.println("start");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		
		System.out.println("sucess");
		
	}

}
