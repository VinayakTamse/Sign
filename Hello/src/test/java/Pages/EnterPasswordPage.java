package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import Base.TestBase;

public class EnterPasswordPage extends TestBase{
	
	Screen scr = new Screen();
	
	@FindBy(id="ap_password") WebElement pass;
	@FindBy(css="#signInSubmit") WebElement clickSignIn;
	
	public EnterPasswordPage()	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterPassword(String pass) throws Exception	{
		Pattern enterpass = new Pattern("C:\\Users\\DELL\\eclipse-workspace\\Hello\\src\\Images\\enterpassword.JPG");
		scr.wait(enterpass, 5000);
		scr.type(enterpass, pass);
		
	}
	
	public UserHomePage clickOnSigin() throws Exception	{
		
		//Pattern clickSignIn = new Pattern("C:\\Users\\DELL\\eclipse-workspace\\Hello\\src\\Images\\clickOnSignin.JPG");
		//scr.wait(clickSignIn, 3000);
		//scr.click(clickSignIn);
		clickSignIn.click();
		return new UserHomePage();
		
	}
	
	public UserHomePage enterUserHomePage()	{
		pass.sendKeys(props.getProperty("Password"));
		clickSignIn.click();
		return new UserHomePage();
	}
	
	

}
