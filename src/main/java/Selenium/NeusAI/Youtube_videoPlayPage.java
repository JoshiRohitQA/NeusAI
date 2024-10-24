package Selenium.NeusAI;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Youtube_videoPlayPage {
	WebDriver driver;
	
	@FindBy(xpath="(//button[@class='yt-spec-button-shape-next yt-spec-button-shape-next--tonal yt-spec-button-shape-next--mono yt-spec-button-shape-next--size-m yt-spec-button-shape-next--icon-button yt-spec-button-shape-next--enable-backdrop-filter-experiment'])[1]")
	WebElement moreOption;
	
	@FindBy(xpath="//ytd-menu-popup-renderer[@slot='dropdown-content']/tp-yt-paper-listbox/ytd-menu-service-item-download-renderer")
	WebElement download;
	
	@FindBy(xpath="(//button[@aria-label='Download'])[2]")
	WebElement downloadBtn;
	
	
	public void clickMoreOptions() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(moreOption));
		moreOption.click();
	}
	
	public void clickDownload() {
		download.click();
	}
	
	public void clickDownloaddesiredQuality() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(downloadBtn));
		downloadBtn.click();
	}
	
	public Youtube_videoPlayPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
