class Solution {
    public int maxArea(int[] height) {
        int mostWater=0,left=0,right=height.length-1;
        while(left<right){
            mostWater=Math.max(mostWater,(right-left)*Math.min(height[left],height[right]));
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return mostWater;
    }
}
