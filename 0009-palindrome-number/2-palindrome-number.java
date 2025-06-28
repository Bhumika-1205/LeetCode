class Solution {
    public boolean isPalindrome(int x) {
        int newNum=0,ogNum=x;
        while(x>0){
            newNum=newNum*10+x%10;
            x/=10;
        }
        if(newNum==ogNum){
            return true;
        }
        return false;
    }
}
