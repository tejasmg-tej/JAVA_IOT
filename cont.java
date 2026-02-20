import java.util.*;
public class cont {

   static  int cntbit(int n){
        int count=0;
        while(n!=0){
        if((n&1)==1){
            count++;
        }
        n=n>>1;
    }
    return count;
}
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no: ");
        int n = sc.nextInt();
        System.out.println("No of 1 bits:"+cntbit(n));

    }

    }




}
    /*public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n,count=0;
        n=sc.nextInt();
        while(n!=0){
        if((n&1)==1){
            count++;
        }
        n=n>>1;
    }System.out.println("No of 1 bits are:"+count);
    }*/

