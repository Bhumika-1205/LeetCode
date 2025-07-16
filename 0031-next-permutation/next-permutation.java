class Solution {
    public void nextPermutation(int[] nums) {
        int breakPoint=-1;
        for (int i = nums.length-2; i >=0; i--) {
            if(nums[i]<nums[i+1]){
                breakPoint=i;
                break;
            }
        }

        if (breakPoint==-1){
            reverse(nums,0);
            return;
        }

        int smaller=breakPoint;
        for (int i = nums.length-1; i>breakPoint ; i--) {
            if(nums[i]>nums[breakPoint]){
                smaller=i;
                break;
            }
        }

        int temp=nums[smaller];
        nums[smaller]=nums[breakPoint];
        nums[breakPoint]=temp;

        reverse(nums,breakPoint+1);
    }

    static void reverse(int[] nums,int start){
        int end=nums.length-1;
        int mid=start+(end-start)/2;

        for (int i = start; i <=mid; i++) {
            int temp=nums[i];
            nums[i]=nums[end-i+start];
            nums[end-i+start]=temp;
        }
    }
}
