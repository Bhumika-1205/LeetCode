class Solution {
    public List<Integer> getRow(int n) {
        List<Integer> l=new ArrayList<>();
        long preValue=1;
        l.add(1);
        for (int i = 1; i <=n; i++) {
            long nextValue=preValue*(n-i+1)/i;
            l.add((int)nextValue);
            preValue=nextValue;
        }
        return l;
    }
}
