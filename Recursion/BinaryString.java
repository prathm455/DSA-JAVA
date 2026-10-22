//Binary string without consecutive ones
public class BinaryString {

    public static void fun(int n,int lastplace,String str){

        if(n==0){
           System.out.println(str);
           return;
        }
        if(lastplace==0){
           
            fun(n-1,0, str+"0");
            
            fun(n-1,1, str+"1");
        }
        else{
            
            fun(n-1,0,str+"0");
        }
    }

    public static void main(String[] args) {
        fun(3,0,"");
    }
}