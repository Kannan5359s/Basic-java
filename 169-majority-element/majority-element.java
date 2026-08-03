class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int ele=0;
        for(int i=0;i<nums.length;i++){
            if(c<=0){
                c=1;
                ele=nums[i];
            }
            else if(nums[i]==ele){
                c++;
            }
            else {
                c--;
            }
        }
        int c1=0;
        for(int i=0;i<nums.length;i++){
            if(ele==nums[i]){
                c1++;
            }

        }
        if(c1>nums.length/2) return ele;
        return -1;
    }
}