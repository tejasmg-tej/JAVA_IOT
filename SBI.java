package oops_concept;

import java.util.Scanner;

class Bank{
	void interest() {
		System.out.println("Bank provides interest on deposits");
		}
    void interest(double rate) {
    	System.out.println("rate of interest is:"+rate);
	}
	
}

public class SBI extends Bank{
	void interest(double rate,int years) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount:");
		double amt=sc.nextDouble();
		
		double inter=(amt*rate*years)/100;
		System.out.println("total interest for "+years+" years is: "+inter);
		sc.close();
		
	}
	public static void main(String[] args) {
		SBI sb=new SBI();
		sb.interest();
		sb.interest(6.5);
		sb.interest(6.5, 3);

	}

}
