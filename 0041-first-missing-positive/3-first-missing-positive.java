class Solution {
    public int firstMissingPositive(int[] nums) {
       for (int i = 0; i < nums.length; i++) {
            int correct=nums[i]-1;
            if(nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[correct]){
                nums[i]=nums[correct];
                nums[correct]=correct+1;
                i--;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }        
}
