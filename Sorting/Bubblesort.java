public class Bubblesort {
    
    public static void sorting(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

        // public static void sorting_already_sort(int arr[]){   
        //     for(int turn=0;turn<arr.length-1;turn++){
        //         int no_swap=0;
        //         for(int j=0;j<arr.length-1-turn;j++){
        //             if(arr[j]>arr[j+1]){
        //                 int temp=arr[j];
        //                 arr[j]=arr[j+1];
        //                 arr[j+1]=temp;
        //                 no_swap=no_swap+1;
        //             }
        //         }
        //         if(no_swap==0){
        //             System.out.println("alreday sorting"+turn);
        //             break;
        //         }
        //     }
        // }

    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,2,4,5};
        sorting(arr);
        //sorting_already_sort(arr);
        display(arr);
    }
}

