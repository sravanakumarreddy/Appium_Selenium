package Ecom_Project;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Tc7 {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		
		 File appDir = new File("src");
	     File app = new File(appDir, "General-Store.apk");
	     DesiredCapabilities capabilities = new DesiredCapabilities();
	     
	     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "sravanakumarreddyb");
	     capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	     AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.1.1:4723/wd/hub"), capabilities);

	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	     driver.findElement(By.xpath("//*[@text='Afghanistan']")).click();
	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
	    // driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + Argentina + "\").instance(0))"));
	     
	     driver.findElement(By.xpath("//*[@text='Argentina']")).click();
 
	     driver.findElement(By.xpath("//android.widget.EditText[@text='Enter name here']")).sendKeys("sravana");
	     driver.hideKeyboard();
         driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
         driver.findElement(By.xpath("//android.widget.Button[@index='6']")).click();  
	 
         
         Thread.sleep(2000);
         driver.findElement(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).click();
         driver.findElement(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).click();
         
         driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
         
         Thread.sleep(2000);
         
       //Mobile Gestures

         WebElement checkbox=driver.findElement(By.className("android.widget.CheckBox"));

         TouchAction t=new TouchAction(driver);

         t.tap(tapOptions().withElement(element(checkbox))).perform();



         driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();



         Thread.sleep(7000);

         Set<String> contexts=driver.getContextHandles();

         for(String contextName :contexts)

         {

         System.out.println(contextName);

         }

         driver.context("WEBVIEW_com.androidsample.generalstore");

         driver.findElement(By.name("q")).sendKeys("hello");

         driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

         driver.pressKey(new KeyEvent(AndroidKey.BACK));

         driver.context("NATIVE_APP");


	}

}





