package String;

public class First_capital {
    
    public static void fun(String str){

        StringBuilder str1=new StringBuilder("");

        for(int i=0;i<str.length();i++){
            if(i==0){
                str1.append(Character.toUpperCase(str.charAt(i)));
            }
            else if(str.charAt(i-1)==' '){
                str1.append(Character.toUpperCase(str.charAt(i)));
                
            }
            else{
                str1.append(str.charAt(i));
            }
        }
        System.out.println(str1);
    }
    

    public static void main(String[] args) {
        String str="hello WORLD";
        
        fun(str);
    }
}
