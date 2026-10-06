public class Rotated_search {

    public static int search(int arr[],int target,int si,int ei){
        if(si>ei){
            return -1;
        }

        int  mid=si+(ei-si)/2;

        if(arr[mid]==target){
            return mid;
        }

        //mid on L1
        if(arr[si]<=arr[mid]){
            //case 1:left
            if(arr[si]<=target && target<=arr[mid]){
                return search(arr, target, si, mid-1);
            }
            //case 2:right
            else{
                return search(arr, target, mid+1, ei);
            }
        }

        //mid on L2
        else{
            //case 1: right
            if(arr[mid]<=target && target<=arr[ei]){
                return search(arr, target, mid+1, ei);
            }
            //casec 2: left
            else{
                return search(arr, target, si, mid-1);
            }
        }
    }

    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2};
        int target=0;

        int tIdex=search(arr,target,0,arr.length-1);

        System.out.println(tIdex);

    }
}


//serach target index
