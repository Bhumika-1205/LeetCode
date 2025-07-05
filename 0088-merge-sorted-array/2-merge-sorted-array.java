class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr=new int[m+n];
        if (n==0){
            return;
        }
        int i=0,j=0,k=0;
        while (i<m && j<n){
            if (nums1[i]>nums2[j]){
                arr[k]=nums2[j];
                j++;
            }
            else{
                arr[k]=nums1[i];
                i++;
            }
            k++;
        }
        while (i<m){
            arr[k]=nums1[i++];
            k++;
        }
        while (j<n){
            arr[k]=nums2[j++];
            k++;
        }
        for (int l = 0; l < m+n; l++) {
            nums1[l]=arr[l];
        }
    }
}
