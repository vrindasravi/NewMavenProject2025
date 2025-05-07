package testcase;
import org.testng.annotations.Test;

import elementRepository.AdminPage;
import elementRepository.LoginPage;
import elementRepository.ManageNewsPage;

public class ManageNewsTest extends BaseClass {
	
	LoginPage lp;
	AdminPage ap;
	ManageNewsPage mp;

	@Test
	public void verifyDashboardTextWhileLoginWithValidCredential() {
	//	lp=new LoginPage(driver);
		//ap=new AdminPage(driver);
		mp=new ManageNewsPage(driver);
		ap=lp.Login("admin", "admin");
		mp=ap.clickOnManageNewsTab();
		mp.createNewMessage();
		mp.updateMessage();
	
	
	}
	}