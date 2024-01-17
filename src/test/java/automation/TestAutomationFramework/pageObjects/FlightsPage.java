package automation.TestAutomationFramework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class FlightsPage extends BasePage{

	public FlightsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//input[@value='oneway']")
	WebElement radioBtnOneWay;  

	@FindBy(xpath="//input[@value='roundtrip']")
	WebElement radioBtnTwoWayTrip;

	@FindBy(name="passCount")
	WebElement selectNumOfPassenger;

	@FindBy(name="fromPort")
	WebElement selectDeparture;

	@FindBy(name="fromMonth")
	WebElement selectDepartMonth;

	@FindBy(name="fromDay")
	WebElement selectDepartDay;

	@FindBy(name="toPort")
	WebElement selectdestination;	

	@FindBy(name="toMonth")
	WebElement selectArrvingMonth;	

	@FindBy(name="toDay")
	WebElement selectArrvingDay;

	@FindBy(xpath="//input[@value='Business']")
	WebElement radioBtnBusinessClass;  

	@FindBy(name="airline")
	WebElement selectAirline;  

	@FindBy(name="findFlights")
	WebElement btnContinue;

	public void selectTwoWayTrip() {
		radioBtnTwoWayTrip.click();
	}

	public void selectOneWayTrip() {
		radioBtnOneWay.click();
	} 

	public void selectNumOfPassenger(String passCount) {
		Select numOfPassenger=new Select(selectNumOfPassenger);
		numOfPassenger.selectByValue(passCount);

	}
	public void selectDeparture(String departure) {
		Select dept=new Select(selectDeparture);
		dept.selectByVisibleText(departure);
	}

	public void selectDepartMonth(String dpartMonth) {
		Select departMonth=new Select(selectDepartMonth);
		departMonth.selectByVisibleText(dpartMonth);
	}
	public void selectDepartDay(String dpartDay) {
		Select departDay=new Select(selectDepartDay);
		departDay.selectByVisibleText(dpartDay);
	}
	public void selectdestination(String dest) {
		Select destination=new Select(selectdestination);
		destination.selectByVisibleText(dest);
	}
	public void selectArrvingMonth(String ArrvMonth) {
		Select arrvingMonth=new Select(selectArrvingMonth);
		arrvingMonth.selectByVisibleText(ArrvMonth);
	}
	public void selectArrvingDay(String ArrvDay) {
		Select arrvingDay=new Select(selectArrvingDay);
		arrvingDay.selectByVisibleText(ArrvDay);
	}

	public void selectBusinessClass() {
		radioBtnBusinessClass.click();
	}

	public void selectAirline(String airlinePref) {
		Select airline=new Select(selectAirline);
		airline.selectByVisibleText(airlinePref);
	}

	public void clickContinue() {
		btnContinue.click();
	}

	public void enterValidDetailsforOneWayAndClickContinue(String pcount, String dept, String depmnth,String depday,String destination,String Arrvmonth, String Arrvday, String airline) {
		selectOneWayTrip();
		selectNumOfPassenger(pcount);
		selectDeparture(dept);
		selectDepartMonth(depmnth);
		selectDepartDay(depday);
		selectdestination(destination);
		selectArrvingMonth(Arrvmonth);
		selectArrvingDay(Arrvday);
		selectBusinessClass();
		selectAirline(airline);
		clickContinue();
	}

	public void enterValidDetailsforTwoWayTripAndClickContinue(String pcount, String dept, String depmnth,String depday,String destination,String Arrvmonth, String Arrvday,String airline) {
		selectTwoWayTrip();
		selectNumOfPassenger(pcount);
		selectDeparture(dept);
		selectDepartMonth(depmnth);
		selectDepartDay(depday);
		selectdestination(destination);
		selectArrvingMonth(Arrvmonth);
		selectArrvingDay(Arrvday);
		selectBusinessClass();
		selectAirline(airline);
		clickContinue();
	}

}
