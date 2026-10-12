public class factorial {
    
    public  static int fact_fun(int n){

        if(n==0){
            return 1;
        }
       


         int fact_n_1=fact_fun(n-1);

         int fact= n* fact_n_1;

         return fact;
    }

    public static void main(String[] args) {
        System.out.println(fact_fun(5));
    }
}

