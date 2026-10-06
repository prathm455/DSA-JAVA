class Solution{

    public static int[] find(int prices[]){
        int profit=0;
        int b=0,s=0;
        for(int i=0;i<=prices.length-1;i++){
            int buy=prices[i];
            for(int j=i+1;j<prices.length-1;j++){
                int sell=prices[j];
                //profit=Math.max(profit, sell-buy);
                if(profit<sell-buy){
                    profit=sell-buy;
                    b=buy;
                    s=sell;
                }
            }
        }
        return new int[]{b,s,profit} ;
    }
    public static void main(String[] args) {
        int prices[]={1,4,2,6,5};
        int result[]=find(prices);
        System.out.println("BUY: "+result[0]);
        System.out.println("SELL: "+result[1]);
        System.out.println("PROFITS: "+result[2]);

    }
}