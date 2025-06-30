class Solution {
    public int maxProduct(int[] nums) {
        int res=Integer.MIN_VALUE;
        for(int num:nums){
            res=Math.max(res,num);
        }

        int curMin=1,curMax=1;
        for(int n:nums){
            int temp=curMax*n;
            curMax=Math.max(temp,Math.max(curMin*n,n));
            curMin=Math.min(temp,Math.min(curMin*n,n));

            res=Math.max(res,curMax);
        }
        return res;
    }
}
