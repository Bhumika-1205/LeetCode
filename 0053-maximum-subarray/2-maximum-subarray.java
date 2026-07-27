class Solution {
    public int maxSubArray(int[] arr) {
        int i=0,sum=arr[0],s=0;
        while(i< arr.length){
            if(s<0){
                s=0;
            }
            s+=arr[i];
            sum=Math.max(s,sum);
            i++;
        }
        return sum;
    }
}
