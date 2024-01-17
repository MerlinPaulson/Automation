package automation.TestAutomationFramework.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {


	@Test(priority=1)
	public void toTestRegisterWithValidDetails() {
		
		driver.get(registerPageURL);

		String registerpageurl=registerPageURL;
		driver.get(registerpageurl);
		registerPage.enterValidDetailsAndClickSubmit("Zoho","Corp","987654321", "test@zohotest.com","Ernakulam","EkmNorth","Kerala","563620","INDIA","usernamezoho@gmail.com","password123","password123");

		String registersuccesspageurl =driver.getCurrentUrl();
        Assert.assertNotEquals(registersuccesspageurl , registerpageurl,"URL is not matched");
		System.out.println("\nRegister Success Page is rendered with valid details\n");
	}
	@Test(priority=2)
	public void toTestRegisterAlreadyRegUser() {
		
		driver.get(registerPageURL);
		
		String registerpageurl2=registerPageURL;
		driver.get(registerpageurl2);
		registerPage.enterValidDetailsAndClickSubmit("Zoho","Corp","987654321", "test@zohotest.com","Ernakulam","EkmNorth","Kerala","563620","INDIA","usernamezoho@gmail.com","password123","password123");

		String registersuccesspageurl2 =driver.getCurrentUrl();
        Assert.assertNotEquals(registersuccesspageurl2 , registerpageurl2,"URL is not matched");
		System.out.println("Register Success Page is rendered with already registered user\n");
	}

	@Test(priority=3)
	public void toTestRegisterByClickingSubmitButton() {
		
		driver.get(registerPageURL);

		String registerpageurl3=registerPageURL;
		driver.get(registerpageurl3);
		registerPage.clickSubmit();
		String registersuccesspageurl1 =driver.getCurrentUrl();

		Assert.assertNotEquals(registersuccesspageurl1 , registerpageurl3,"URL is not matched");
		System.out.println("Register Success Page is rendered on just clicking Submit button \n");
	}	

}




