public class TilingProblem {



    public static int fun(int n){
        if(n==0 || n==1){
            return 1;
        }

        //vertical case
        int fnm1=fun(n-1);

        //horizontal case
        int fnm2=fun(n-2);

        int totaltiles=fnm1 +fnm2;

        return totaltiles;
    }

    public static void main(String[] args) {
        

        System.out.println(fun(3));
    }
}