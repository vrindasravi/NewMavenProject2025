package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	WebDriver driver;

	public ManageNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']//i[@class='fas fa-edit']")
	WebElement newButton;
	@FindBy(id="news")
	WebElement news;	
	@FindBy(xpath="//i[ @class='fa fa-search']")
	WebElement searchButton;	
	@FindBy(xpath="//button[@class='btn btn-danger btn-fix']")
	WebElement search1Button;
	
	@FindBy(xpath="//i[@class='fas fa-edit']")
	WebElement editButton;
	
	@FindBy(xpath="//button[text()='Update']")
	WebElement updateButton;
	
	public void createNewMessage() {
		newButton.click();
		news.sendKeys("Test the News");
	}
	
	public void updateMessage() {
		searchButton.click();
		news.sendKeys("Test the News");
	    search1Button.click();	
	    editButton.click();
		news.sendKeys("Test the News updated");
		updateButton.click();
	}
	
	public void searchMessage() {
		searchButton.click();
		news.sendKeys("Test the News updated");
		
	}
	
	public void deleteMessage() {
		
		
	}
}

