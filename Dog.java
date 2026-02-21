package oops_concept;

public class Dog extends Animal{
	void sound() {
		System.out.println("Dog barks");
	}

}
class Puppy extends Dog{
	void display() {
		System.out.println("Puppy barks");
	}
	public static void main(String[] args) {
		Puppy ob=new Puppy();
		ob.print();
		ob.sound();
		ob.display();
	}
}
