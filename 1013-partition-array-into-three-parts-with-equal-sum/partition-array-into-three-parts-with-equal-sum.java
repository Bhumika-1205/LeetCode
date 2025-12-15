class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int[] res={-1,-1};
        int resIdx=0;
        int totalSum=0;
        int n= arr.length;
        for (int num:arr){
            totalSum+=num;
        }
        if (totalSum%3!=0) return false;

        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            if (sum==totalSum/3){
                res[resIdx++]=i;
                sum=0;

                if (resIdx==2 && i<n-1){
                    return true;
                }
            }
        }
        return false;
    }
}
