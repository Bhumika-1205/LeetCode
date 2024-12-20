class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
         int n=image.length;
        for (int i=0;i<n;i++){
            reverse(image[i]);

        }
        for (int i=0;i<n;i++){
            for (int j = 0; j < n; j++) {
                if(image[i][j]==0) image[i][j]=1;
                else image[i][j]=0;
            }
        }
        return image;
    }
    static void reverse(int[] arr){
        int i=0,j= arr.length-1;
        while (i<j){
            int temp=arr[i];
            arr[i++]=arr[j];
            arr[j--]=temp;
        }
    }
}
