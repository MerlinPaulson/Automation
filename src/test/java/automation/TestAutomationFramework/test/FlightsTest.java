
package automation.TestAutomationFramework.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class FlightsTest extends BaseTest{


	@Test(priority=1 ,dataProvider = "dpOneWayTrip_validAndInvalidDetails")
	public void testOnewayTrip_validAndInvalidDetials(String pcount, String dept, String depmnth,String depday,String destination,String Arrvmonth, String Arrvday, String airline) {

		driver.get(flightsPageURL );
		String flightpageUrl=flightsPageURL;
		flightpage.enterValidDetailsforOneWayAndClickContinue(pcount, dept,  depmnth, depday,destination, Arrvmonth, Arrvday, airline);

		String flightRegisterPageURL =driver.getCurrentUrl();
		Assert.assertNotEquals(flightRegisterPageURL, flightpageUrl,"Flights Register Page and Flight Page URL is not matched");
		System.out.println("The page Reservation2 is rendered with both valid and invalid details");
	}

	@Test(priority=2, dataProvider = "dpTwoWayTrip_validAndInvalidDetails")
	public void testTwoWayTrip_validAndInvalidDetials(String pcount, String dept, String depmnth,String depday,String destination,String Arrvmonth, String Arrvday, String airline) {

		driver.get(flightsPageURL );
		flightpage.enterValidDetailsforTwoWayTripAndClickContinue(pcount, dept,  depmnth, depday,destination, Arrvmonth, Arrvday, airline);

		String roundTripRegisterPageUrl = driver.getCurrentUrl();
		Assert.assertNotEquals(roundTripRegisterPageUrl, flightsPageURL, "Flights Register Page and Flight Page URL is not matched");
		System.out.println("The page Reservation2 is rendered with both valid and invalid details");
	}

	@DataProvider
	public Object[][] dpOneWayTrip_validAndInvalidDetails() {                 
		return new Object[][] {
			new Object[] {"2","London","December","21","Sydney","December","22","Unified Airlines"},//testing values with valid details
			new Object[] {"2","London","December","21","London","December","22","Unified Airlines"},//testing values with invalid details: same departure and arrival loc

		};
	}
	@DataProvider
	public Object[][] dpTwoWayTrip_validAndInvalidDetails(){                 
		return new Object[][] {
			new Object[] {"1","London","December","24","Seattle","December","25","Pangea Airlines"},//testing values with valid details
			new Object[] {"1","London","December","24","Seattle","December","3","Pangea Airlines"},//testing values with invalid details: arrival day is kept before depart day

		};
	}


}
