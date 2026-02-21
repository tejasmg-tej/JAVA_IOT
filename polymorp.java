package oops_concept;

public class polymorp {
	static void calci(int a,int b) {
		System.out.println(a+b);
	}
	static void calci(double a,double b) {
		System.out.println(a+b);
	}
	static int calci(int a,int b,int c) {
		return (a+b)*c;
	}
	public static void main(String[] args) {
		calci(5,3);
		calci(5.2,4.8);
		System.out.println(calci(2,2,2));
	}

}
