package test1;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooNewsTest2 {

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
	
	Assert.assertEquals("Selenium", "Selenium");// This will show pass if title of the page is Selenium – Google Search
	//Assert.assertEquals("Good", "Good1");// This will show fail since both expected and actual are different
	Assert.assertTrue(6>1, "Error Message");// Condition satisfied so it will pass
	Assert.assertFalse(1>9, "Error Message");// Condition not satisfied so it will fail with message.
	}

}
