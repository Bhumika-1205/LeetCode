class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length,element=m*n,x=element;
        int top=0,left=0,bottom=m-1,right=n-1;
        List<Integer> l=new ArrayList<>();
        while (element!=0){
            for (int i=left;i<=right;i++){

                l.add(matrix[top][i]);
                element--;
            }
            top++;
            if(element!=0) {
                for (int i = top; i <= bottom; i++) {
    
                    l.add(matrix[i][right]);
                    element--;
                }
            }
            right--;
            if(element!=0) {
                for (int i = right; i >= left; i--) {

                    l.add(matrix[bottom][i]);
                    element--;
                }
            }
            bottom--;
            if(element!=0) {
                for (int i = bottom; i >= top; i--) {

                    l.add(matrix[i][left]);
                    element--;
                }
            }
            left++;
        }
        return l;
    }
}
