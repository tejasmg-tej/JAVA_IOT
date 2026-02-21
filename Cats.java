package oops_concept;

public class Cats extends Animal {
	void meow() {
		System.out.println("cat sleeps");
		
	}
	public static void main(String[] args) {
		dogs ob1=new dogs();
		Cats ob2=new Cats();
		ob1.print();
		ob1.bark();
		ob2.print();
		ob2.meow();
	}

}
