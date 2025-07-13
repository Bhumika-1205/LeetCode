class Solution {
    public int majorityElement(int[] nums) {
        int maxCount=0,maxElement=0;
        for (int i = 0; i < nums.length; i++) {
            if(maxCount==0){
                maxCount++;
                maxElement=nums[i];
            }
            else if(maxElement==nums[i]){
                maxCount++;
            }
            else{
                maxCount--;
            }
        }
        maxCount=0;
        for (int num:nums) {
            if(num==maxElement){
                maxCount++;
            }
        }
        if(maxCount>nums.length/2){
            return maxElement;
        }
        return -1;
    }
}
