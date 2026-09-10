class Solution {
    public static boolean is_possible(int[] arr, int max_allocate,int no_painters){
        int required_painters=1;
        int job=0;
        for(int i:arr){
            if(job+i <= max_allocate){
                
                job+=i;
            }
            else{
               required_painters++;
               job=i;
            }
        }
        if(required_painters <= no_painters) return true;
        else return false;
    }
    
    public int minTime(int[] arr, int k) {
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i: arr){
            low=Math.max(low,i);
            high+=i;
        }
        if(k==1) return high;
        while(low< high){
            int mid=low+((high-low)/2);
            if(is_possible(arr,mid,k)){
                high=mid;
            }
            else low=mid+1;
        }
        
        if(k> arr.length) return -1;
        else return low;
    }
    public int splitArray(int[] nums, int k) {
        return minTime(nums, k);
    }
}