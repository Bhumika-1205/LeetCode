class Solution {
    public int countOperations(int num1, int num2) {
        if(num1==0 || num2==0){
            return 0;
        }
        int count=1;
        while(num1!=num2){
            count++;
            int temp=Math.min(num1,num2);
            num1=Math.max(num1,num2)-temp;
            num2=temp;
        }
        return count;
    }

}
