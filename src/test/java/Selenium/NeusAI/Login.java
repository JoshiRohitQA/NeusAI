package Selenium.NeusAI;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends LaunchQuit{
	
	@Test(retryAnalyzer = Selenium.NeusAI.RetryPro.class)
	public void loginTest() throws EncryptedDocumentException, IOException, InterruptedException {
		DDtPro dp = new DDtPro();
		dp.dataTest();
		Youtube_HomePage hp = new Youtube_HomePage(driver);
		hp.clickSignin();
		GoogleSignin_Page sp = new GoogleSignin_Page(driver);
		sp.inputEmail();
		sp.clickNext();
		sp.inputPassword();
		sp.clickSignin();
		hp.verifyLoggedin();
		
		Assert.assertTrue(hp.userButton.isDisplayed());
		
		
	}

}
