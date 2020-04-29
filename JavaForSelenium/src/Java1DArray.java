
public class Java1DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username="rama";
		String password="qaqa";
		String email="qa8@gmail.com";
		String zip="94086";
		String city="Sunnyvale";
		//Assume above data is in excel spread sheet
		// Arrays
		// Read the data from xls and put it inside the array
		String str[]=new String[5];// since we have 1 row and 5 columns
		str[0]="rama";
		str[1]="qaqa";
		str[2]="qa8@gmail.com";
		str[3]="94086";
		str[4]="Sunnyvale";
		// Remember: Array holds a fixed number of values of a single type. //The length of an array is established when the array is created.
		
		// find the length of the array
		System.out.println(str.length); // this will print 5
		// Print all the elements of the String array
		for (int x=0;x<=str.length;x++) {
		System.out.println(str[x]); // it will print the whole string array
		}
	}
}
