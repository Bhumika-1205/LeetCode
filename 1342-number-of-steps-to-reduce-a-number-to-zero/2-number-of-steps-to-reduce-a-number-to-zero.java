class Solution {
    public int numberOfSteps(int num) {
       return help(num,0);
    }

    private static int help(int num,int steps){
        if(num==0){
            return steps;
        }
        if((num&1)==0){
            return help(num/2,steps+1);
        }
        return help(num-1,steps+1);
    }
}
