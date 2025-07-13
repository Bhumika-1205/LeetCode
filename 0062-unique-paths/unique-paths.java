class Solution {
    public int uniquePaths(int m, int n) {
        return combination(m+n-2,Integer.max(m,n)-1);
    }
    static int combination(int n,int r){
        long result=1;
        for (int i = 0; i < n-r; i++) {
            result*=n-i;
            result/=i+1;
        }
        return (int)result;
    }

}
