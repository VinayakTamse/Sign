package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.EnterEmailPage;
import Pages.EnterPasswordPage;
import Pages.HomePage;
import Pages.UserHomePage;

public class LoginTestcase extends TestBase{
	
	HomePage homepage;
	EnterEmailPage emailpage;
	EnterPasswordPage enterpassword;
	UserHomePage userpage;
	
	public LoginTestcase()	{
		super();
	}
	
	@BeforeMethod
	public void setUp()	{
		Initialisation();
		homepage = new HomePage();
	}
	
	@Test(enabled=true)
	public void LoginTest() throws Exception	{
		emailpage = homepage.clickOnLoginLink();
		emailpage.enterEmailId(props.getProperty("Email"));
		enterpassword = emailpage.clickOnContinue();
		enterpassword.enterPassword(props.getProperty("Password"));
		userpage = enterpassword.clickOnSigin();
		userpage.clickOnLogout();
	}
	
	@Test(enabled=false)
	public void LoginPageTest() throws Exception	{
		emailpage = homepage.clickLoginLink();
		enterpassword = emailpage.moveToPassword();
		userpage = enterpassword.enterUserHomePage();
		userpage.clickOnLogout();
	}
	
	@AfterMethod
	public void tearDown()	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
	}

}
