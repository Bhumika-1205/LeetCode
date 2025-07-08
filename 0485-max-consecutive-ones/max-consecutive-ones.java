class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,c=0;
        for (int num:nums){
            if(num==1){
                count++;
            }else{
                c=Integer.max(c,count);
                count=0;
            }
        }
        return Integer.max(c,count);
    }
}
