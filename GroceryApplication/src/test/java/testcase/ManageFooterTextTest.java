package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import elementRepository.AdminPage;
import elementRepository.LoginPage;
import elementRepository.ManageFooterText;
import elementRepository.ManageNewsPage;

public class ManageFooterTextTest {
	
	LoginPage lp;
	AdminPage ap;
	ManageNewsPage mp;
	ManageFooterText mf;
  @Test
  public void verifyManageFooterTextTest(WebDriver driver) {
	 mf= new ManageFooterText(driver);
	 ap=lp.Login("admin", "admin");
	 mf.updateMessage();
  }
}
