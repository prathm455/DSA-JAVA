package String;

public class Subsequence {
    
public static boolean is_Subsequence(String s,String t){
        int i=0,j=0;
        while (i<s.length() && j<t.length()) {
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else{   
                j++;
            }
        }
       return i==s.length(); 
    }
    

    public static void main(String[] args) {
        String t="ahbgdc";
        String s="acb";

        System.out.println(is_Subsequence(s,t));
    }
}
