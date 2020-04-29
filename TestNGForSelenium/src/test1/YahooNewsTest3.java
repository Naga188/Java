
package test1;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.*;

public class YahooNewsTest3 {

	@BeforeTest // **
	public void xyz(){
		System.out.println ("Before Executing Yahoo News Test");
		}

	@Test // **
	public void testNews(){
	System.out.println("Executing Yahoo News Test");
	
	// selenium code
	// expected, actual results
	// text is present
	// link is present
	
	Assert.assertEquals("Good", "Good");// This will show pass since both expected and actual are same
	//Assert.assertEquals("Good", "Good1");// This will show pass since both expected and actual are same
	Assert.assertTrue(6>1, "Error Message");// Condition satisfied so it will pass
	

	System.out.println ("Before Assertion Error");
	
	try{
	Assert.assertTrue(16>11, "Error Message");// Condition not satisfied so it will fail - this is an error
	// click Today’s deals
	}
	catch(Throwable t) { // assersion is an error (not an exception), Throwable can handle both error and exception.
		///
		System.out.println("Caught the error");
		}
	
	Assert.assertFalse(8>9, "Error Message");// Condition satisfied so it will pass
	System.out.println ("After Assersion Error");	
	
	}

}
