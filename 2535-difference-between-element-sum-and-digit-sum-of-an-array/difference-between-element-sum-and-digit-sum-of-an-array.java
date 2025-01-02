class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1=0,sum2=0;
        for (int i:nums) {
            sum1+=i;
            sum2+=digitSum(i);
        }
        return Math.abs(sum1-sum2);
    }
    static int digitSum(int a){
        int sum=0;
        while (a!=0){
            sum+=a%10;
            a=a/10;
        }
        return sum;
    }
}
