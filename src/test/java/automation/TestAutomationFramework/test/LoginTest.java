package automation.TestAutomationFramework.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


	@Test(priority=1)
	public void toTestLoginWithValidUsernameAndPassword()
	{
		driver.get(loginPageURL);
		loginpage.enterDetailsandClickSubmit("test@gmail.com", "test");

		String expected="Login: Mercury Tours";
		String actual=driver.getTitle();

		Assert.assertEquals(actual, expected,"Title is matched");	
		System.out.println("Able to login and load login_success page with valid credentials ");
	}
	@Test(priority=2)

	public void toTestLoginWithInValidUsernameAndPassword()
	{
		driver.get(loginPageURL);
		loginpage.enterDetailsandClickSubmit("45555", "55555");

		WebElement errorMessageElement = driver.findElement(By.xpath("//span[contains(text(), 'Enter your userName and password correct')]"));
		boolean isErrorMessageDisplayed = errorMessageElement.isDisplayed();
		Assert.assertTrue(isErrorMessageDisplayed, "Error message is displayed for invalid credentials");
		System.out.println("As Invalid credentials are given, an err message is displyed to enter correct username and password");

		String expected2 ="Sign-on: Mercury Tours";
		String actual2=driver.getTitle();
		Assert.assertEquals(actual2, expected2,"Title is matched");
		System.out.println("Unable to login, remains in the login page with the expected title ");

	}
	@Test(priority=3)
	public void toTestLoginByClickingSubmitButton() {
		driver.get(loginPageURL);
		driver.findElement(By.name("submit")).click();

		String expected3 ="Sign-on: Mercury Tours";
		String actual3=driver.getTitle();
		
		Assert.assertNotEquals(actual3, expected3,"Expected title is not matched with the actual title");
		System.out.println("Able to login and load login_success page by just clicking submit button ");

	}


}


