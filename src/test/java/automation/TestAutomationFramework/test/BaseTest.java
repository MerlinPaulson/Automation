package automation.TestAutomationFramework.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import automation.TestAutomationFramework.pageObjects.FlightsPage;
import automation.TestAutomationFramework.pageObjects.LoginPage;
import automation.TestAutomationFramework.pageObjects.RegisterPage;
import resources.utility;

public class BaseTest {
	
	protected RegisterPage registerPage;
	protected FlightsPage flightpage;
    protected LoginPage loginpage;
	
    WebDriver driver;
	Properties properties;
	static String registerPageURL;
	static String loginPageURL;
	static String flightsPageURL;
	
	
	@BeforeSuite
	public void setUp() {
		String propertyPath = "C:\\Training_Roger\\TestAutomationFramework\\src\\test\\java\\resources\\Env.properties";

		try {
			driver = new ChromeDriver();
			properties = utility.loadProperties(propertyPath);
			
			registerPageURL = properties.getProperty("URL");
			loginPageURL=properties.getProperty("loginURL");
		    flightsPageURL = properties.getProperty("flightsURL");
			
			registerPage = new RegisterPage(driver);
			loginpage=new LoginPage(driver);
			flightpage = new FlightsPage(driver);
				

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@AfterSuite
	public void destroyDriver() {
		//driver.quit();
	}
}
