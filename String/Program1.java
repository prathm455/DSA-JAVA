package String;
public class Program1 {
    
    public static void letterfind(String full_name){
        for(int i=0;i<full_name.length();i++){
            System.out.print(full_name.charAt(i)+" ");
        }
    }
    public static void main(String args[]){
        String str1="abc";
        String str2=new String("abc");
        String str3="xyz";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1==str2);
        System.out.println(str1==str3);

        System.out.println("Length of str1: "+str1.length());

        String f_name="Prathmesh";
        String l_name="Mane";
        String full_name=f_name+" "+l_name;
        System.out.println("Full name is :"+full_name);
       
        letterfind(full_name);

    }
}
