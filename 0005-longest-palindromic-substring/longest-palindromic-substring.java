class Solution {
    static boolean checkPalindrome(String s,int i,int j){
        for (int k = i; k <=(j+i)/2 ; k++) {
            if(s.charAt(k)!=s.charAt(j+i-k)){
                return false;
            }
        }
        return true;
    }

    public String longestPalindrome(String s){
        String sub="";
        int left=0;
        while (left<s.length()){
            int right=s.length()-1;
            while (right>=left){
                if(right-left+1>sub.length() && checkPalindrome(s,left,right)){
                    sub=s.substring(left,right+1);
                }
                right--;
            }
            left++;
        }
        return sub;
    }
}
