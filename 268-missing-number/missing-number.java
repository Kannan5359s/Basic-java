class Solution {
    public int missingNumber(int[] nums) {
        int m=nums[0];
        int s=0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            if(m<nums[i] ) m=nums[i];
        }
        int n=nums.length*(nums.length+1)/2;
        return n-s;
        
        
    }
}