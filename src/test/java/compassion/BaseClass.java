package compassion;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import compassion.Utilities.Utilities;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {

	public static AndroidDriver driver;
	public static WebDriverWait wait ;
	public static URL url;
	
	@BeforeClass(groups = {"AllTest","Login","Forget_Username","Forget_Password"})
	public void setup() throws MalformedURLException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability("platformName", "Android");
		
		dc.setCapability("deviceName", "Android Emulator");
		
		dc.setCapability("app", "C:\\Users\\NILESH PANDIT\\Dropbox\\PC\\Desktop\\Internship\\app-dev-debug.apk");
		
		url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AndroidDriver(url,dc);
		
	}

	@AfterClass(groups = {"AllTest","Login","Forget_Username","Forget_Password"})
	public void tearDown() throws InterruptedException
	{
		Utilities.hardWait(3);
		driver.quit();
	}
	
}
