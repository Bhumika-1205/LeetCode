class Solution {
    static boolean selfDivide(int num){
        int n=num;
        while(n!=0){
            int a=n%10;
            if(a==0){
                return false;
            }
            if(num%a!=0){
                return false;
            }
            n=n/10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l1=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(selfDivide(i)){
                l1.add(i);
            }
        }
        return l1;
    }
}
