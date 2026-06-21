class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }

    static void mergeSort(int[] arr,int low,int high){
        if(low>=high)  return;

        int mid=low+(high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    static void merge(int[] arr,int low,int mid,int high){
        int[] temp=new int[high-low+1];
        int i=low,j=mid+1,k=0;

        while(i<=mid && j<=high){
            temp[k++]=arr[i]<arr[j]? arr[i++]: arr[j++];
        }
        while(i<=mid) temp[k++]=arr[i++];
        while(j<=high) temp[k++]=arr[j++];

        for(i=low;i<=high;i++){
            arr[i]=temp[i-low];
        }
    }
}
