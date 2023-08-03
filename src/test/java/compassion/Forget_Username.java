package compassion;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Forget_Username extends BaseClass {

	By byyesbutton = By.id("llTellMoreYes");
	By byyesbutton2 = By.id("llYesWebsite");
	By byLoginbutton = By.id("llLogin");
	By byUsername = By.id("edtUsername");
	By byPassword = By.id("edtPassword");
	By byClickLogin = By.id("textLogin");
	By byForgetUser = By.id("textForgotUsername");
	By byEnterEmail = By.id("edtEmail");
	By bySubmitButton = By.id("textSubmit");
	
	@Test(groups = {"AllTest","Forget_Username"})
	public void Forget_username() throws InterruptedException
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(byyesbutton));
		driver.findElement(byyesbutton).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(byyesbutton2));
		driver.findElement(byyesbutton2).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(byLoginbutton));
		driver.findElement(byLoginbutton).click();
		
		//with wrong username
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byUsername));
		WebElement user1 = driver.findElement(byUsername);
		user1.sendKeys("davewright");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byPassword));
		WebElement pass1 = driver.findElement(byPassword);
		pass1.sendKeys("Friday28");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byClickLogin));
		driver.findElement(byClickLogin).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byForgetUser));
		driver.findElement(byForgetUser).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byEnterEmail));
		WebElement email = driver.findElement(byEnterEmail);
		email.sendKeys("pradnyapandit4@gmail.com");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(bySubmitButton));
		driver.findElement(bySubmitButton).click();
		 
		System.out.println("Successfully sent Username...");
		
	}
	
}
