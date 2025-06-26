class Solution {
    public void sortColors(int[] nums) {
      int zerosCount=0,onesCount=0,twosCount=0;
        for (int num:nums) {
            if(num==0){
                zerosCount++;
            } else if (num==1) {
                onesCount++;
            }else{
                twosCount++;
            }
        }

        for (int i = 0; i <zerosCount; i++) {
            nums[i]=0;
        }
        for (int i = zerosCount; i < zerosCount+onesCount; i++) {
            nums[i]=1;
        }
        for (int i = onesCount+zerosCount; i < nums.length; i++) {
            nums[i]=2;
        }   
    }
}
