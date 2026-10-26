package String;

public class Substring {
    
  public static String substring_fun(String str,int si,int ei){
          String substr="";
          for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
          }
          return substr;
  }

    public static void main(String[] args) {
        String str="Hello world";
        //System.out.println(substring_fun(str,5,11));     //userdefined

        System.out.println(str.substring(1,5));
    }

}



// Key Interview Point

// If asked: “Strings are immutable, so how is substr += c working?”

// Answer:

// “Strings are immutable, so substr += c does not modify the original string. 
// Each time, Java creates a new String object with the added character and 
// reassigns it to substr. For efficiency, we can use a StringBuilder which is 
// mutable and avoids creating many objects.”