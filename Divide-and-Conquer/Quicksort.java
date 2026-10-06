public class Quicksort {
    
    public static void sorting(int arr[],int si,int ei){
        
        if(si>=ei){
            return;
        }

        int ptIdx=partioning(arr,si,ei);
        sorting(arr,si,ptIdx-1);
        sorting(arr,ptIdx+1,ei);
    }

    public static int partioning(int arr[],int si,int ei){

        int pivot=arr[ei];
        int i=si-1;

        for(int j=si;j<ei;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};

        System.out.println("Before sorting:");
        for(int m=0;m<arr.length;m++){
            System.out.print(" "+arr[m]);
        }

        sorting(arr,0,arr.length-1);
        
        System.out.println();
        System.out.println("After sorting:");
        for(int n=0;n<arr.length;n++){
            System.out.print(" "+arr[n]);
        }
    }
}
