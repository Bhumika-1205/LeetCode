class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxSum=sumRows(accounts[0]);
        for(int row=1;row<accounts.length;row++){
            int x=sumRows(accounts[row]);
            if(maxSum<x){
                maxSum=x;
            }
        }
        return maxSum;
    }
    static int sumRows(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
