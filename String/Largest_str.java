package String;

public class Largest_str {
    
    public static void main(String[] args) {
        String fruits[]={"banana","mango","aple"};

        String largest=fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }

        System.out.print("largest string is : "+largest);
    }
}
