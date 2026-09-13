class Solution {
    public static int possible (int[] arr,int max_units_per_person){
        int units_load=0,req_person=1;
        for(int i:arr){
            if(units_load+i <= max_units_per_person){
                units_load+=i;
            }
            else {
                units_load=i;
                req_person++;
            }
            
        }
        return req_person;

    }
    public int splitArray(int[] nums, int k) {
        int low=Integer.MIN_VALUE,high=0;
        for(int i:nums){
            high+=i;
            low=Math.max(low,i);

        }
        while(low<high){
            int mid=low+((high-low)/2);
            if(possible(nums,mid) <=k){
                high=mid;

            }
            else low=mid+1;
        }
        return high;
    }
}