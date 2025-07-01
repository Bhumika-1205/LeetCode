class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0,sum=0,mn=Integer.MAX_VALUE;
        while (j< nums.length){
            sum+=nums[j];
            if (sum>=target){
                mn=Math.min(mn,j-i+1);
                while (sum>=target){
                    sum-=nums[i];
                    if (sum>=target){
                        mn=Math.min(mn,j-i);
                    }
                    i++;
                }
            }
            j++;
        }if (mn==Integer.MAX_VALUE){
            return 0;
        }
        return mn;
    }
}
