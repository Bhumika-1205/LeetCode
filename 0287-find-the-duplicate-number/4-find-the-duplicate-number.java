class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] ans=new boolean[nums.length-1];

        for(int num:nums){
            if(!ans[num-1]) ans[num-1]=true;
            else return num;
        }
        return -1;
    }
}
