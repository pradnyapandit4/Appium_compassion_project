package compassion;

import java.net.MalformedURLException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Login extends BaseClass {

	By byyesbutton = By.id("llTellMoreYes");
	By byyesbutton2 = By.id("llYesWebsite");
	By byLoginbutton = By.id("llLogin");
	By byUsername = By.id("edtUsername");
	By byPassword = By.id("edtPassword");
	By byClickLogin = By.id("textLogin");
	By byClickHub = By.id("llHub");
	
	@Test(groups = {"AllTest","Login"})
	public void login() throws InterruptedException, MalformedURLException 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(byyesbutton));
		driver.findElement(byyesbutton).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(byyesbutton2));
		driver.findElement(byyesbutton2).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(byLoginbutton));
		driver.findElement(byLoginbutton).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(byUsername));
		WebElement user = driver.findElement(byUsername);
		user.sendKeys("davewright79");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(byPassword));
		WebElement pass = driver.findElement(byPassword);
		pass.sendKeys("Friday28");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(byClickLogin));
		driver.findElement(byClickLogin).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(byClickHub));
		driver.findElement(byClickHub).click();
		
	}
	
}
