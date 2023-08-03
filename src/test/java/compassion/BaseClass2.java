package compassion;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import compassion.Utilities.Utilities;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass2 {
	
	public static AndroidDriver driver;
	public static WebDriverWait wait ;
	public static URL url;
	
	By byyesbutton = By.id("llTellMoreYes");
	By byyesbutton2 = By.id("llYesWebsite");
	By byLoginbutton = By.id("llLogin");
	By byUsername = By.id("edtUsername");
	By byPassword = By.id("edtPassword");
	By byClickLogin = By.id("textLogin");
	By byClickHub = By.id("llHub");
	By byGoToUser = By.id("llDesc1");
	
	@BeforeClass
	public void setup() throws MalformedURLException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability("platformName", "Android");
		
		dc.setCapability("deviceName", "Android Emulator");
		
		dc.setCapability("app", "C:\\Users\\NILESH PANDIT\\Dropbox\\PC\\Desktop\\Internship\\app-dev-debug.apk");
		
		url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AndroidDriver(url,dc);
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		boolean isAppInstalled = driver.isAppInstalled("com.geecon.compassionuk_dev");
		System.out.println("Is Compassion App Installed : " + isAppInstalled);
		
		if(isAppInstalled = true)
		{
			try
			{
				driver.startActivity(new Activity("com.geecon.compassionuk_dev", "com.geecon.compassionuk.activity.MainActivity"));
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//android.widget.FrameLayout[@content-desc=\\\"Home\\\"]/android.widget.ImageView")));
				boolean lc = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Home\"]/android.widget.ImageView")).isDisplayed();
				String LC = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Home\"]/android.widget.ImageView")).getText();
				System.out.println(LC);
				if(lc)
				{
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Ana\"]/android.widget.TextView"))).isDisplayed();
					driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Ana\"]/android.widget.TextView")).click();
					System.out.println("App installed and Login...");
				}
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
				
				try
				{
					if(isAppInstalled = true)
					{
						driver.startActivity(new Activity("com.geecon.compassionuk_dev", "com.geecon.compassionuk.activity.MainActivity"));
						
						Utilities.hardWait(3);
						wait.until(ExpectedConditions.visibilityOfElementLocated(byGoToUser));
						driver.findElement(byGoToUser).click();
						
						Utilities.hardWait(3);
						wait.until(ExpectedConditions.visibilityOfElementLocated(byUsername));
						WebElement user = driver.findElement(byUsername);
						user.sendKeys("davewright79");
						
						Utilities.hardWait(3);
						wait.until(ExpectedConditions.visibilityOfElementLocated(byPassword));
						WebElement pass = driver.findElement(byPassword);
						pass.sendKeys("Friday28");
						
						Utilities.hardWait(3);
						wait.until(ExpectedConditions.visibilityOfElementLocated(byClickLogin));
						driver.findElement(byClickLogin).click();
						
						Utilities.hardWait(3);
						wait.until(ExpectedConditions.visibilityOfElementLocated(byClickHub));
						driver.findElement(byClickHub).click();
						
						System.out.println("App installed and without Login...");
					}
				}

					catch(Exception ex)
					{}
					
					try
					{
					if(isAppInstalled = true)
		{	
			if(driver.findElement(By.id("com.geecon.compassionuk_dev:id/textTitle")).isDisplayed())
			{
						System.out.println("Entered into Welcome...");
			wait.until(ExpectedConditions.visibilityOfElementLocated(byyesbutton));
			driver.findElement(byyesbutton).click();
			
			//Utilities.hardWait(3);
			wait.until(ExpectedConditions.visibilityOfElementLocated(byyesbutton2));
			driver.findElement(byyesbutton2).click();
			
			//Utilities.hardWait(3);
			wait.until(ExpectedConditions.visibilityOfElementLocated(byLoginbutton));
			driver.findElement(byLoginbutton).click();
			
			//Utilities.hardWait(3);
			wait.until(ExpectedConditions.visibilityOfElementLocated(byUsername));
			WebElement user = driver.findElement(byUsername);
			user.sendKeys("davewright79");
			
			//Utilities.hardWait(3);
			wait.until(ExpectedConditions.visibilityOfElementLocated(byPassword));
			WebElement pass = driver.findElement(byPassword);
			pass.sendKeys("Friday28");
			
			//Utilities.hardWait(3);
			wait.until(ExpectedConditions.visibilityOfElementLocated(byClickLogin));
			driver.findElement(byClickLogin).click();
			
			//Utilities.hardWait(3);
			wait.until(ExpectedConditions.visibilityOfElementLocated(byClickHub));
			driver.findElement(byClickHub).click();
			}
			
		}
				}
		catch(Exception ex)
		{}
				}
		}
	
	@AfterClass
	public void tearDown() throws InterruptedException
	{
		Utilities.hardWait(3);
		driver.quit();
	}
}
