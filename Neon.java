import java.util.Scanner;

public class Neon {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=sc.nextInt();
        int t=n;
        int temp=n*n;
        while(temp!=0){
        sum+=temp%10;
        temp/=10;
        }
        if(sum==t){
        System.out.println("it is a neon number");
           }
        else{
            System.out.println("Not a neon number");
        }
           }

}
