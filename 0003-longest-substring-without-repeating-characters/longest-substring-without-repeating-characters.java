class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0,maxLength=0;
        String subStr="";
        while (right<s.length()){
            char ch=s.charAt(right);
            if(!subStr.contains(Character.toString(ch))){
                subStr+=ch;
            }
            else {
                int idx=subStr.indexOf(ch);
                subStr=s.substring(idx+left+1,right+1);
                left=idx+left+1;
            }
            right++;
            maxLength=Math.max(maxLength,subStr.length());
        }
        return maxLength;
    }
}
