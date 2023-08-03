package compassion;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

public class Login2 extends BaseClassCUK {

	@Test
	public void login2() throws MalformedURLException, InterruptedException
	{
		BaseClassCUK obj = new BaseClassCUK();
		
		//obj.App_Install();
		
		//obj.WelcomeTour();
		
		//obj.CUK_Login();
		
		obj.Forget_Username_Password();
	}
	
}
