class Solution {
    public boolean containsDuplicate(int[] nums) {
        int i=0;
        Arrays.sort(nums);
        for(int j=1;j<nums.length;j++){
            if(nums[i] == nums[j]){
                return true;
            }
            i++;
        }
        return false;
        
    }
}