package Appium_Practice;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException
	{
		// TODO Auto-generated method stub
	 File appDir = new File("src");
     File app = new File(appDir, "ApiDemos-debug.apk");
     DesiredCapabilities capabilities = new DesiredCapabilities();
     sdfsddfa
     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "sravanakumarreddy1");
     capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
     AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	 
     return driver;
	    
	}
	
	

}
