package Selenium.NeusAI;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Search_DownloadVideo extends LaunchQuit {
	@Test(retryAnalyzer = Selenium.NeusAI.RetryPro.class,dataProvider = "inputs")
	public void testSearchDownload(String desiredVideo) throws EncryptedDocumentException, IOException {
		DDtPro dp = new DDtPro();
		dp.dataTest();
		Youtube_HomePage hp = new Youtube_HomePage(driver);
		hp.clickSignin();
		GoogleSignin_Page sp = new GoogleSignin_Page(driver);
		sp.inputEmail();
		sp.clickNext();
		sp.inputPassword();
		sp.clickSignin();
		
		hp.serachVideo(desiredVideo + Keys.ENTER);
		
		Youtube_SearchResultPage sr = new Youtube_SearchResultPage(driver);
		sr.clickdesiredVideo();
		
		Youtube_videoPlayPage vp = new Youtube_videoPlayPage(driver);
		vp.clickMoreOptions();
		vp.clickDownload();
		vp.clickDownloaddesiredQuality();
	}
	
	@DataProvider(name="inputs")
	public Object[][] data1(){
		return new Object[][] {{"test video"}};
		
	}

}
