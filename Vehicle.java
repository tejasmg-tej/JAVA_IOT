package oops_concept;

public class Vehicle {
	
	void speed() {
		System.out.println("vehicle is moving fast");
		
	}
	
	void speed(int maxSpeed) {
		System.out.println("Vehicles top speed is "+maxSpeed);
	}
	public static void main(String[] args) {
		Vehicle ob=new Vehicle();
		ob.speed();
		ob.speed(180);
	}


}
