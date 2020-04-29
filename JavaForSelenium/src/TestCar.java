public class TestCar {
	String model;
	public static void main(String[] args) {
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
			
		a.model="A";
		b.model="B";
		c.model="C";
		
		System.out.println(a.model);
		System.out.println(b.model);
		System.out.println(c.model);
System.out.println("------------");
		// Run now, you will see A, B, C
	

		a=b;
		b=c;
		c=a;

		/* What modifications above will do in memory is: 
a=b: “a” reference will be removed and “a” will be pointed to where “b” is pointing to. 
b=c: “b” reference will be removed and “b” will be pointed to where “c” is pointing to.
c=a: “c” reference will be removed and “c” will be pointed to where “a” is pointing to that is b*/
		
		System.out.println(a.model);
		System.out.println(b.model);
		System.out.println(c.model);
//Now…a.model will print b, b.model will print c and c.model will print b
/*i.e the objects still remain in the memory in a particular location, but object references keep on changing. Right now, object “a” doesn’t have any object reference, and cannot be accessed so it will be destroyed by mechanism called garbage collection*/
// Run now, you will see B, C, B (so A is not needed anymore, and can be destroyed by Garbage collection)

}	
}
