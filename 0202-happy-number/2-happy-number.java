class Solution {
    public boolean isHappy(int n) {
        int fast=n,slow=n;
        do{
            fast=digitSquare(digitSquare(fast));
            slow=digitSquare(slow);
        }while(slow!=fast);
        if(slow==1){
            return true;
        }
        return false;
    }

    public static int digitSquare(int n){
        int sum=0;
        while(n!=0){
            sum+=(n%10)*(n%10);
            n/=10;
        }
        return sum;
    }
}
