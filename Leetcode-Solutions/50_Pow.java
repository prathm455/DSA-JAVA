class Solution {
    public static double myPow(double x, int n) {
        int i=0;
        double pow=1;
        if(n>0){
            while(i<n){
            pow=pow*x;
            i++;
            }
        }
        else{
           while(i>n){
            pow=pow*(1/x);
            i--;
            } 
        }
        
        return pow;
        //return Math.pow(x, n);
    }

    public static void main(String args[]){

        double x=2.0000;
        int n=10;
        
        double power=myPow(x, n);

        System.out.println(power);

    }
}