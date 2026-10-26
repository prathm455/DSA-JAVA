package String;

public class StringCompare {
    
    public static void main(String[] args) {
        String str1="abc";
        //String str2="abc";
        String str3=new String("abc");
        // if(str1==str2){
        //     System.out.println("Equals");
        // }
        // else{
        //     System.out.println("Not equals");
        // }

        // if(str1==str3){
        //     System.out.println("Equals");
        // }
        // else{
        //     System.out.println("Not equals");
        // }

        if(str1.equals(str3)){
            System.out.println("Equals Content");
        }
        else{
            System.out.println("Not equals");
        }
    }
}
