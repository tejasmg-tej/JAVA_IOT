package oops_concept;

public class Child extends Parent{
	int x=20;
	 void show() {
		 super.print();
		 System.out.println(x);
		 System.out.println(super.x);
	 }
public static void main(String[] args) {
	Child ob=new Child();
	ob.show();
	
}
}
