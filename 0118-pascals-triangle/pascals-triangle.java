class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l=new ArrayList<>();
        for (int i = 0; i <numRows; i++) {
            List<Integer> insideList=nthRowPascalTriangle(i);
            l.add(insideList);
        }
        return l;
    }

     static List<Integer> nthRowPascalTriangle(int n){
        List<Integer> l=new ArrayList<>();
        for (int i = 0; i <=n; i++) {
            l.add(nCr(n,i));
        }
        return l;
    }

    static int nCr(int n,int r){
        int result=1;
        for (int i = 0; i < r; i++) {
            result*=n-i;
            result/=i+1;
        }
        return result;
    }
}
