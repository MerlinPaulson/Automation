package automation.TestAutomationFramework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BasePage {

	public RegisterPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name="firstName")
	WebElement inputTextfirstName;

	@FindBy(name="lastName")
	WebElement inputTextlastName;

	@FindBy(name="phone")
	WebElement inputTextPhone;

	@FindBy(id="userName")
	WebElement inputTextEmail;

	@FindBy(name="address1")
	WebElement inputTextAddress;

	@FindBy(name="city")
	WebElement inputTextCity;

	@FindBy(name="state")
	WebElement inputTextState;

	@FindBy(name="postalCode")
	WebElement inputTextPostalCode;

	@FindBy(name="country")
	WebElement selctDropDownCountry;

	@FindBy(name="email")
	WebElement inputTextemail ;

	@FindBy(name="password")
	WebElement inputTextPassword ;

	@FindBy(name="confirmPassword")
	WebElement inputTextconfirmPassword ;


	@FindBy(name="submit")
	WebElement btnSubmit;


	public void enterFirstName(String firstName) {
		inputTextfirstName.clear();
		inputTextfirstName.sendKeys(firstName);

	}

	public void enterLastName(String lastName) {
		inputTextlastName.sendKeys(lastName);

	}

   public void enterPhoneNumber(String phone) {
		inputTextPhone.clear();
		inputTextPhone.sendKeys(phone);
	}

	public void enterEmail(String email) {
		inputTextEmail.clear();
		inputTextEmail.sendKeys(email);
	}

	public void enterAddress(String address) {
		inputTextAddress.clear();
		inputTextAddress.sendKeys(address);
	}

	public void enterCity(String city) {
		inputTextCity.clear();
		inputTextCity.sendKeys(city);
	}
	public void enterState(String state) {
		inputTextState.clear();
		inputTextState.sendKeys(state);
	}
	public void enterpostalCode(String postalCode) {
		inputTextPostalCode.clear();
		inputTextPostalCode.sendKeys(postalCode);
	}

	public void selectDropDCountry(String country)
	{
		Select selctDropDwnCountry=new Select(selctDropDownCountry);
		selctDropDwnCountry.selectByValue(country);
	}
	public void enterEmailforUsernameText(String UEmail) {

		inputTextemail.sendKeys(UEmail);
	}

	public void enterpassword(String password) {

		inputTextPassword.sendKeys(password);
	}

	public void ConfirmPassWord(String confirmPassword ) {

		inputTextconfirmPassword.sendKeys(confirmPassword);
	}

	public void clickSubmit() {
		btnSubmit.click();
	}

	public void enterValidDetailsAndClickSubmit(String fname, String lname, String phoneNumber, String email, String address, String  city, String State, String PostalCode,String country, String UEmail,String password,String confirmpassword) {
		enterFirstName(fname);
		enterLastName(lname);
		enterPhoneNumber(phoneNumber);
		enterEmail(email);
		enterAddress(address);
		enterCity(city);
		enterState(State);
		enterpostalCode(PostalCode);
		selectDropDCountry(country);
		enterEmailforUsernameText(UEmail);
		enterpassword(password);
		ConfirmPassWord(confirmpassword);
		clickSubmit();
	}


}
