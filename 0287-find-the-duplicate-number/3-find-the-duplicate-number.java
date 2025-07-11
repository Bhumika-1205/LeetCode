class Solution {
    public int findDuplicate(int[] nums) {
        int[] ans=new int[nums.length+1];
        for (int num:nums){
            if(ans[num]==1){
                return num;
            }else{
                ans[num]=1;
            }
        }
        return -1;
    }
}
