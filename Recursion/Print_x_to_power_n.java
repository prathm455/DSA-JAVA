public class Print_x_to_power_n {
    

    public static double fun(int x,int n){
        if(n==0){
            return 1;
        }
        
        double xnm1=fun(x,n-1);
        double xn=x * xnm1;
        return xn;

        //return x * fun(x,n-1);
    }


    public static void main(String[] args) {
        int x=2;
        int n=10;
        System.out.println(fun(x,n));
    }
}
