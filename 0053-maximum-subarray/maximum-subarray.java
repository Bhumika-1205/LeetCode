class Solution {
    public int maxSubArray(int[] arr) {
        boolean allNegative=true;
        int minValue=arr[0];
        for(int num:arr){
            if (num>0){
                allNegative=false;
                break;
            }
            else{
                minValue=Math.max(minValue,num);
            }
        }
        if(allNegative){
            return minValue;
        }
       int i=0,sum=0,s=0;
        while(i< arr.length){
            if(sum+arr[i]<0){
                sum=0;
            }
            else{
                sum+=arr[i];
            }
            s=Math.max(s,sum);
            i++;
        }
        return s;
    }
}
