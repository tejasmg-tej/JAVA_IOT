package oops_concept;

public class Car extends Vehicle {
	void speed(String mode) {
		System.out.println("Car's driving mode is:"+mode);
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.speed();
		c.speed(180);
		c.speed("sport");
	}
	

}
