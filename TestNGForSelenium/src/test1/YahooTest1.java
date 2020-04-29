package test1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooTest1 {
@Test
  public void testReceiveMail() {
	  System.out.println("Test - Testing Receiving email");
  }
@Test
  public void testSendMail() {
	  System.out.println("Test - Testing Sending email");
  }
@BeforeSuite
  public void initializeTest() {
	  System.out.println("BeforeSuite - Test Execution started");
  }

@AfterSuite
  public void shutDownSelenium() {
	  System.out.println("AfterSuite - Test Execution Stopped");
  }

@BeforeTest
  public void openBrowser() {
	  System.out.println("BeforeTest - Open Browser");
	  System.out.println("_________________________");
  }
@AfterTest
  public void closeBrowser() {
	  System.out.println("AfterTest - Close Browser");
  }

  @BeforeMethod
  public void Login() {
	  System.out.println("_________________________");
	  System.out.println("BeforeMethod - Login");
  }

  @AfterMethod
  public void Logout() {
	  System.out.println("AfterMethod - Logout");
	  System.out.println("_________________________");
  }
}
