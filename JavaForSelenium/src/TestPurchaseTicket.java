
public class TestPurchaseTicket {
	public static void main (String[] args){
// creating the object of the class
		PurchaseTicket p = new PurchaseTicket();
			
		System.out.println("--------");
		p.login();
		p.testPurchase();
		p.logout();

// TestPurchaseTicket can call functions from both CommonFunctions and PurchaseTicket classes since PurchaseTicket inherit from CommonFunctions class.
}
}
