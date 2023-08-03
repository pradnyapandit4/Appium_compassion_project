package Appium_mobile_test_project;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class Example1InstallAppAndroidEmulator {

	private static AndroidDriver driver;
	
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		//dc.setCapability("automationName", "UiAutomator2");
		
		dc.setCapability("platformName", "Android");
		
		//dc.setCapability("platformVersion", "13"); //version is number here
		
		dc.setCapability("deviceName", "Android Emulator");
		
		dc.setCapability("app", "C:\\Users\\NILESH PANDIT\\Dropbox\\PC\\Desktop\\Internship\\app-dev-debug.apk");
		
		//dc.setCapability("appPackage", "com.geecon.compassionuk_dev");
		
		//dc.setCapability("appActivity", "com.android.launcher/.Launcher");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AndroidDriver(url,dc);
		
		Thread.sleep(6000);
		driver.findElement(By.id("imgBack")).click();
		
		Thread.sleep(6000);
		driver.findElement(By.id("textLoginDesc")).click();
		
		Thread.sleep(6000);
		driver.findElement(By.id("edtUsername")).sendKeys("davewright79");
		
		Thread.sleep(6000);
		driver.findElement(By.id("edtPassword")).sendKeys("Friday28");
		
		Thread.sleep(6000);
		driver.findElement(By.id("textLogin")).click();
		
		Thread.sleep(6000);
		
		driver.quit();

	}

}
