class Solution {
    public int splitArray(int[] nums, int k) {
        int start=0,end=0;
        for(int i:nums){
            start=Math.max(start,i);
            end+=i;
        }
        while (start<=end){
            int mid=start+(end-start)/2;
            int sum=0,pieces=1;
            for (int i:nums) {
                if (sum+i>mid){
                    sum=i;
                    pieces++;
                }
                else {
                    sum+=i;
                }
            }
            if (pieces<=k){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return start;
    }
}
