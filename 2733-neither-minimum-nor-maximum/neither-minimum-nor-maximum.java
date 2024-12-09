class Solution {
    public int findNonMinOrMax(int[] nums) {
         Arrays.sort(nums);
        if(nums.length<3){
            return -1;
        }
        return nums[(0+ nums.length)/2];
    }
}
