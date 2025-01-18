class Solution {
    public int singleNumber(int[] nums) {
        int unique=0,i=0;
        while(i<nums.length){
            unique^=nums[i++];
        }
        return unique;
    }
}
