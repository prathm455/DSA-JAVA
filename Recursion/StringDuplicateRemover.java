public class StringDuplicateRemover {


    public static void fun(String str,int indx,StringBuilder newstr, boolean map[]){

        if(indx==str.length()){
            System.out.println(newstr);
            return;
        }

        char ch=str.charAt(indx);
        if(map[ch-'a']==true){
            fun(str,indx+1,newstr,map);
        }else{
            map[ch-'a']=true;
            fun(str,indx+1,newstr.append(ch),map);
        }

    }

    public static void main(String[] args) {
        String str="hellohunny";
        fun(str,0,new StringBuilder(""),new boolean[26]);
    }
}