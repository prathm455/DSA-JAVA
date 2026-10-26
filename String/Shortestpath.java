package String;
public class Shortestpath {
    
    public static void find_path(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='E'){
                x++;
            }
            if(str.charAt(i)=='W'){
                x--;
            }
            if(str.charAt(i)=='N'){
                y++;
            }
            if(str.charAt(i)=='S'){
                y--;
            }
        }

        int x_dir=x*x;
        int y_dir=y*y;
        float shortpath= (float)Math.sqrt(x_dir+y_dir);

        System.out.println("Shortest path is "+shortpath);
    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
        find_path(str);
    }
}
