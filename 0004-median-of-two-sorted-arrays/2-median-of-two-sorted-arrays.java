class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m= nums1.length,n=nums2.length;
        if (m==0){
            if(n%2==0){
                return (double)(nums2[n/2]+nums2[(n/2)-1])/2;
            }
            return nums2[n/2];
        }
        else if(n==0){
            if(m%2==0){
                return (double)(nums1[m/2]+nums1[m/2-1])/2;
            }
            return nums1[m/2];
        }
        int[] arr=new int[n+m];
        int i=0,j=0,k=0;
        while (i< nums1.length && j< nums2.length){
            if (nums1[i]<=nums2[j]){
                arr[k]=nums1[i];
                i++;
            }
            else{
                arr[k]=nums2[j];
                j++;
            }
            k++;
        }
        while (i< nums1.length && k<arr.length){
            arr[k]=nums1[i++];
            k++;
        }
        while (j< nums2.length && k<arr.length){
            arr[k]=nums2[j++];
            k++;
        }
        int mid= arr.length/2;
        if (arr.length%2==0){
            return (double) (arr[mid]+arr[mid-1])/2 ;
        }
        return arr[mid];
    }
}
