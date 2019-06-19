package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;

public class Click_On_Login_Test extends TestBase{
	
	HomePage homepage;
	
	public Click_On_Login_Test()	{
		super();
	}
	
	@BeforeMethod
	public void setUp()	{
		Initialisation();
		 homepage = new HomePage();
	}
	
	@Test
	public void clickOnLoginTest() throws Exception	{
		homepage.clickOnLoginLink();
		boolean condition = homepage.verifyAmazonLogo();
		if (condition==true)	{
			System.out.println("Amazon Logo Found: <===========Test-Passed======>");
			Assert.assertTrue(true);
		}
		else	{
			System.out.println("Logo Not Found: <===========Test-Failed============>");
		}
		
	}
	
	@AfterMethod
	public void tearDown()	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.close();
	}

}
