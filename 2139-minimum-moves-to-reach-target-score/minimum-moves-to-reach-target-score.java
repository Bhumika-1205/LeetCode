class Solution {
    public int minMoves(int target, int maxDoubles) {
        if(maxDoubles==0){
            return target-1;
        }
        int count=0;
        while(target>1){
            count++;
            if((target&1)==0 && maxDoubles>0){
                target/=2;
                maxDoubles--;
            }
            else{
                target--;
            }
        }
        return count;
    }
}
