class Solution {
    public int countNegatives(int[][] grid) {
         int negatives=0;
        for (int i = 0; i < grid.length; i++) {
            negatives+=findNegatives(grid[i]);
        }
        return negatives;
    }

    static int findNegatives(int[] arr){
        int start=0,end= arr.length-1,count=0;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<0){
                count+= end-mid+1;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return count;
    }


}
