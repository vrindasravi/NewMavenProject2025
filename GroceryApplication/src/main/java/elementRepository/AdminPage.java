package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import utilities.GeneralUtility;

public class AdminPage {

	//GeneralUtility gu = new GeneralUtility();
	WebDriver driver;

	public AdminPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()='Dashboard']")
	WebElement dashboardText;
	@FindBy(xpath="//a//p[text()='Manage News']")
	WebElement  manageNewsTab;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']//i[@class='fas fa-edit']")
	WebElement manageGiftButton;
	
	@FindBy(xpath="//li[@class='nav-item']//a[@href='https://groceryapp.uniqassosiates.com/admin/list-product']//p[text()='Manage Product']")
	WebElement manageProduct;
	
	
	
	public String getDashboardString() {
		return dashboardText.getText();
	}
	
	public ManageNewsPage clickOnManageNewsTab() {
		manageNewsTab.click();
		//gu.selectDropdownWithIndex(dashboardText, 2)
		return new ManageNewsPage(driver);
	}
	
	public ManageFooterText clickOnManageFooterText() {
		
		manageGiftButton.click();
		return new ManageFooterText(driver);
	}
	public  ManageProduct clickonManageProduct() {
		
		manageGiftButton.click();
		return new ManageProduct(driver);
	}
	
	}
