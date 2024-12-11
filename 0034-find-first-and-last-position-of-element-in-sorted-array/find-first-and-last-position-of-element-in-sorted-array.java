class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums==null) {
            return new int[]{-1,-1};
        }
        int start=0,end=nums.length-1;
        while (start<=end){
            if(nums[start]==target && nums[end]==target){
                return new int[]{start,end};
            }
            else if(nums[start]!=target && nums[end]!=target){
                start++;
                end--;
            }
            else if(nums[start]==target && nums[end]!=target){
                end--;
            }
            else {
                start++;
            }
        }
        return new int[]{-1,-1};
    }
}
