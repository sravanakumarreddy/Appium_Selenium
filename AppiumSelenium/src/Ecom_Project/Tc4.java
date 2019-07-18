package Ecom_Project;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Tc4 {
	
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
         
        String amount1= driver.findElement(By.id("com.androidsample.generalstore:id/productPrice")).getText();
         
	  amount1=amount1.substring(1);
	  Double amount1Value=Double.parseDouble(amount1);
	  
	  System.out.println(amount1);
	  
	  String amount2= driver.findElement(By.id("com.androidsample.generalstore:id/productPrice")).getText();
	  
	  amount2=amount2.substring(1);
	  double amount2Value=Double.parseDouble(amount2);
	  
	  System.out.println(amount2);
	  String sumOfProducts=amount1Value+amount2;
	  System.out.println(sumOfProducts);
	  
	  String total=driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
	  
	  total=total.substring(1);
	
	  
	  double totalValue=Double.parseDouble(total);
	  System.out.println(totalValue);
	  Assert.assertEquals(sumOfProducts, totalValue);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	     
	}

}





