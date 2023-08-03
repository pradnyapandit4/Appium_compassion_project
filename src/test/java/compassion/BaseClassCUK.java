package compassion;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;

public class BaseClassCUK {

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
	By byCrossButton = By.id("imgBack");
	By byForgetUser = By.id("textForgotUsername");
	By byEnterEmail = By.id("edtEmail");
	By bySubmitButton = By.id("textSubmit");
	By byForgetPass = By.id("textForgotPassword");
	By byEnterUser = By.id("edtUsername");
	
	
	@BeforeTest
	public void App_Install() throws MalformedURLException
	{
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability("platformName", "Android");
		
		dc.setCapability("deviceName", "7D49KFHYKJCMRKBU");
		
		//dc.setCapability("app", "C:\\Users\\NILESH PANDIT\\Dropbox\\PC\\Desktop\\Internship\\app-dev-debug.apk");
		
		driver = new AndroidDriver(url,dc);
		
		if(driver.isAppInstalled("com.geecon.compassionuk_dev"))
		{
			System.out.println("App is already installed");
			
			dc.setCapability("platformName", "Android");
			
			dc.setCapability("deviceName", "7D49KFHYKJCMRKBU");
			
			dc.setCapability("appPackage","com.geecon.compassionuk_dev");
			
			dc.setCapability("appActivity","com.geecon.compassionuk.activity.MainActivity");
			
			driver = new AndroidDriver(url,dc);
		}
		else
		{
			System.out.println("App is not installed, wait app is installing");
			
			driver.installApp("C:\\Users\\NILESH PANDIT\\Dropbox\\PC\\Desktop\\Internship\\app-dev-debug.apk");
			
			dc.setCapability("platformName", "Android");
			
			dc.setCapability("deviceName", "7D49KFHYKJCMRKBU");
			
			dc.setCapability("appPackage","com.geecon.compassionuk_dev");
			
			dc.setCapability("appActivity","com.geecon.compassionuk.activity.MainActivity");
			
			driver = new AndroidDriver(url,dc);
			
			System.out.println("App is successfully installed");
		}
	}
	
	
	public void WelcomeTour()
	{
		try
		{
		if(driver.findElement(By.id("com.geecon.compassionuk_dev:id/textTitle")).isDisplayed())
		{
		Thread.sleep(5000);
		driver.findElement(byyesbutton).click();
		Thread.sleep(2000);
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byyesbutton2));
		Thread.sleep(2000);
		driver.findElement(byyesbutton2).click();
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byLoginbutton));
		Thread.sleep(2000);
	    driver.findElement(byLoginbutton).click();
		}
	}		
	catch(Exception ex)
	{}	
	}
	
	public void CUK_Login()
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byUsername));
		WebElement user = driver.findElement(byUsername);
		user.sendKeys("davewright79");
		
		//Utilities.hardWait(3);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byPassword));
		WebElement pass = driver.findElement(byPassword);
		pass.sendKeys("Friday28");
		
		//Utilities.hardWait(3);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byClickLogin));
		driver.findElement(byClickLogin).click();
		
		//Utilities.hardWait(3);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byClickHub));
		driver.findElement(byClickHub).click();
	}
	
	public void Forget_Username_Password() throws InterruptedException
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byCrossButton));
		driver.findElement(byCrossButton).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byGoToUser));
		driver.findElement(byGoToUser).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byUsername));
		WebElement user = driver.findElement(byUsername);
		user.sendKeys("davewright");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byPassword));
		WebElement pass = driver.findElement(byPassword);
		pass.sendKeys("Friday28");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byClickLogin));
		driver.findElement(byClickLogin).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byForgetUser));
		driver.findElement(byForgetUser).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byEnterEmail));
		WebElement email = driver.findElement(byEnterEmail);
		email.sendKeys("pradnyapandit4@gmail.com");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(bySubmitButton));
		driver.findElement(bySubmitButton).click();
		 
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byCrossButton));
		driver.findElement(byCrossButton).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byUsername));
		WebElement user2 = driver.findElement(byUsername);
		user2.sendKeys("davewright79");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byPassword));
		WebElement pass2 = driver.findElement(byPassword);
		pass2.sendKeys("Friday");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byClickLogin));
		driver.findElement(byClickLogin).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byForgetPass));
		driver.findElement(byForgetPass).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byEnterUser));
		WebElement EnterUser = driver.findElement(byEnterUser);
		EnterUser.sendKeys("davewright79");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(bySubmitButton));
		driver.findElement(bySubmitButton).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byCrossButton));
		driver.findElement(byCrossButton).click();
		
	}
	
}
