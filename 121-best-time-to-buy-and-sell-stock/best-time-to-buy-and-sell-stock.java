class Solution {
    public int maxProfit(int[] prices) {
        int mini=prices[0];
        int p=0;
        for(int i=0;i<prices.length;i++){
            int c=prices[i]-mini;
            if(p<c){
                p=c;
            }
            if(mini>prices[i]){
                mini=prices[i];
            }
        }
        return p;
    }
}