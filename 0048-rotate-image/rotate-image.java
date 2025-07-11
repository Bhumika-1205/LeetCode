class Solution {
    public void rotate(int[][] arr) {
        transpose(arr);
        for (int[] n : arr) {
            reverse(n);
        }
    }

    static void transpose(int[][] arr){
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
    }

    static void reverse(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
    }
}
