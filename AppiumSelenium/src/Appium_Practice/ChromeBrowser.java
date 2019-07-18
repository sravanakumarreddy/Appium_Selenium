package Appium_Practice;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ChromeBrowser extends BaseChrome {
	
	public static void main(String[] args) throws MalformedURLException
	{
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.get("https://www.google.com/");
	}

}
