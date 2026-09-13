class Solution {
    public static int divided(int[] arr,int mid){
        int ans=0;
        for(int i: arr){
            int d=(i+mid-1)/mid;
            ans+=d;
        }
        return ans;


    }


    public int smallestDivisor(int[] nums, int threshold) {
        int low=1,high=Integer.MIN_VALUE;
        for(int i:nums){
            
            high=Math.max(i,high);
        }
        while(low<high){
            int mid=low+((high-low)/2);
            if(divided(nums,mid)<= threshold){
                high=mid;
            }
            else low=mid+1;
        }
        return high;
    }
}