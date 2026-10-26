package String;

public class StringCompression {
   
    public static void fun(String str){
        int j=0;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            int count=0;
            while (j<str.length() && str.charAt(i)==str.charAt(j)) {
                    count++;
                     j++; 
            }
              if(count>0){
                        sb.append(str.charAt(i));
                        sb.append(count);
                    }
          
        }
        

        System.out.println(sb);
    }
    public static void main(String[] args) {
        String str="aaaabcccddd";

        fun(str);
    }
}
