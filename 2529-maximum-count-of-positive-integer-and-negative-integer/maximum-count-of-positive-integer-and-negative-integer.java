class Solution {
    public int maximumCount(int[] nums) {
        return Math.max(lowerBound(nums),upperBound(nums));
    }

    static int lowerBound(int[] arr){
        int start=0,end= arr.length-1,count=0;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>=0){
                end=mid-1;
            }
            else{
                count+=mid-start+1;
                start=mid+1;
            }
        }
        return count;
    }

    static int upperBound(int[] arr){
        int start=0,end= arr.length-1,count=0;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<=0){
                start=mid+1;
            }
            else{
                count+=end-mid+1;
                end=mid-1;
            }
        }
        return count;
    }
}
