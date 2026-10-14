public class Fibonacci {
 
    
    public static int fibo(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }

        int fn_1=fibo(n-1);
        int fn_2=fibo(n-2);
        int fn=fn_1 + fn_2;
        return fn;
    }

    public static void main(String[] args) {
        System.out.println(fibo(25));
    }
}
