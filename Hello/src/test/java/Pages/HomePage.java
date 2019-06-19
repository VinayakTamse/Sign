package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import Base.TestBase;

public class HomePage extends TestBase {
	
	Screen scr = new Screen();
	
	public HomePage()	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='Hello, Sign in']") WebElement clickLogin;
	@FindBy(how = How.XPATH, using="(//a[@class='a-link-nav-icon']/child::*[@role='img'])[1]")
	WebElement verifyLogo;
	
	public EnterEmailPage clickOnLoginLink() throws Exception	{
		Pattern LoginLink = new Pattern(System.getProperty("user.dir") + "\\src\\Images\\LoginLink.JPG");
		scr.click(LoginLink);
		return new EnterEmailPage();

	}
	
	public boolean verifyAmazonLogo()		{
		return verifyLogo.isDisplayed();
	}
	
	public EnterEmailPage clickLoginLink()	{
		clickLogin.click();
		return new EnterEmailPage();
	}
	
	

}
