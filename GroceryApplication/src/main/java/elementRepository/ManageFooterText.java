package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterText {

	WebDriver driver;
	public ManageFooterText(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
			
	@FindBy(xpath="//td//a[@class='btn btn-sm btn btn-primary btncss']//i[@class='fas fa-edit']")
	WebElement actionButton;
	
	@FindBy(xpath="//textarea[@id='content']")
	WebElement updatearea;
	
	public void updateMessage() {
		actionButton.click();
		updatearea.sendKeys("Test the News");
	}
	


}
