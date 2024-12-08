class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleSum=0,doubleSum=0;
        for (int i = 0; i < nums.length; i++) {
            if(digit(nums[i])==1){
                singleSum+=nums[i];
            } else if (digit(nums[i])==2) {
                doubleSum+=nums[i];
            }
            else {
                return false;
            }
        }
        if (singleSum==doubleSum){
            return false;
        }
        return true;
    }
     static int digit(int num){
        return (int)Math.log10(num)+1;
    }
}
