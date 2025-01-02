class Solution {
    public int matrixSum(int[][] nums) {
        for (int[] i:nums){
            Arrays.sort(i);
        }
        int score=0,i=0;
        while (i<nums[0].length){
            int max=0;
            for (int j = 0; j < nums.length; j++) {

                max=Math.max(max,nums[j][i]);
            }
            score+=max;
            i++;
        }
        return score;
    }
    
}
