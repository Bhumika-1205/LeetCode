class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row= matrix.length,col=matrix[0].length;
        if(row==1){
            return binarySearch(matrix,0,0,col-1,target);
        }
        int rStart=0,rEnd=row-1,cMid=col/2;
        while ((rEnd-rStart)>1){
            int rMid=rStart+(rEnd-rStart)/2;
            if(matrix[rMid][cMid]==target){
                return true;
            } else if (matrix[rMid][cMid]<target) {
                rStart=rMid;
            }
            else {
                rEnd=rMid;
            }
        }
        if(matrix[rStart][cMid]==target){
            return true;
        } else if (matrix[rEnd][cMid]==target) {
            return true;
        } else if (matrix[rStart][0]<=target && matrix[rStart][cMid]>target ) {
            return binarySearch(matrix,rStart,0,cMid-1,target);
        } else if (matrix[rStart][cMid]<target && matrix[rStart][col-1]>=target ) {
            return binarySearch(matrix,rStart,cMid+1,col-1,target);
        }
        else if (matrix[rEnd][0]<=target && matrix[rEnd][cMid]>target ) {
            return binarySearch(matrix,rEnd,0,cMid-1,target);
        }
        return binarySearch(matrix,rEnd,cMid+1,col-1,target);
    }
   static boolean binarySearch(int[][] matrix,int row,int start,int end,int target){
        while (start<=end){
            int mid=start+(end-start)/2;
            if (matrix[row][mid]==target){
                return true;
            }
            else if(matrix[row][mid]>target){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return false;
    } 
}
