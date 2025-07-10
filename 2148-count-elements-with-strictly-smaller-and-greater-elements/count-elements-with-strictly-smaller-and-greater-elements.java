class Solution {
    public int countElements(int[] nums) {
        int count=0;
        int minValue=Integer.MAX_VALUE,maxValue=Integer.MIN_VALUE;
        for (int num:nums){
            maxValue=Integer.max(maxValue,num);
            minValue=Integer.min(minValue,num);
        }

        for (int num:nums){
            if (num!=maxValue && num!=minValue){
                count++;
            }
        }
        return count;
    }
}
