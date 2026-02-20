public class fibo {
     public static void fibonaccii(int n){
        int a=0;
        int b=1,sum=0;
        for(int i=0;i<n;i++){
            sum=a+b;
            a=b;
            b=sum;
            System.out.print(sum+" ");
        }

    }
    public static void main(String[] args) {
        fibonaccii(6);
        


    }



}
