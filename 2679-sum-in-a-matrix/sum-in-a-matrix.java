class Solution {
    public int matrixSum(int[][] nums) {
        int score=0,i=0;
        while (i<nums[0].length){
            int max=0;
            for (int j = 0; j < nums.length; j++) {

                max=Math.max(max,findMax(nums[j]));
            }
            score+=max;
            i++;
        }
        return score;
    }
    static int findMax(int[] arr){
        int max=0;
        for (int i =0;i<arr.length;i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        int index=arr[max];
        arr[max]=Integer.MIN_VALUE;
        return index;
    }
}
