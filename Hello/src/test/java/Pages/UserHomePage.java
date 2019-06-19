package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import Base.TestBase;

public class UserHomePage extends TestBase{
	

	
	@FindBy(xpath="//*[text()='Hello, Vijay']") WebElement hoveruser;
	@FindBy(xpath="//*[text()='Sign Out']") WebElement signOut;
	
	public UserHomePage()	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void clickOnLogout() throws Exception	{
		
		Actions act = new Actions(driver);
		act.moveToElement(hoveruser).moveToElement(signOut).click(signOut).build().perform();
	}

}
