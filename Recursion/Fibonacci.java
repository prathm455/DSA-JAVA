public class Fibonacci {
 
    
    public static int fun(int n){
        if(n==1 || n==0){
            return n;
        }

        int f_n_1=fun(n-1);
        int f_n_2=fun(n-2);
        int fn=f_n_1 + f_n_2;
        return fn;
    }

    public static void main(String[] args) {
        System.out.println(fun(20));
    }
}
