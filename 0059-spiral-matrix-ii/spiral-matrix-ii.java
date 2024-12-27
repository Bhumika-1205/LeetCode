class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int top=0,bottom=n-1,left=0,right=n-1,x=1;
        while (x<=n*n){
            for (int i=left;i<=right;i++){
                arr[top][i]=x++;
            }
            top++;
            if (x<=n*n){
                for (int i=top;i<=bottom;i++){
                    arr[i][right]=x++;
                }
                right--;
            }
            if (x<=n*n){
                for (int i=right;i>=left;i--){
                    arr[bottom][i]=x++;
                }
                bottom--;
            }
            if (x<=n*n){
                for (int i=bottom;i>=top;i--){
                    arr[i][left]=x++;
                }
                left++;
            }
        }
        return arr;
    }
}
