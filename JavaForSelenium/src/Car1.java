
public class Car1 {
	String model;
	int price;
	//int wheels;
	static int wheels=4;

	// non-static example
	public static void main(String[] args) {
		// TODO Auto-generated method stub {
		// creating the object of the class
		Car1 c1 = new Car1();
		c1.model="BMW";
		c1.price=62754;
		c1.start();
		c1.accelarate();

		Car1 c2 = new Car1();
		c2.model="Tesla";
		c2.price=96111;
		c2.start();
		c2.accelarate();

		System.out.println(c1.model);
		System.out.println(c2.model);
		System.out.println(c1.wheels);
		System.out.println(c2.wheels);
		
	

}
	public void start(){ // non-static function/method
		System.out.println(model + " starting");
}

	public void accelarate(){ // non-static function/method
		System.out.println(model + " accel");


	}

}
