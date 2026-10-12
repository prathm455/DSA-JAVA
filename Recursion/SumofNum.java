public class SumofNum {
    
    public static int sum(int n){
        if(n==1){
            return 1;
        }

        int sum_n_1=sum(n-1);
        int sum=n+sum_n_1;
        return sum;
    }

    public static void main(String[] args) {
        
        System.out.println(sum(5));
    }
}
