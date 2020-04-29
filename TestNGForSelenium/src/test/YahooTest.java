package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooTest {
	@BeforeTest
	public void beforeTest() {
		//Login code…
		System.out.println ("----------------------");
		System.out.println ("Login to YahooEmail");
		System.out.println ("----------------------");
	  }
	@BeforeMethod
	public void beforeMethod() {
		System.out.println ("Execute @Test");
	  }
@Test
public void testReciveMail() {
	// Receiving Email code here...
	System.out.println ("Testing Receiving email");
	}
	
@Test
public void testSendMail() {
// Sending Email code here...
	System.out.println ("Testing Sending email");
	}


@AfterTest
public void afterTest() {
	//Logout code…	
	System.out.println ("----------------------");
	System.out.println ("Logout from YahooEmail");
	System.out.println ("----------------------");
  }
}
