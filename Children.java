package oops_concept;
class Parents{
	Parents(){
		System.out.println("this is parent class");
	}
}
public class Children extends Parents {
	Children(){
		super();
		System.out.println("child class");
	}
	public static void main(String[] args) {
		Children cd=new Children();
	}
}
