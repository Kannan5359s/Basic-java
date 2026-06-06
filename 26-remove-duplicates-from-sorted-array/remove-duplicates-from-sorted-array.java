class Solution {
    public int removeDuplicates(int[] nums) {
        int d=0;
        for (int i=1;i<nums.length;i++){
            if(nums[d ] !=nums[i]) {
                d++;
                nums[d]=nums[i];
            }
        }
        return d+1;
    }
}