package compassion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Forget_Password extends BaseClass {

	By byyesbutton = By.id("llTellMoreYes");
	By byyesbutton2 = By.id("llYesWebsite");
	By byLoginbutton = By.id("llLogin");
	By byUsername = By.id("edtUsername");
	By byPassword = By.id("edtPassword");
	By byClickLogin = By.id("textLogin");
	By byForgetPass = By.id("textForgotPassword");
	By byEnterUser = By.id("edtUsername");
	By bySubmitButton = By.id("textSubmit");
	
	@Test(groups = {"AllTest","Forget_Password"})
	public void Forget_password()
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(byyesbutton));
		driver.findElement(byyesbutton).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(byyesbutton2));
		driver.findElement(byyesbutton2).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(byLoginbutton));
		driver.findElement(byLoginbutton).click();
		
		//with wrong password
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
		
		System.out.println("Please check your email");
	}
	
}
