class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length;
        float[] arr=new float[n+m];
        for(int i=0;i<n;i++){
            arr[i]=nums1[i];
        }
        for(int i=n;i<n+m;i++){
            arr[i]=nums2[i-n];
        }
        Arrays.sort(arr);
        if(arr.length%2==1){
            return arr[arr.length/2];
        }
        int x=arr.length/2;
        return (arr[x]+arr[x-1])/2;
    }
}
