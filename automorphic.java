import java.util.*;
public class automorphic {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no:");
    int n=sc.nextInt();
    int sqr=n*n;
    int temp=n;
    while(temp!=0){
        if(temp%10!=sqr%10){
            System.out.println("the no is not automorphic");
            return;
        }
        temp/=10;
        sqr/=10;
    
    }
            System.out.println("the no is automorphic");
        
    }

}