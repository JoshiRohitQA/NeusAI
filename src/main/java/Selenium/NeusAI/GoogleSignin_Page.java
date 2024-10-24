package Selenium.NeusAI;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSignin_Page extends DDtPro {
	WebDriver driver;
	
	
	@FindBy(xpath="//input[@type='email']")
	WebElement email;
	
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	WebElement nextButton;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement passwordField;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	WebElement signINbtn;
	
	
	@FindBy(xpath="(//span[.='2-Step Verification'])[1]")
	WebElement verify2step;
	
	
	public void inputEmail() {
		email.sendKeys(emailData);
	}
	
	public void clickNext() {
		nextButton.click();
	}
	
	public void inputPassword() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(passwordField));
		passwordField.sendKeys(passwordData);
	}
	
	public void clickSignin()  {
		signINbtn.click();
	}
	
	
	public GoogleSignin_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
