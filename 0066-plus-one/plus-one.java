class Solution {
    public int[] plusOne(int[] digits) {
        int i=digits.length-1;
        int a=digits[i];
        if(a==9){
            int j=i-1;
            while(j>-1 && digits[j]==9){
                j--;
            }
            if(j==-1){
                int[] ans=new int[i+2];
                ans[0]=1;
                return ans;
            }
            else{
                int[] ans=new int[i+1];
                for(int k=0;k<=j;k++){
                    if(k==j){
                        ans[j]=digits[j]+1;
                    }
                    else{
                        ans[k]=digits[k];
                    }
                }
                return ans;
            }
        }
        digits[i]++;
        return digits;
    }
}
