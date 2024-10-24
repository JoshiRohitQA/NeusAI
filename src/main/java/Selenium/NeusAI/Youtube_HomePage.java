package Selenium.NeusAI;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Youtube_HomePage {
	WebDriver driver;
	
	@FindBy(xpath="(//div[@class='yt-spec-touch-feedback-shape__fill'])[4]")
	WebElement signinButton;
	
	@FindBy(xpath="//button[@id='avatar-btn']")
	WebElement userButton;
	
	@FindBy(xpath="//input[@id='search']")
	WebElement searchBar;
	
	public void clickSignin() {
		signinButton.click();
	}
	
	public void verifyLoggedin() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(userButton));
	}
	
	public void serachVideo(String video) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(searchBar));
		searchBar.click();
		searchBar.sendKeys(video);
	}
	
	public Youtube_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
