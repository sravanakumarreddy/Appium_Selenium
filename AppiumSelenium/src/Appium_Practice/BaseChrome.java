package Appium_Practice;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseChrome {
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException
	{
		
     DesiredCapabilities capabilities = new DesiredCapabilities();
     
     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
     capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
     AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	 
     return driver;
	    
	}
	
	

}
