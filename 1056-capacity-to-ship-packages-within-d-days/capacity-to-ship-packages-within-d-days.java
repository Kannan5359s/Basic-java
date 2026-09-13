class Solution {
    public static boolean possible(int[] arr,int max_load,int days){
        int load=0,req_days=1;
        for(int i:arr){
            if(load+i <=max_load){
                load+=i;
            }
            else {
                load=i;
                req_days++;
            }
        }
        return true ?req_days <=days : false;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=Integer.MIN_VALUE,high=0;
        for(int i: weights){
            high+=i;
            low=Math.max(low,i);
        }
        while(low<high){
            int mid=low+((high-low)/2);
            if(possible(weights,mid,days)){
                high=mid;
            }
            else low=mid+1;
        }
        return high;
    }
}