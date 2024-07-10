class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int j=0;
            boolean flag=true;
            for(int k=i;k<i+needle.length();k++){
                if(haystack.charAt(k)!=needle.charAt(j)){
                    flag=false;
                    break;
                }
                j++;
            }
            if(flag) {
                return i;
            }
        }
        return -1;
    }
}
