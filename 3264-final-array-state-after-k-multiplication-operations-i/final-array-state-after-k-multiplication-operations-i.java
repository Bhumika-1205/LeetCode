class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
         while (k>0){
            nums[findIndexMinimum(nums)]*=multiplier;
            k--;
        }
        return nums;
    }
    static int findIndexMinimum(int[] arr){
        int min=0;
        for (int i=1;i< arr.length;i++){
            if(arr[min]>arr[i]){
                min=i;
            }
        }
        return min;
    }
    
}
