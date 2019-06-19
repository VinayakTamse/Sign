package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import Base.TestBase;

public class EnterEmailPage extends TestBase{
	
	Screen scr = new Screen();
	
	@FindBy(css="#ap_email") WebElement enteremail1;
	@FindBy(css="input#continue") WebElement continueClick1;
	
	public EnterEmailPage()	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmailId(String email) throws Exception	{
		Pattern enterEmail = new Pattern("C:\\Users\\DELL\\eclipse-workspace\\Hello\\src\\Images\\EnterEmail.JPG");
		scr.wait(enterEmail, 3000);
		scr.type(enterEmail, email);
	}
	
	public EnterPasswordPage clickOnContinue() throws Exception	{
		Pattern continueClick = new Pattern("C:\\Users\\DELL\\eclipse-workspace\\Hello\\src\\Images\\continueClick.JPG");
		scr.click(continueClick);
		return new EnterPasswordPage();
	}
	
	public EnterPasswordPage moveToPassword()	{
		enteremail1.sendKeys(props.getProperty("Email"));
		continueClick1.click();
		return new EnterPasswordPage();
	}

}
