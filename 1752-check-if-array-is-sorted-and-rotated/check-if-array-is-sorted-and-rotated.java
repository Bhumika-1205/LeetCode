class Solution {
    public boolean check(int[] nums) {
        boolean pivot=false;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]>nums[i+1]){
                if(!pivot){
                    pivot=true;
                }
                else {
                    return false;
                }
            }

        }
        if (pivot && nums[nums.length-1]>nums[0]){
            return false;
        }
        return true;
    }
}
