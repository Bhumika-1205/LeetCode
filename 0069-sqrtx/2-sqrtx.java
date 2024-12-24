class Solution {
    public int mySqrt(int x) {
      if(x==1) return x;
        int low=2,high=x/2;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(mid*mid==x){
                return mid;
            }
            else if((long)mid*mid<(long)x){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return high;
    }
}
