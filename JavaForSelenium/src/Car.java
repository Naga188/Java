
public class Car {
	String model;
	int price;
	int wheels;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		c1.model="BMW";
		c1.price=62754;
		c1.wheels=4; // this is common in every car
		c1.start();
		c1.accelarate();

		Car c2 = new Car();
		c2.model="Tesla";
		c2.price=96111;
		c2.wheels=4; // this is common in every car
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
