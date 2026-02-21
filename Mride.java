package oops_concept;
class Parentr{
	void show() {
		System.out.println("parent class method");
	}
}
class Mride extends Parentr {
	void show() {
		System.out.println("child class method");
	}
	public static void main(String[] args) {
		Parentr ob=new Mride();
		ob.show();
	}

}
