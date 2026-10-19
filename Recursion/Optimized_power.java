public class Optimized_power {


      public static int fun(int x,int n){
        if(n==0){
            return 1;
        }

        int halfpower=fun(x,n/2);
        int HalfPowerSquare=halfpower * halfpower;

        //n is odd
        if(n%2!=0){
            HalfPowerSquare=x * HalfPowerSquare;
        }
        
        return HalfPowerSquare;     

    }


    public static void main(String[] args) {
          int x=2;
        int n=5;
        System.out.println(fun(x,n));
    }
    
}
