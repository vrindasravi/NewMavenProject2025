package testcase;

import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import elementRepository.AdminPage;
import elementRepository.LoginPage;

public class LoginPageTest extends BaseClass {
	
	LoginPage lp;
	AdminPage ap;
  @Test(groups="smoke")
  public void VerifyDashBoardTextWhileLoginWithValidCredentials() throws InvalidFormatException, IOException {
	  lp=new LoginPage(driver);
	  //ap=new AdminPage(driver);
       ap= lp.Login(groceryData(0,0),groceryData(0,1));
	  String actual=ap.getDashboardString();
	  String expected ="Dashboard";
	  Assert.assertEquals(actual, expected, "::Dashboard text not as exprcted");
	 
	  //  a method need to create verify the error message while login invalid credentials  using  data provider
  }
  
  @DataProvider(name = "invalid credentials")
  public Object[][] invalidCredntials() {
	  
      return new Object[][] {{"user1","admin"},
    	  {"admin","pwd1"},
    	  {"user1","pwd1"}};	  
  }
  @Test(dataProvider="invalid credentials")
  public void VerifyErrorMsgWhileLoginWithInValidCredentials(String userName , String password ) {
	  lp=new LoginPage(driver);
		lp.Login(userName, password);
		String actual=lp.getErrorMessage();
		String expected = "Invalid Username/Password";
		Assert.assertEquals(actual, expected, "::Error message not as expected");

	 
	  //  a method need to create verify the error message while login invalid credentials  using  data provider
  }
  
 
  
}

// excel create username and password . read from excel 
