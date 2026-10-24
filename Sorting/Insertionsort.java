import java.util.Arrays;
import java.util.Collections;

public class Insertionsort {

    public static void sorting(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while (prev>=0 && arr[prev]>curr) {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }

    // Index:  0  1  2  3  4
    // Array: [5, 4, 1, 3, 2]


    public static void display(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        //int arr[]={5,4,1,3,2};

        //Arrays.sort(arr,0,3);

        //when sort in reverse
        Integer arr[]={5,4,1,3,2};
        Arrays.sort(arr,Collections.reverseOrder());

        
        //sorting(arr);
        display(arr);
    }
}
