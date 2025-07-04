class Solution {
    public boolean doesAliceWin(String s) {
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            switch(ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                return true;
            }
        }
        return false;
    }
}
