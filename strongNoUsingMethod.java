

public class strongNoUsingMethod {
    int factorial(int d){
        int fact=1;
        for (int i =1; i <=d; i++){
            fact=fact*i;
        }
          return fact;
    }
    boolean isStrong(int n){
        int temp=n;
        int sum=0;
        while(temp!=0){
            int d=temp%10;
            sum=sum+factorial(d);
            temp=temp/10;
        }
    
    if(sum==n){
        return true;
    }
    else{
        return false;
    }
}
    public static void main(String[] args) {
        strongNoUsingMethod ob=new strongNoUsingMethod();
        System.out.println(ob.isStrong(145));
    }
}
