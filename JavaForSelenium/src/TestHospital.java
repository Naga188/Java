
public class TestHospital {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// Hospital h = new Hospital(); //illegal (like launching browser)
				FortisHospital f = new FortisHospital();
				f.doScan();
				f.doVaccination();
				f.operate();
				System.out.println("-------");

				GovtHospital g = new GovtHospital();
				g.doScan();
				g.doVaccination();
				g.operate();

	}

}
