public class FriendsPairing {

    public static int FriendsPairingfunction(int n){

        if(n==1 || n==2){
            return n;
        }

        //single
        int fnm1=FriendsPairingfunction(n-1);

        //double
        int fnm2=FriendsPairingfunction(n-2);

        int totalways=fnm1 + (n-1) * fnm2;

        return totalways;




    }

    public static void main(String[] args) {
        System.out.println(FriendsPairingfunction(5));
    }
}