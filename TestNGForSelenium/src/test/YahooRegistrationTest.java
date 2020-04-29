package test;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class YahooRegistrationTest {
  @Test(dataProvider = "registerData")
  public void testRegister(String username, String password, String email, String city) 
  {// seleniumweb driver code
	// launch browser – web deriver driver = new chromedriver();
	// enter url – driver.get (http://mail.yahoo.com);
	// click register link
	// first name fname
	// last name lname
	// usernameUname
	// passwordPwd
	// email
	// city
	// click register button – register.click();
	System.out.println (username +"   -- "+password +" -- "+email +"-- "+city +"--");

  }

  @DataProvider
  public Object[][] registerData() {
	//path of the excel sheetC:\Selenium\1218\TestNG\TestData.xlsx
	// rows - number of times test has to be repeated (ex: 3 rows)
	// col - parameters in data
	Object [][] data =new Object [3][4]; // 3 rows and 4 columns	
	// first row
	data[0][0]="user1"; 
	data[0][1]="password1";
	data[0][2]="email1";
	data[0][3]="city1";


	// second row
	data[1][0]="user2";
	data[1][1]="password2";
	data[1][2]="email2";
	data[1][3]="city2";

	// third row
	data[2][0]="user3";
	data[2][1]="password3";
	data[2][2]="email3";
	data[2][3]="city3";
	return data;
	}
	}

