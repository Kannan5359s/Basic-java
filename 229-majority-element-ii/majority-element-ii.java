class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> arr=new ArrayList<>();
        
        int c1=0;
        int c2=0;
        int ele1=0;
        int ele2=0;
        for(int i=0;i<nums.length;i++){
            if(c1==0 && nums[i]!= ele2){
                c1=1;
                ele1=nums[i];
            }
            else if(c2==0 && nums[i]!=ele1){
                c2=1;
                ele2=nums[i];
            }
            else if(ele1==nums[i] ) c1++;
            else if(ele2==nums[i] ) c2++;
            else {
                c1--;
                c2--;
            }
        }
        int ct1=0;
        int ct2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele1) ct1++;
            else if(nums[i]==ele2) ct2++;
        }
        if(ct1>nums.length/3) arr.add(ele1);
        if(ct2>nums.length/3) arr.add(ele2);
        return arr;
        
    }
}