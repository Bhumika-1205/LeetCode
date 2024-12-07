class Solution {
    public boolean isPerfectSquare(int num) {
        int pow=(int)Math.sqrt(num);
        if(pow*pow==num){
            return true;
        }
        return false;
    }
}
