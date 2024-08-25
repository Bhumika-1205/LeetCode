class Solution {
    static void swap(int[] arr,int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
    public void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]==0){
                    swap(nums,j,j+1);
                }
            }
            
        }
    }
}
