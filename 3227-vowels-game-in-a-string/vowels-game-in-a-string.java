class Solution {
    static int vowelCount(String s){
        int count=0;
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
                count++;
            }
        }
        return count;
    }
    public boolean doesAliceWin(String s) {
        int count=vowelCount(s);
        if (count==0){
            return false;
        }
        return true;
    }
}
