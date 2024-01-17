package automation.TestAutomationFramework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(name="userName")
    WebElement inputUserName;
	
	@FindBy(name="password")
    WebElement inputPassword;
	
	@FindBy(name="submit")
	WebElement btnSubmit;
	
	public void enteruserName(String UserName) {
		inputUserName.sendKeys(UserName);
	}
	public void enterpassword(String Password) {
		inputPassword.sendKeys(Password);
	}
	public void clickSubmit() {
		btnSubmit.click();
	}
	public void enterDetailsandClickSubmit(String username, String password) {
		enteruserName(username);
		enterpassword(password);
		clickSubmit();
	}
}
