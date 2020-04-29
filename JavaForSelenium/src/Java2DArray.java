
public class Java2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x[][]= new String[3][4];
		x[0][0]="Rama";
		x[0][1]= "Qaqa";
		x[0][2]= "Qa8@gmail.com";
		x[0][3]= "94086";
		
		x[1][0]="Ashok";
		x[1][1]="Pa$$w0rd";
		x[1][2]="agupta@gmail.com";
		x[1][3]="95051";

		x[2][0]="Sheha";
		x[2][1]="Lucky";
		x[2][2]="SnehaAgar@gmail.com";
		x[2][3]="94087";
	
		System.out.println("Rows are "+ x.length);
		System.out.println("Cols are "+ x[0].length);
		
		int rows = x.length;
		int cols= x[0].length;
		
		for (int rowNum=0; rowNum<rows; rowNum++){
			System.out.println("-------------");
			for(int colNum=0; colNum<cols; colNum++){
				System.out.println(x[rowNum][colNum]);
			}
			
		}
				
				
	}

}
