class Solution {
    public int countOperations(int num1, int num2) {
        // while(num1!=0 || num2!=0){
        //     count++;
            
        // }
        return helper(num1,num2,0);
    }
    private static int helper(int num1,int num2,int count){
        if(num1==0 || num2==0){
            return count;
        }
        return helper(Math.max(num1,num2)-Math.min(num1,num2),Math.min(num1,num2),count+1);
    }
}
