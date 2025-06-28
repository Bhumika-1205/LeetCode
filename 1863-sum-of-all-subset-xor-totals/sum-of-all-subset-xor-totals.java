class Solution {
    public int subsetXORSum(int[] nums) {
        int n=nums.length-1,allXOR=0;
        for(int num:nums){
            allXOR|=num;
        }
        return allXOR*(1<<n);
    }
}
