class Solution {
    public int maxArea(int[] height) {
        int mostWater=0,left=0,right=height.length-1,water;
        while(left<right){
            water=Math.min(height[left],height[right])*(right-left);
            mostWater=Math.max(water,mostWater);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return mostWater;
    }
}
