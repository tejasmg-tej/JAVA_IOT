import java.util.*;
public class happyNo {
    public static void main(String[] args) {
        int n,b=2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        n=sc.nextInt();
        int temp=n;
        
       while(n!=1 && n!=4){
           int sum=0;
        while(temp!=0){
            int d=temp%10;
            sum+=d*d;
            temp=temp/10;

    }
    temp=sum;
       }
    if(temp==1){
        System.out.println("Happy Number");

    }
    else
        System.out.println("NOT Happy Number");

}

}

