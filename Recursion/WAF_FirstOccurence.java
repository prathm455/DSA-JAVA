public class WAF_FirstOccurence {
    

    public static int fun(int arr[],int val,int i){
        if(arr[i]==val){
            return i;
        }
        if(i==arr.length){
            return -1;
        }

        return fun(arr,val,i+1);
    }

    public static void main(String[] args) {
        int arr[]={1,4,5,2,3,2,3};
        int val=2;
        System.out.println(fun(arr,val,0));
    }
}
