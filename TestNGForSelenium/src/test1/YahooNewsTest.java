package test1;


import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooNewsTest {
	 @BeforeTest
	  public void xyz() {
		 System.out.println("Before Executing Yahoo News Test");
	  }
  @Test
  public void testNews() {
		System.out.println("Executing Yahoo News Test");
		 ;
		throw new SkipException("code broken per dev team"); 
  }

}
