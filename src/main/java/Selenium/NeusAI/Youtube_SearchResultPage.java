package Selenium.NeusAI;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Youtube_SearchResultPage {

	WebDriver driver;
	
	@FindBy(xpath="//div[@id='title-wrapper']/h3/a")
	List<WebElement>videos;
	
	
	public void clickdesiredVideo() {
		videos.get(0).click();
	}
	
	public Youtube_SearchResultPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
