public class WAF_LastOccurence {

    public static int fun(int arr[],int val,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=fun(arr,val,i+1);
        if(isFound==-1 && arr[i]==val){
            return i;
        }
        return isFound;
    }


     public static void main(String[] args) {
        int arr[]={1,4,5,2,3,2,3};
        int val=2;
        System.out.println(fun(arr,val,0));
    }
}
